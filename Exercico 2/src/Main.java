import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double valor;
		double desc;
		double total;
		 
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Digite o valor");
		 valor = entrada.nextDouble();
		 System.out.println(valor);
		 
		 if ((valor > 0) && (valor < 999)){
			 desc = valor * 0.05;
			 total = valor - desc;
		 }
		 
		 else if ((valor > 1000) && (valor < 2999)){
			 desc = valor * 0.15;
			 total = valor - desc;
		 }
		 else
		 {
			 desc = valor * 0.20;
			 total = valor - desc; 
		 }
		 
		 System.out.println("---------------------------------------------");
		 System.out.println("Valor sem desconto R$" + valor);
		 System.out.println("Seu desconto e de R$ " + desc);
		 System.out.println("Seu total e de R$" + total);
		

	}

	
		 
	}



	
		
	

