
public class Bebida {
	private String nome;
	private boolean aquecer;
	
	public Bebida(String nome, boolean aquecer) { 
		super(); //O super() serve para chamar o construtor, assim conseguimos adicionar mais atributos sem ter que repetir os anteriores.
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	public void preparar() {
	
	}
	//Os metodos get e set ajudam o código a ficar menores e com melhor indetifição, fazendo com que não criemos o mesmo atributo diversas vezes, como vemos, temos a variavel nome, só colocarmos a assinatura do método e a String desejada.
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
	

	
	
}
