
public abstract class Item {
//Classe abstrata: 	Uma classe que nao pode ser instanciada, apenas herdada
//Criamos dentro dela metodos que serao genericos
	private int posX;
	private int posy;
//	Criando as Variaveis
	public void pegar() {	
	}
//Criando o metodo pegar, que sera utilizado em todos os que herdam
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}
//	Criando os metodos get e set com os parametros que todas as classes que extend Item v�o ter 
}


