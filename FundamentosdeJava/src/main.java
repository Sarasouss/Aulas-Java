import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
//		int x = 100;
//		double y = 200.3;
//
//		int a = 0;
//		double b = 0;
//		
//		short z = 10000; 
//		System.out.println(z);
//		
//		a = (int)y; //Casting: o a não consegue receber y por ser menor do que as informações de y 
//		b = x; // b recebe x por ter espaço sobrando 
//		
//		System.out.println(x);
//		System.out.println(y);
//
//		System.out.println(a);
//		System.out.println(b);
//		
//		int idadePessoa = 68;
//		
//		if(idadePessoa < 18) {
//			System.out.println("Voce não pode beber");
//		}
//		
//		else if (idadePessoa < 60) {
//			System.out.println("Bora tomar uma");
//			
//		}
//		else {
//			System.out.println("quanto é sua aposentadoria ?");
//		}
//		System.out.println("Você tem " + idadePessoa + " anos ");
//
//		int num = 8;
//		
//		switch (num) {
//			case 1:
//				System.out.println("Domingo");
//				break;
//			case 2:
//				System.out.println("Segunda-Feira");
//				break;
//			case 3:
//				System.out.println("Terça-Feira");
//				break;
//			case 4:
//				System.out.println("Quarta-Feira");
//				break;
//			case 5:
//				System.out.println("Quinta-Feira");
//				break;
//			case 6:
//				System.out.println("Sexta-Feira");
//				break;
//			case 7:
//				System.out.println("Sábado");
//				break;
//			default:
//				System.out.println("esse número não condiz com um dia da semana");
//			
//		}
//		
//		char caractere = 'c';
//
//		switch (caractere) {
//		case 'a':
//			System.out.println("Sua letra é a");
//			break;
//		case 'b':
//			System.out.println("Sua letraé b");
//			break;
//		default:
//			System.out.println("Valor invalido");
//	}
//		
//	String semaforo = "verde";
//	
//	switch (semaforo) {
//	case "verde" :
//		System.out.println("Pode prosseguir");
//		break;
//	case "amarelo":
//		System.out.println("Atenção");
//		break;
//	case "vermelho":
//		System.out.println("Pareeeeeee");
//		break;
//		
//		
//	
//	}	
//
//	int a=0;
//	
//	while(a<10) //testa primeiro e depois executa
//	{
//		a =a+1;
//		System.out.println(a); 
//	
//	}
//	
//	 a=0;
//	 do { //executa primeiro e depois testa
//		 System.out.println(a);
//		 a=a+1;
//	 }while (a<10);
//	for(int b=0 ; b<10; b++) {
//		System.out.println(b);
//	}
//		
//		for(int x=0; x <11; x++) {
//			System.out.println("2 x " + x + " = " + x*2 );
//		}	
//Scanner entrada = new Scanner(System.in);
//		
//		
//		System.out.println("Digite o número desejado");
//		int num = entrada.nextInt();
//		
//		for(int x=0; x <11; x++) {
//			System.out.println(num + "x " + x + " = " + x*num );
//		}	
		
		double x [] = { 3, 6, 8, };
		
		for(int aux = 0; aux < x.length; aux++) {
			System.out.println("valor do indice " + aux + " = " + x[aux]);
		}
		String nome[] = {"Sara", "Gustavo", "Laura"};
		for (int aux1 = 0; aux1 < nome.length; aux1++ ) {
			System.out.println(nome[aux1]);
		if (nome[aux1] == "Gustavo") {
			System.out.println("O indice de Gustavo é = " + aux1);
		}
		}
		
		int [] arrayInt = new int[5];
		
		arrayInt[3] = 4;
		
		int [] numero = new int[6];
		Scanner teclado = new Scanner(System.in);
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Digite um número qualquer");
			numero[aux2] = teclado.nextInt();
		}
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Indice " +aux2+" = " + numero[aux2]);
		}
		// criando um array do tipo Object, nele é possível guardar qualquer tipo de
		// valor, visto que Object é a superclasse de todas as outras classes no java
//		int[] arrayQualquer = new int[3]; // arrays precisam ser instanciados, caracteristica que indica que os espaços
//											// da matriz são construidos na memória heap e na stack estão apenas os
//											// endereços desses espaços
//		Object[] arrayObject = new Object[6];
//
//		arrayObject[0] = 12;
//		arrayObject[1] = "Beatriz";
//		arrayObject[2] = 13.8;
//		arrayObject[3] = true;
//		arrayObject[5] = arrayQualquer; // o array de tipo Object recebe qualquer valor, inclusive outro array. neste
//										// caso não foi especificado o valor de qual espaço é para ser impresso na
//										// tela, então o que é mostrado é o endereço desse array
//
//		for (int x = 0; x < arrayObject.length; x++) {
//			System.out.println("Indice " + x + " = " + arrayObject[x]);
//		}

		// Arrays Bidirecional: que possui duas direções, linhas e colunas
		// construção de Array bidirecional:
		int[][] arrayBidirecional = new int[4][3]; // o primeiro colchetes determina a quantidade de linhas e o segundo
													// a quantidade de colunas
		arrayBidirecional[0][0] = 8;// para atribuir valores neste array basta indicar o indice de em qual linha o
									// valor vai ser encontrado e o indice de em qual coluna
		arrayBidirecional[2][1] = 7;// aqui o valor 7 inteiro está localizado no espaço do array na linha 2 e na
									// coluna 1, lembrando que os indices começam em 0

		for (int linha = 0; linha < arrayBidirecional.length; linha++) { // for para contagem do primeiro indice
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) { // for para contagem o segundo
																					// indice, logo quando o indice da
																					// linha for 0, o da coluna roda até
																					// atingir o maximo de colunas,
																					// assim interando a primeria linha
																					// do array e indo rodar a segunda
				System.out.print("Indice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		
	}	
}
		
		
