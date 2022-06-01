
public class Refrigerante extends Bebida {

	public Refrigerante() {
		
		super("Refrigerante", false);
		
	}
//	Adicionamos com o super os parametros de Refrigerante

	@Override
	public void preparar() {

		System.out.println("Colocar Gelo");
		System.out.println("Colocar Refrigerante");
	}
//Aqui colocamos o que vai acontecer quando chamamrmos refrigerante.prepararbebida
	
}
