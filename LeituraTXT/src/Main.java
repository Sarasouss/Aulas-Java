import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Sabonete> lista = new ArrayList<Sabonete>();
//		Primeiro cria a lista para receber os
//		metodos da Classe sabonete

		Sabonete sabonete1 = new Sabonete("Flores", "Rosa");
		Sabonete sabonete2 = new Sabonete("Amaderado ", " Marrom");
		Sabonete sabonete3 = new Sabonete("Frutas Citricas ", " Vermelho");
//		Depois adiciono os parametros do metodo Sabonete ex: cheiro e cor

		lista.add(sabonete1);
		lista.add(sabonete2);
		lista.add(sabonete3);
//		Depois coloco eles dentro da lista

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Sabonete.txt",true))) {
			for (Sabonete sabonete : lista) {
				escrever.write(sabonete.toString());
			}
		}
//		Já o true após o txt é para não subescrever o texto
//		Ja aqui transformaFmos todo o conteudo da lista em txt
//		com o metodo BufferedWriter e o for

		List<Sabonete> lista2 = new ArrayList<Sabonete>();
//		Depois criamos uma nova lista para receber o conteudo do txt que iremos ler 

		try (BufferedReader reader = new BufferedReader(new FileReader("Sabonete.txt"))) {
//		Criamos o metodo BufferredReader para ler o txt Sabonete 
			String line;
//		Criamos uma String para receber o conteudo lido	
			while ((line = reader.readLine()) != null) {
				Sabonete sabonete = new Sabonete(line);
				lista2.add(sabonete);
			}
//		Depois criamos um objeto sabonete  que recebe o que esta dentro de line
//		E depois adicionamos sabonete a lista
			for (Sabonete sabonete : lista2) {
				System.out.println(sabonete);
			}
//		O for foi feito para interagir com a lista, para poder mexer em uma variavel por vez.
//		Depois foi adicionado um syso para mostrar o conteudo de sabonete na tela

		}
	}
}
