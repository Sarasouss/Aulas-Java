
public class Aplica��o {

	public static void main(String[] args) {
		
			Triangulo triangulo = new Triangulo();
			
			triangulo.setAltura(10);
			triangulo.setLargura(50);
			
			
			System.out.println("A Area do Tri�ngulo " + triangulo.calcularArea());
			
			Quadrado quadrado = new Quadrado();
			
			quadrado.setAltura(10);
			
			System.out.println("A Area do Quadrado � " + quadrado.calcularArea());
			
			Retangulo retangulo = new Retangulo();
			
			retangulo.setAltura(10);
			retangulo.setLargura(15);
			
			System.out.println("A Area do Retangulo � " + retangulo.calcularArea());
			
			

	}

}
