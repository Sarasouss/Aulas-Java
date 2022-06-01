
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true);
	}
//	adicionamos com o super os parametros de leite Quente

	@Override 
	public void preparar() {
		System.out.println("Pegar o leite");
		System.out.println("Colocar no copo");
	}
// O Override nos garante que estamos subescrevendo um metodo e não criando outro.	
	

}
