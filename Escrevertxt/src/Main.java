import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String s =  "Texto para ser Gravado";
// criando a variavel com o valor que sera escrito
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
// Chamando o metodo da escrita e nomeando o txt		
		escrever.write(s);
// executando o que sera escrito
		}
	}

}
