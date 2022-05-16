
public class Aplicação {

	public static void main(String[] args) {
		
			Triangulo triangulo = new Triangulo();
			
			triangulo.setAltura(10);
			triangulo.setLargura(50);
			
			
			System.out.println("A Area do Triângulo " + triangulo.calcularArea());
			
			Quadrado quadrado = new Quadrado();
			
			quadrado.setAltura(10);
			
			System.out.println("A Area do Quadrado é " + quadrado.calcularArea());
			
			Retangulo retangulo = new Retangulo();
			
			retangulo.setAltura(10);
			retangulo.setLargura(15);
			
			System.out.println("A Area do Retangulo é " + retangulo.calcularArea());
			
			

	}

}
