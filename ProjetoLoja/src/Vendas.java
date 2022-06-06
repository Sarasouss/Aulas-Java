
public class Vendas {

	public static void main(String[] args) {
		double prod1 = 150; 
		double prod2 = 200;
		double totalp;
		double desc;
		double prodesc;
//		Declarou as variaveis e determinou o valor delas, double = tipo, prod1 = nome, 150 = valor
		
		totalp = prod1 + prod2; 
//		Adicionou Resultado na variavel total com a somas das outras duas
		System.out.println("O total da compra é de R$ " + totalp );  
//		 Syso para mostrar o conteudo na tela
		desc = totalp * 0.15;
		System.out.println("O valor do desconto é de R$ " + desc);
//		na variavel desconto, faremos total * 0.15
		prodesc = totalp - desc;
		System.out.println("O total com o desconto é de R$ " + prodesc);
//		E para total final faremos o total do produto - o desconnto 

	}

}
