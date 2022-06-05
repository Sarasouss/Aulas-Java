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
//		a = (int)y;
		//Casting: o a nao consegue receber y por ser menor do que as informaca de y 
//		b = x; 
		// b recebe x por ter espaco sobrando 
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
		//if else criado para que se algo codiz com o parametro fazesse uma acao
		// se nao, fazesse outra
		
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
		
		// switch e utilizado para  situacoes onde temos diversas resposta/solucoes
		//por exemplo um menu
		// break e utilizado para quando o programa achar a resposta que desejamos
		// ele para ali, ou seja ele nao passara pelos outros casos
		
//		char caractere = 'c';
		
		// char recebe um unico caractere
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
		// default � o que sera realizado caso nenhum preencha os parametros pedidos
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
//	}	
//
//	int a=0;
//	
//	while(a<10) 
		//testa primeiro e depois executa
//	{
//		a =a+1;
//		System.out.println(a); 
//	}
		// while seria um metodo que enquanto o programa executar os parametros pedidos
		// ele continuara fazendo tal funcao
		
//	 a=0;
//	 do { 
//		 System.out.println(a);
//		 a=a+1;
		// instrucao a ser executada
		
//	 }while (a<10);
		
//	for(int b=0 ; b<10; b++) {
//		System.out.println(b);
//	}
		
		
//		for(int x=0; x <11; x++) {
//			System.out.println("2 x " + x + " = " + x*2 );
//		}	
//	Scanner entrada = new Scanner(System.in);
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
		//for e um comando para executar varias vezes o mesmo bloco de informacoes
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
		
//		int[] arrayQualquer = new int[3];
		// criando um array do tipo Object, nele e possivel guardar qualquer tipo de valor
		
		
//		Object[] arrayObject = new Object[6];
		// arrays precisam ser instanciados
		
//		arrayObject[0] = 12;
//		arrayObject[1] = "Sara";
//		arrayObject[2] = 13.8;
//		arrayObject[3] = true;
//		arrayObject[5] = arrayQualquer; 
		// o array de tipo Object recebe qualquer valor, inclusive outro array. 
//
//		for (int x = 0; x < arrayObject.length; x++) {
//			System.out.println("Indice " + x + " = " + arrayObject[x]);
//		}

		// Arrays Bidirecional: que possui duas direcoes , linhas e colunas
		
		int[][] arrayBidirecional = new int[4][3]; 
		// o primeiro colchetes determina a quantidade de linhas e o segundo
		// a quantidade de colunas
		arrayBidirecional[0][0] = 8;
		// para colocar valores no array basta indicar o indice de  qual linha e coluna
		// o valor vai ser inserido
		arrayBidirecional[2][1] = 7;


		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			// for para contar o primeiro indice
			
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) { 
			// assim que atingir o maximo de indici ele vai para o proximo
				
				System.out.print("Indice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " ");
			}
			//mostrando o resultado da array
			System.out.println();
		}
		
		
	}	
}
		
		
