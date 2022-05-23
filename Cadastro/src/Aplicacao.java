import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao  {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		List<Pessoa> Cadastro = new  ArrayList<Pessoa>();
		
		for (int x = 0; x < 1 ; x++){
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite seu nome");
		pessoa.setNome(entrada.next());
		System.out.println("Digite sua idade");
		pessoa.setIdade(entrada.nextInt());
		System.out.println("Digite seu Gênero 1-Feminino 2-Masculino");
		pessoa.sexoNum(entrada.nextInt());
		
		pessoa.setEndereco(new Endereco());
		System.out.println("Digite sua Rua");
		pessoa.getEndereco().setRua(entrada.next());
		System.out.println("Digite o número da sua casa");
		pessoa.getEndereco().setNum(entrada.nextInt());
		System.out.println("Digite seu Bairro");
		pessoa.getEndereco().setBairro(entrada.next());
		Cadastro.add(pessoa);
		}
		
		for(Pessoa cadastro : Cadastro) {
			System.out.println(cadastro);                            
		
		}
	}
}
