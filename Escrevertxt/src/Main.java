import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String s =  "Texto para ser Gravado";
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
		
		escrever.write(s);		
		}
	}

}
