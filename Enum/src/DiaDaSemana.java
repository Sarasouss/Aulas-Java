
public enum DiaDaSemana { 
// Conseguimos criar todo o conteudo na folha enum e 
// podemos acessa-las nas outras classes sem ter que repetir diversas vezes.
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
// Conseguimos criar metodos no enum
	private int num;
	
	public int getNum() {
		return num;
	}

// Um construtor dos objetos que estão no enum
	private DiaDaSemana(int num) {
		this.num = num;
	}
}
