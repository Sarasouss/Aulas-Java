
public class Carro  extends Veiculo{
	
	private boolean quatroPortas;
// atributo unico de carro

	@Override
	public void imprimir() {
		super.imprimir();
//herda os metodos da classe veiculo
		System.out.println("Tem 4 Portas? " + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
// gete set do atributo
	
}
