
public class Refrigerante extends Bebida {

	public Refrigerante() {
		
		super("Refrigerante", false);
		
	}
//	O super() serve para chamar o construtor de quem herdamos
//	assim conseguimos adicionar mais atributos sem ter que repetir os anteriores.
//	Adicionamos com o super os parametros de Refrigerante

	@Override
	public void preparar() {

		System.out.println("Colocar Gelo");
		System.out.println("Colocar Refrigerante");
	}
//Aqui colocamos o que vai acontecer quando chamamrmos refrigerante.prepararbebida
	
}
