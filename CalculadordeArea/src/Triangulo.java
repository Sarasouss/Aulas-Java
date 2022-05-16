
public class Triangulo implements AreaCalculavel {
	 private double Altura;
	 private double Largura;
	
	 
	 
	 
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


	public double calcularArea() {
		return (this.getAltura() * this.getLargura()) / 2;
	}
	
	
}
