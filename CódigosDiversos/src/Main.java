import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual n�mero voc� quer multiplicar? ");
// chamasse um scanner para receber o valor desejado
		int y= entrada.nextInt();
// criamos uma v�riavel para receber o valor do scanner
		for(int x=0; x<=10; x++) {

// Realiza um for com o valor digitado e criasse uma tabela de multiplica��o at� 1
			System.out.printf( y + "x" +x + "=" +  y*x);
// syso criado para mostrar o resultado da tabuada
		}

	}

}
