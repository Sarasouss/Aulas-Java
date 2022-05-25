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
		
		

		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("mensagem.txt"))){
			
		System.out.println("Digite sua mensagem ");
			mensagem = entrada.nextLine();
			escrever.write(mensagem);	
			
		}
	try(BufferedReader reader = new BufferedReader(new FileReader("mensagem.txt"))){
			
			String line;
			String string = "";
			
			while((line = reader.readLine())!= null) {
				string += line + "\n";
						
			}
			 System.out.println(string);
		
		
	}

	
	}	
	}


