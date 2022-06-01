
public class Aplicacao {

	public static void main(String[] args) {
		
			Triangulo triangulo = new Triangulo();
//			Criando o Objeto Triangulo
			triangulo.setAltura(10);
			triangulo.setLargura(50);
//			Definindo tamanhos		
			
			System.out.println("A Area do Triângulo " + triangulo.calcularArea());
//			Mostrando o resultado
			Quadrado quadrado = new Quadrado();
//			Criando o Objeto Quadrado			
			quadrado.setAltura(10);
//			Definindo Tamanho
			System.out.println("A Area do Quadrado é " + quadrado.calcularArea());
//			Mostrando Resultado
			Retangulo retangulo = new Retangulo();
//			Criando o Objeto Retangulo
			retangulo.setAltura(10);
			retangulo.setLargura(15);
//			Definindo Tamanhos
			System.out.println("A Area do Retangulo é " + retangulo.calcularArea());
//			Mostrando Resultado
	}
}
