
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true);
	}

	@Override // O Override nosngarante que estamos subescrevendo um metodo e não criando outro.
	public void preparar() {
		System.out.println("Pegar o leite");
		System.out.println("Colocar no copo");
	}
	
	

}
