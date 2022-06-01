
public abstract class Item {
	
	private int posX;
	private int posy;
//	Criando as Variaveis
	public void pegar() {	
	}
//Criando o metodo pegar, que seá utilizdo em todos os que herdam
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
//	Criando os metodos get e set com os parametros que todas as classes que extend Item vão ter 
}


