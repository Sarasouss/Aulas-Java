
public class Data {
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;

	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;

// Cria as variaveis
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
//	Cria o construtor que recebe o dia, o mes e o ano

	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
//	Novo construtor que recebe informações de data e horário

		this(dia, mes, ano);

		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
//Chama o outro construtor da classe

	public void imprimir(int formato) {
		String data = dia + "/" + mes + "/" + ano;
//	Imprime a data/hora formatada, de acordo com o formato que voce especificou
//	Monta a string de impressão da data

		if (hora == -1) {
//	Se hora for -1, significa que os dados de horário não serão necessários.
//	Então visualiza-se só a data
			System.out.println(data);
		} else {
//	Cria uma parte da string do horário 
			String horario = ":" + minuto + ":" + segundo;

			if (formato == FORMATO_24H) {
//	Se o formato for 24h, recebe o atributo do formato 24h
				horario = hora + horario;
			} else {
				if (hora == 0) {
					horario = 12 + horario;
					horario += " AM";

				} else if (hora >= 12) {
//	Se hora é maior ou igual a 12, precisamos diminuir 12 da hora para conseguir o formato 12 horas,
//	Precisamos adicionar o PM
					horario = (hora - 12) + horario;
					horario += " PM";

				} else {
//	Se a hora for menor que 12, utilizasse a hora desejada com AM no fim 
					horario = hora + horario;
					horario += " AM";
				}
			}
			System.out.println(data + " " + horario);
//	Mostra a data/hora formatada
		}
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
//	Criando o Metodo get
}
