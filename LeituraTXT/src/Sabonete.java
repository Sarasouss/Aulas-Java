
public class Sabonete {

	private String cheiro;
	private String cor;

	@Override
	public String toString() {
		return " Sabonete cheiro: " + cheiro + ", cor: " + cor + "\n";
	}

// O toString vai mostrar o conteúdo que aparecera na tela quando chamarmos sabonete 
	public Sabonete(String cheiro, String cor) {
		super();
		this.cheiro = cheiro;
		this.cor = cor;
	}

//	Aqui foi criado o contrutor, entao quando chamarmos sabonete poderemos adicionar dois parametros.
	public Sabonete(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split(":");
		this.cheiro = arrayAuxiliar2[1].trim();

		String[] arrayAuxiliar3 = arrayAuxiliar1[0].split(":");
		this.cor = arrayAuxiliar3[1].trim();
//	Esse novo contrutor  faz a quebra dos conteúdos recebidos pelo txt, conforme o que queremos
//	slipt serve para quebrar o texto e trim para tirar os espaços
	}
}
