public class Cliente {

	public Cliente(String nome, int cPF, Conta conta) {
		this.nome = nome;
		CPF = cPF;
		this.conta = conta;
	}

	private String nome;
	private int CPF;
	private Conta conta;

	public Cliente() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}