import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException  {
	
		
		List<Sabonete> lista = new ArrayList<Sabonete>();
		
		Sabonete sabonete1 = new Sabonete("Flores", "Rosa");
		lista.add(sabonete1);
		
		Sabonete sabonete2 = new Sabonete("Amadeirado", "Marrom");
		lista.add(sabonete2);
		
		Sabonete sabonete3 = new Sabonete("Frutas Citricas", "Vermelho");
		lista.add(sabonete3);
		 			
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("sabonete.txt"))){
		
			for(Sabonete sabonete : lista)
				
		escrever.write(sabonete.toString());		
		}
	}

	
		
		
	}


