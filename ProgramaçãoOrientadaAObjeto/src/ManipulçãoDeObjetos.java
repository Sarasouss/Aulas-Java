
public class Manipul��oDeObjetos {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa (); //criando variavel e instanciando o objeto
		
		
		pessoa1.nome = "Sara"; // dando valor a variavel
		pessoa1.numfigurinha = 1;
		pessoa1.receber(5);

		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("N�mero de Figurinhas: " + pessoa1.numfigurinha);

		Pessoa pessoa2 = new Pessoa ();
		
		
		pessoa2.nome= "Rafael";
		pessoa2.numfigurinha = 7;
		

		System.out.println("nome: " + pessoa2.nome);
		System.out.println("N�mero de figurinhas: " + pessoa2.numfigurinha);
		
		
		pessoa1.dar(16, pessoa2);
		
		System.out.println("---------------------------------------------");
		System.out.println("N�mero de figurinhas de cada um ap�s a a��o");
		
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("N�mero de Figurinhas: " + pessoa1.numfigurinha);
		
		System.out.println("nome: " + pessoa2.nome);
		System.out.println("N�mero de figurinhas: " + pessoa2.numfigurinha);
		
		
		

		
		
}
	
}
