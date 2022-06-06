
public class Aplicacao {
// Classe: é onde guardamos todas informaçoes que o programa tera
	public static void main(String[] args) {
//	Metodos: são as funcoes que serao executadas dentro das classes		
		Preparador preparador = new Preparador();
//	Criando o objeto preparador
		
		LeiteQuente leitequente = new LeiteQuente();
		preparador.prepararBebida(leitequente);
//	utilizandos os metodos de Bebida com os parametros de Leite quente	
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
	}

}
