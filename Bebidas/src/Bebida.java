
public class Bebida {
	private String nome;
	private boolean aquecer;
	
// Criandos a variaveis que são metodos de bebida
	
	public Bebida(String nome, boolean aquecer) { 
		super(); 
		this.nome = nome;
		this.aquecer = aquecer;
	}
//	O super() serve para chamar o construtor,
//	assim conseguimos adicionar mais atributos sem ter que repetir os anteriores.
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
//	como são atributos privados, eles são criados para pode chama-los em outras classes
	
	
}
