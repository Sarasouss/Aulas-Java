import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List lista = new ArrayList(); // a interface list tem fun��o semelhante aos arrays, guardar mais de um valor
										// na mesma vari�vel, sua particularidade � que os met�dos dela implementados
										// permitem que ela se redimencione de acordo com o que for atribuido ao
										// longo do programa, diferente do array que uma vez atribuido seu tamanho, n�o
										// pode-se mudar. A classe que implementa List usada � a ArrayList e ambas s�o
										// do java e est�o uma biblioteca na JRE, logo devem ser importadas para serem
										// usadas

		lista.add("abc"); // o m�todo add de List, implementado por ArrayList, que recebe como par�metro
							// um valor do tipo Object, ou seja qualquer valor, tem como fun��o adicionar
							// novos valores � sua lista e consequentemente redimensionando ela, aumentando
							// seu tamanho para comportar os novos valores
		lista.add(12);
		lista.add(true);

//		for (int x = 0; x < lista.size(); x++) { // List � uma interface, logo n�o possui o atributo length como os
//													// objetos de tipo array, ent�o para determina��o de quando o for
//													// deve parar de rodar de acordo com seu tamanho, usa-se o m�todo
//													// size, que informa justamente qual tamanho atual da lista, at� a
//													// determinada situa��o do programa
//			System.out.println(lista.get(x)); // para capturar o valor usa-se o m�todo get, que nesse caso de List
//												// recebe como par�metro o indice de qual informa��o ser� capturada
//		}
		for (Object valor : lista) { // tipo de for usado para List e arrays unidimencionais, que com o ":" faz-se
										// todo processo do for acima e o guarda em uma vari�vel, como na lista List
			System.out.println(valor);
		}

		System.out.println();

		lista.remove(0);
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.add(0, "def");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.set(0, "ghi");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();

		lista.clear();
		if (lista.isEmpty()) {
			System.out.println("Sua lista est� vazia!");
		}

		Conta conta1 = new Conta("Luz", 100);
		Conta conta2 = new Conta("�gua", 80.65);

		List<Conta> listaDeContas = new ArrayList<Conta>();

		listaDeContas.add(conta1);
		listaDeContas.add(conta2);

		for (Conta conta : listaDeContas) {
			System.out.println(conta);
		}

	}

}
