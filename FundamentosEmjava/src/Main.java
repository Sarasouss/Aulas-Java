import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		int x = 100;
//		double y = 200;
//
//		int a = 0;
//		double b = 0;
//
//		short z = (short) 32768;
//
//		a = y; n�o � poss�vel fazer essa convers�o com casting impl�cito, pois a var�avel double possui um espa�o de mem�ria maior que a int
//		a = (int) y;  com casting explic�to � poss�vel converter, pois h� a declara��o dessa convers�o que assume a resposabilidade de perda de informa��o
//		b = x;* � poss�vel fazer convers�o com casting impl�cito quando a var�avel que ir� receber informa��o tem o tamanho menor que a que est� atribuindo

//		int IdadePessoa = 19;
//
//		System.out.println("Voc� tem " + IdadePessoa + " anos");
//
//		if (IdadePessoa < 18) { // if serve para fazer um teste para saber se a condi��o entre parenteses � verdadeira ou falsa, caso
//								// seja verdadeira seu c�digo � executado
//			System.out.println("Voc� n�o pode beber");
//		} else if (IdadePessoa < 60) { // caso seja falsa, com else if outro teste condicional � feito, caso seja
//										// verdadeiro seu c�digo � executado
//			System.out.println("Bora tomar uma!");
//		} else { // caso nenhum dos teste condicionais feitos funcione, � executado o que est�
//					// dentro de else
//			System.out.println("E a aposentadoria sai quando?");
//		}

//		int diasemana = 6;
//
//		switch (diasemana) { // usado para teste de conte�do, diferente do if else que testa condi��es que
//								// podem ser completamente distintas. � �til para valores pr� definidos como:
//								// dias da semana, meses do ano, esta��es do ano, etc
//		case 1: // case define que conte�do a vari�vel deve receber para executar o c�digo ap�s
//				// os dois pontos
//			System.out.println("Domingo");
//			break; // break faz com que o comando switch pare de rodar, sem ele todo c�digo depois
//					// dos dois pontos � considerado do case validado
//		case 2:
//			System.out.println("Segunda-feira");
//			break;
//		case 3:
//			System.out.println("Ter�a-feira");
//			break;
//		case 4:
//			System.out.println("Quarta-feira");
//			break;
//		case 5:
//			System.out.println("Quinta-feira");
//			break;
//		case 6:
//			System.out.println("Sexta-feira");
//			break;
//		case 7:
//			System.out.println("Sab�do");
//			break;
//		default: // outros casos, para valores de vari�vel que n�o tem um case
//			System.out.println("Esse n�mero n�o representa nenhum dia da semana!");
//
//		}

//		char caractere = 'C'; 
//		
//		switch(caractere) { 
//			case 'A':
//				System.out.println("Seu caractere � A");
//			break;
//			case 'B':
//				System.out.println("Seu caractere � B");
//			break;
//			case 'C':
//				System.out.println("Seu caractere � C");
//			break;
//			default:
//				System.out.println("Valor inv�lido");
//		}
//		la�os de repeti��o

//		int x = 0;
//
//		while (x < 10) { // repete a opera��o enquanto a condi��o for verdadeira, n�o se sabe quantas
//							// vezes ir� repetir
//			System.out.println(x);
//			x = x + 1;
//		}
//
//		x = 0;
//		do { // realiza a opera��o at� a condi��o for verdadeira
//			System.out.println(x);
//			x = x + 1;
//		} while (x < 10);

		// repete c�digo por uma quantidade de vezes j� determinada, nesse caso at� x
		// passar a ser maior de 11
//		System.out.println("Tabuada do 2");
//		for (int x = 0; x < 11; x++) { // dentro do for � poss�vel criar uma vari�vel de controle, que define quantas
//										// vezes o c�digo ser� repetido e como ela vai mudar de repeti��o para repeti��o
//			System.out.println(2 + " x " + x + " = " + x * 2);
//		}
//
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite a tabuada que deseja fazer:");
//
//		int y = entrada.nextInt();
//		System.out.println("Tabuada do " + y);
//
//		for (int x = 0; x < 11; x++) {
//			System.out.println(y + " x " + x + " = " + x * y);
//		}

		// c�digo longo para mostrar valor de tr�s vari�veis de mesmo tipo
//		int x = 5;
//		int y = 7;
//		int z = 3;
//
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		System.out.println();
//
//		// Cria��o de array para executar a mesma fun��o acima em menos linhas de
//		// c�digo:
//
//		// Cria��o de array/matriz, que � uma �nica vari�vel, com mais de um espa�o.
//		// Neste cria��o o valores j� est�o sendo atribuidos, caso sejam atribuidos ao
//		// longo do programa, deve-se criar o array de outra maneira
//		int x1[] = { 5, 7, 3 }; // 1� maneira de definir quantidade de espa�os: atribuindo valores dentro de
//								// colchetes, separados por v�rgula. Neste caso a quantidade de espa�os � 3.
//		for (int aux = 0; aux < x1.length; aux++) { // a vari�vel de controle "aux" serve para determinar que valor
//													// armazenado no array ser� utilizado a partir do indice. aux=indice
//			System.out.println(x1[aux]);
//		}
//
//		// Exemplo de array de uma vari�vel do tipo String:
//		String nome[] = { "Beatriz", "Angelina", "Joelma", "Kau�", "Geovanna" }; // array do tipo String com 5 espa�os
//
//		for (int aux = 0; aux < nome.length; aux++) {
//			System.out.println("O indice de " + nome[aux] + " � " + aux); //String para demonstrar o indice de cada valor guardado no array
//		}

		// Cria��o de arrays sem atribui��o direta de valores, definindo seus tamanhos
		// pelo indice:
//		int[] x2 = new int[5]; // array que pode receber at� 5 valores do tipo inteiro
//		String[] nome1 = new String[4]; // array que pode receber at� 4 valores do tipo String
//		double[] arrayDouble = new double[10]; // array que pode receber at� 10 valores do tipo double
//
//		x2[4] = 6; // atribui��o do n�mero 6 no espa�o de indice 4 dentro da vari�vel x2

//		int[] numero = new int[6];
//		Scanner teclado = new Scanner(System.in);
//
//		for (int x = 0; x < numero.length; x++) {
//			System.out.println("Digite um n�mero aleat�rio:");
//			numero[x] = teclado.nextInt(); // atribui��o de valor � vari�vel x, para cada indice
//		}
//
//		for (int x = 0; x < numero.length; x++) {
//			System.out.println("Indice " + x + " = " + numero[x]);
//		}

		// criando um array do tipo Object, nele � poss�vel guardar qualquer tipo de
		// valor, visto que Object � a superclasse de todas as outras classes no java
//		int[] arrayQualquer = new int[3]; // arrays precisam ser instanciados, caracteristica que indica que os espa�os
//											// da matriz s�o construidos na mem�ria heap e na stack est�o apenas os
//											// endere�os desses espa�os
//		Object[] arrayObject = new Object[6];
//
//		arrayObject[0] = 12;
//		arrayObject[1] = "Beatriz";
//		arrayObject[2] = 13.8;
//		arrayObject[3] = true;
//		arrayObject[5] = arrayQualquer; // o array de tipo Object recebe qualquer valor, inclusive outro array. neste
//										// caso n�o foi especificado o valor de qual espa�o � para ser impresso na
//										// tela, ent�o o que � mostrado � o endere�o desse array
//
//		for (int x = 0; x < arrayObject.length; x++) {
//			System.out.println("Indice " + x + " = " + arrayObject[x]);
//		}

		// Arrays Bidirecional: que possui duas dire��es, linhas e colunas
		// constru��o de Array bidirecional:
		int[][] arrayBidirecional = new int[4][3]; // o primeiro colchetes determina a quantidade de linhas e o segundo
													// a quantidade de colunas
		arrayBidirecional[0][0] = 8;// para atribuir valores neste array basta indicar o indice de em qual linha o
									// valor vai ser encontrado e o indice de em qual coluna
		arrayBidirecional[2][1] = 7;// aqui o valor 7 inteiro est� localizado no espa�o do array na linha 2 e na
									// coluna 1, lembrando que os indices come�am em 0

		for (int linha = 0; linha < arrayBidirecional.length; linha++) { // for para contagem do primeiro indice
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) { // for para contagem o segundo
																					// indice, logo quando o indice da
																					// linha for 0, o da coluna roda at�
																					// atingir o maximo de colunas,
																					// assim interando a primeria linha
																					// do array e indo rodar a segunda
				System.out.print("Indice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " ");
			}
			System.out.println();
		}

	}

}
