import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		int n1;
		int n2;	
		String op ="";
		int control = 0;
//	Criando as variaveis com os valores delas	
		Scanner entrada = new Scanner(System.in);
//	Criando o objeto de scanner para receber as informacoes
		System.out.println("Digite a opera��o desejada (+, -, *, /): ");
		op = entrada.nextLine();
		System.out.println("Digite um valor: ");
		n1 = Integer.parseInt(entrada.nextLine());
		System.out.println("Digite o segundo valor: ");
		n2 = Integer.parseInt(entrada.nextLine());
		
//	Pedindos as informacoes para calcular
		
		if(op.equals("+")) {
			System.out.println("O resultado da soma � " +(n1 + n2));
			control++;	
		}
		
		if(op.equals("-")) {
			System.out.println("O resultado da subtra��o � " +(n1 - n2));
			control++;	
		}
		
		if(op.equals("*")) {
			System.out.println("O resultado da multiplica��o � " +(n1 * n2));
			control++;
		}
		
		if(op.equals("/")) {
			System.out.println("O resultado da divis�o � " +(n1 / n2));
			control++;	
		}
		if(control == 0) {
			System.out.println("Opera��o invalida, tente novamente!");
		}
//  Criamos os Parametros para cada operador da Calculadora, uilizando o if		

	}

}
