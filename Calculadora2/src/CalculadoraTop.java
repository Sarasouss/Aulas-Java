import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		int n1;
		int n2;	
		String op ="";
		int control = 0;
//	Criando as variaveis	r os valores delas	
		Scanner entrada = new Scanner(System.in);
//	Criando o objeto de scanner para receber as informações
		System.out.println("Digite a operação desejada (+, -, *, /): ");
		op = entrada.nextLine();
		System.out.println("Digite um valor: ");
		n1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Digite o segundo valor: ");
		n2 = Integer.parseInt(entrada.nextLine());
		
//	Pedindos as informaoes para calcular
		
		if(op.equals("+")) {
			System.out.println("O resultado da soma é " +(n1 + n2));
			control++;	
		}
		
		if(op.equals("-")) {
			System.out.println("O resultado da subtração é " +(n1 - n2));
			control++;	
		}
		
		if(op.equals("*")) {
			System.out.println("O resultado da multiplicação é " +(n1 * n2));
			control++;
		}
		
		if(op.equals("/")) {
			System.out.println("O resultado da divisão é " +(n1 / n2));
			control++;	
		}
		if(control == 0) {
			System.out.println("Operação invalida, tente novamente!");
		}
//  Criamos os Parametros para cada operador da Calculadora		

	}

}
