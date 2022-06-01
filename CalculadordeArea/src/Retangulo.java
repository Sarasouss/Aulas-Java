
public class Retangulo implements AreaCalculavel {
	private double altura;
	private double largura;
//	Criando as variaveis
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	// Criando os get e set por ser um metodo privado,para pode chamar em outras classes
	@Override
	public double calcularArea() {
		return ( this.getAltura() * this.getLargura());
	}
//	Criando o toString para mostrar o o retorno, no caso e a largura * a altura
	

}
