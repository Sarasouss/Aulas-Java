
public class Contador {
	private static int valor;
// criando a variavel valor
	public static void incrementar() {
		valor ++;
	}
// incrementar usado para adicionar mais um a valor
	
//		public Contador() {
//			this.valor = 1;
//		}
	
	static {
		valor = 1;
	}
	
	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
