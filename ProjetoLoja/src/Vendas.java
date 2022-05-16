
public class Vendas {

	public static void main(String[] args) {
		double prod1 = 150; //Declarou as variaveis e determinou o valor delas, double = tipo, prod1 = nome, 150 = valor
		double prod2 = 200;
		double totalp;
		double desc;
		double prodesc;
		
		totalp = prod1 + prod2; // Adiconou Resultado na variávelç total com a somas das outras duas
		System.out.println("O total da compra é de R$ " + totalp ); // Syso para mostrar o conteudo na tela 
		
		desc = totalp * 0.15;
		System.out.println("O valor do desconto é de R$ " + desc);
		
		prodesc = totalp - desc;
		System.out.println("O total com o desconto é de R$ " + prodesc);
		

	}

}
