
public class Quadrado implements AreaCalculavel {
	
	private double Altura;
	
	
	public double getAltura() {
		return Altura;
	}


	public void setAltura(double altura) {
		Altura = altura;
	}


	@Override
	public double calcularArea() {
		return (this.getAltura() * this.getAltura());
	}
	


}
