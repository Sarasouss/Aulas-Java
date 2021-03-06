import java.util.Objects;

public class Cliente {
	private String nome;
	private int CPF;
	private int numConta;
// Criando a variavel com as informacoes de Cliente
	public Cliente() {
	}
// Criando o construtor
	
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

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
// Como os metodos de cliente sao privados, criasse o get e set
//	Para chama-los em outras classes
	@Override
	public String toString() {
		return "\nCliente: \nNome=" + nome + ",\nCPF=" + CPF + ",\nN?mero da Conta=" + numConta;
	}
// Criando to string para mostrar os atributos de cliente e nao seu endereco

	@Override
	public int hashCode() {
		return Objects.hash(CPF, nome, numConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return CPF == other.CPF && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
// Fazendo a comparacao  dos atributos de dois objetos com equals
	
	
	
	
	
}
