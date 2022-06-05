import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List lista = new ArrayList(); 
		
		// Criamos o objeto lista e seu construtor ArrayLista

		lista.add("abc"); 
		lista.add(true);
		// adicionamos valores a lista

//		for (int x = 0; x < lista.size(); x++) {

//		}
		// utilizamos esse metodo para saber o tamanho da lista
		for (Object valor : lista) { 
										
			System.out.println(valor);
		}
		 // uma forma mais simples de passar pelos valores da lista 
		
				System.out.println();

		lista.remove(0);
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();
		//Quando removermos um elemento ele nao ficara nulo

		lista.add(0, "def");// adiciona um valor a lista
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.set(0, "ghi");// defini um valor em posicao especifica
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.clear(); // apaga todos registros
		if (lista.isEmpty()) {
			System.out.println("Sua lista está vazia!");
		}

		Conta conta1 = new Conta("Luz", 100);
		Conta conta2 = new Conta("Água", 80.65);

		List<Conta> listaDeContas = new ArrayList<Conta>();
		// criamos uma lista com os metodos de conta
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		// adicionamos  conta1 e conta2 a lista

		for (Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		// imprime o que esta dentro da lista 

	}

}
