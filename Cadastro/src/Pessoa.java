
public class Pessoa {
	private String nome;
	private int idade;
	private Endereco endereco;
	private Sexo sexo;
// Crio as variaveis com as informacoes desejadas do cadastro 
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
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	//	Comos os atributos sao privados, precisamos dos get e set para poder definir os valores
	@Override
	public String toString() {
		return "Nome: " + nome + " ,Idade: " + idade + " ,Sexo: " + sexo + endereco;
	}

//	O toString vai  mostrar o que aparecera na tela quando chamarmos Pessoa
	public Pessoa(int x) {
	}

//	Se nao criasse esse contrutor seriamos obrigados
//	a colocar o conteúdo na construcao do objeto
	public Pessoa(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");

		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split(":");
		this.nome = arrayAuxiliar2[1].trim();

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
		this.idade = Integer.parseInt(arrayAuxiliar3[1].trim());

		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split(":");
		String nu = arrayAuxiliar4[1].trim();
//		Aqui quebramos e tiramos os espaços do conteudo do txt
		if (nu == "MASCULINO") {
			this.sexo = Sexo.MASCULINO;
		} else {
			this.sexo = Sexo.FEMININO;
		}
//	Peguei o valor da string que e coloquei no if else, 
//	dependendo do valor eu dei um resultado sobre o sexo
		String[] arrayAuxiliar5 = arrayAuxiliar1[3].split(":");
		this.endereco = new Endereco(arrayAuxiliar5[1]);
//	instaciou um novo endereço, e fez o mesmo com o conteudo do cadastro acima ex: nome 
	}

}
