import java.util.Scanner;
//	Aqui utilizamos a importacao de biblioteca

public class Aplicacao {
//Sobrecarga: e a utilização de um mesmo nome em um metodo com funcoes diferentes
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Matematica matematica = new Matematica();
//		criando os objetos
		System.out.println("<---- Somar dois n�meros ---->");
		System.out.println("Digite o primeiro n�mero");
		int x = entrada.nextInt();
//		Reecebendo o valor de x
		System.out.println("Digite o segundo n�mero");
		int y = entrada.nextInt();
//		Recebendo o valor de y
		int soma = matematica.somar(x, y);
		System.out.println("O resultado � " + soma);
//		Primeira funcao de somar, no caso com int
		soma = matematica.somar(x, y);
		System.out.println("O resultado � " + soma);
//		segunda acao de somar podemos adicionar ate 3 numeros int
		double soma2 = matematica.somar(x, y);
		System.out.println("O resultado � " + soma2);
//		terceira acao de somar com numeros em double
	}

}
