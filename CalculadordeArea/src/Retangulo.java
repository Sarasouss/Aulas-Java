
public class Retangulo implements AreaCalculavel {
	private double altura;
	private double largura;
	
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
	@Override
	public double calcularArea() {
		return ( this.getAltura() * this.getLargura());
	}
	
	

}
