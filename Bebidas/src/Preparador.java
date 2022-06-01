
public class Preparador  {
	public void prepararBebida(Bebida bebida){
		
	System.out.println("Preparando a bebida " + bebida.getNome());
	
	System.out.println("Pegar Copo");
	
	bebida.preparar();
//Aqui colocamos o que sera padrao quando utilizarmos o preparador 	
	
	if(bebida.isAquecer()) {
		System.out.println("Aquecer Bebida " + bebida.getNome());
	}
//	if nos da a opcao de fazer uma acao so se o pararmetro seguir um tipo,
//	ou seja ele so fara tal coisa se corresponder com o que  é pedido
	System.out.println("Preparada ;) \n");
	}

}
