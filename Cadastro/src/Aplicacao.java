import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
//		Primeiro chama o scanner para poder digitar as informacoes
		List<Pessoa> Cadastro = new ArrayList<Pessoa>();
//		Depois cria uma lista pra poder colocar todos os cadastos
		for (int x = 0; x < 4; x++) {
			Pessoa pessoa = new Pessoa(1);
			System.out.println("Digite seu nome");
			pessoa.setNome(entrada.next());
			System.out.println("Digite sua idade");
			pessoa.setIdade(entrada.next());
			System.out.println("Digite seu G�nero 1-Feminino 2-Masculino");
			pessoa.sexoNum(entrada.nextInt());
			pessoa.setEndereco(new Endereco(1));
			System.out.println("Digite sua Rua");
			pessoa.getEndereco().setRua(entrada.next());
			System.out.println("Digite o n�mero da sua casa");
			pessoa.getEndereco().setNum(entrada.next());
			System.out.println("Digite seu Bairro");
			pessoa.getEndereco().setBairro(entrada.next());
			Cadastro.add(pessoa);
		}
//		Aqui todas as informa�oes foram adicionadas a lista

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Pessoa.txt", true))) {
			for (Pessoa pessoa : Cadastro) {
				escrever.write(pessoa.toString() + "\n");
			}
//		Criei o metodo escrever para criar um txt com os cadastros, e o true para nao subescrevelos 

			List<Pessoa> Cadastro2 = new ArrayList<Pessoa>();
//		Crio outra lista para receber os novos objetos vindos do txt
			try (BufferedReader reader = new BufferedReader(new FileReader("Pessoa.txt"))) {
				String line;
				while ((line = reader.readLine()) != null) {
					Pessoa pessoa = new Pessoa(line);
					Cadastro2.add(pessoa);
				}
//		Aqui pegamos todo o conteudo do txt, lemos e tranformamos em uma nova lista	

				for (Pessoa cadastro : Cadastro) {
				System.out.println(cadastro);
//		Mostramos o conteudo por partes na tela
				}

			}
		}
	}
}