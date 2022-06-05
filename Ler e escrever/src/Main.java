import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		String mensagem = "";
		// criando o objeto de scanner
		// e criano uma string onde ficara guardado a mensagem digitada
		

		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("mensagem.txt"))){
		//chamando o metodo escrever com a criacao do txt
		System.out.println("Digite sua mensagem ");
			mensagem = entrada.nextLine();
		//pedindo a digitacao da mensagem
			escrever.write(mensagem);	
		//guardando ela no txt
		}
	try(BufferedReader reader = new BufferedReader(new FileReader("mensagem.txt"))){
		// chamando o metodo leitura com o txt da escrita	
			String line;
			String string = "";
		//criando onde ela sera guardada	
			while((line = reader.readLine())!= null) {
		// a string vai receber tudo ate que o txt esteja null ou seja coma linha vazia
				string += line + "\n";
			// \n serve para pular linha quando mostrar na tela			
			}
			 System.out.println(string);
		// syso para mostrar conteúdo lido
		
	}

	
	}	
	}


