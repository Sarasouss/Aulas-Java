
public class Vendas {

	public static void main(String[] args) {
		double prod1 = 150;
		double prod2 = 200;
		double totalp;
		double desc;
		double prodesc;
		
		totalp = prod1 + prod2;
		System.out.println("O total da compra � de R$ " + totalp );
		
		desc = totalp * 0.15;
		System.out.println("O valor do desconto � de R$ " + desc);
		
		prodesc = totalp - desc;
		System.out.println("O total com o desconto � de R$ " + prodesc);
		

	}

}
