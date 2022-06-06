
public class Pessoa {
	
	String nome;
	int numfigurinha;
	
//	Criando as variaveis
	
	void receber (int numfigurinha) {
		this.numfigurinha += numfigurinha;
	}
//	 Criando o metodo receber e seus parametros
	
	boolean dar(int numfigurinha, Pessoa pessoa ){
		
		
		if(this.numfigurinha < numfigurinha) {
		System.out.println("Voc� n�o pode fazer a troca, quantidade invalida! ");
		return false;
	}
		else {
			this.numfigurinha -= numfigurinha;
	
			pessoa.receber(numfigurinha);
			return true;
		}
//	 Criando o metodo dar, com o if else
//	 if mostrara uma mensagem na tela caso o numero de figurinhas que queira dar
//	 seja maior que o numero de figurinhas que tenho
//	 caso o numero de figurinhas condizer com os parametros
//	 ele dimunira seu numero de figurinhas, com o valor das figurinhas dadas
//	 e adicionara no da pessoa que ira receber
	}
	
	
}
