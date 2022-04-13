
public class Pessoa {
	String nome;
	int numfigurinha;
	
	void receber (int numfigurinha) {
		this.numfigurinha += numfigurinha;
		
	}
	
	void dar(int numfigurinha, Pessoa pessoa ) {
		if(this.numfigurinha < numfigurinha) {
		System.out.println("Você não pode fazer a troca, quantidade invalida! ");
	}
		else {
			this.numfigurinha -= numfigurinha;
	
	pessoa.receber(numfigurinha);

		}
	}
	
	
}
