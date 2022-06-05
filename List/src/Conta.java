
public class Conta {

	String nome;
	double valor;
// Atributos da Conta
	
	public Conta(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}
// o tostring mostrara na tela o que aparecera quando imprimirmos, 
// fazendo com que n apareca seu endereco
}
