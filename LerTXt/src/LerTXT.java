import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerTXT {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"))){
			
			String line;
			String string = "";
			
			while((line = reader.readLine())!= null) {
				string += line + "\n";
						
			}
			 System.out.println(string);
		}

	
	}

}
