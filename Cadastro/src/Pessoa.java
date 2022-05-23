
public class Pessoa {
	private enum Sexo{
		FEMENINO, MASCULINO;
	}
	
	private String nome;
	private int idade;
	private Endereco endereco;
	private Sexo sexo;
	
	public void sexoNum(int sexo) {
		if(sexo == 1) {
			this.sexo=Sexo.FEMENINO;
		}
		else if(sexo == 2) {
			this.sexo=Sexo.MASCULINO;
		}
			
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo + " Endereço - " + endereco ;
	}
	
}
