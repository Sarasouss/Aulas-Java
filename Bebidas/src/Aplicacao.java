
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador();
//	Criando o objeto preparador
		
		LeiteQuente leitequente = new LeiteQuente();
		preparador.prepararBebida(leitequente);
//	utilizandos os metodos de Bebida com os parametros de Leite quente	
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
	}

}
