
public class Quadrado implements AreaCalculavel {
	
	private double Altura;
//	Criandoa a variavel
	
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
// Criando os get e set por ser um metodo privado,para pode chamar em outras classes
	@Override
	public double calcularArea() {
		return (this.getAltura() * this.getAltura());
	}
//	Criando o toString para mostrar o o retorno, no caso do quadrado os lados tem o memso tamanho,
//	entao precisamos fazer fazer o lado vezes ele mesmo
}
