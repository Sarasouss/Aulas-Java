
public class ManipulacaodeObjetos {

	public static void main(String[] args) {
	
		Pessoa pessoa1 = new Pessoa(); 
//		criando variavel e instanciando o objeto
		pessoa1.nome = "Sara"; 
		pessoa1.numfigurinha = 8;
//		 dando valor a variavel
		
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("N�mero de Figurinhas: " + pessoa1.numfigurinha);
//		mostrando o valor de cada variavel
		
		Pessoa pessoa2 = new Pessoa ();
		pessoa2.nome= "Rafael";
		pessoa2.numfigurinha = 7;
	
		System.out.println("nome: " + pessoa2.nome);
		System.out.println("N�mero de figurinhas: " + pessoa2.numfigurinha);
		
		
		boolean msg = pessoa1.dar(5, pessoa2);
//		dando parametros para msg, indicando quando ela sera verdadeira
//		indicando o que ela ira fazer, segundo os metodos de pessoa
		if(msg==true) {
		System.out.println("----------------------------------------------------");
		System.out.println("N�mero de figurinhas de cada um ap�s a a��o");
		
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("N�mero de Figurinhas: " + pessoa1.numfigurinha);
		
		System.out.println("nome: " + pessoa2.nome);
		System.out.println("N�mero de figurinhas: " + pessoa2.numfigurinha);
		}
//		Mostrando o resultado apos a acao
		

		
	}

}
