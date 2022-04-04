import java.util.Scanner;

public class VendasTop {

	public static void main(String[] args) {
		double prod1 ;
		double prod2 ;
		double totalp;
		double desc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Peças disponiveis");
		System.out.println("1-Calça R$120,00");
		System.out.println("2-Camiseta R$50,00");
		System.out.println("3-Jaqueta R$180,00");
		System.out.println("4-Short R$55,00");
		
		System.out.println("Qual o produto 1 ? ");
		prod1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Qual o produto 2 ? ");
		prod2 = Integer.parseInt(entrada.nextLine());
			

	}

}
