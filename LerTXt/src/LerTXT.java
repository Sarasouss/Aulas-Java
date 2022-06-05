import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerTXT {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"))){
		// BufferedReader serve para ler o arquivo escolhido
			String line;
			String string = "";
			// String onde a informacao sera guardada
			while((line = reader.readLine())!= null) {
				string += line + "\n";
			// a string vai receber tudo ate que o txt esteja null ou seja coma linha vazia
			}
			 System.out.println(string);
			 //visualizacao da informacao
		}

	
	}

}
