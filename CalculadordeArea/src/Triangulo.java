
public class Triangulo implements AreaCalculavel {
	 private double Altura;
	 private double Largura;
//	 Criando as variaveis
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	public double getLargura() {
		return Largura;
	}
	public void setLargura(double largura) {
		Largura = largura;
	}
//	 Criando os get e set por ser um metodo privado,para pode chamar em outras classes
	public double calcularArea() {
		return (this.getAltura() * this.getLargura()) / 2;
	}
//	Criando o toString para mostrar o o retorno, no caso e a largura * a altura / 2
}
