
public class Bebida {
	private String nome;
	private boolean aquecer;
	
// Criandos a variaveis que sao metodos de bebida
	
	public Bebida(String nome, boolean aquecer) { 
		this.nome = nome;
		this.aquecer = aquecer;
	}
	public void preparar() {
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
//	Os metodos get e set ajudam o codigo a ficar menores e com melhor indetificacao, 
//	como s�o atributos privados, eles s�o criados para pode chama-los em outras classes
	
	
}
