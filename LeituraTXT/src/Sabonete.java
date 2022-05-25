
public class Sabonete {

	 private String cheiro;
	 private String cor;
	 
		@Override
		public String toString() {
			return " Sabonete cheiro: " + cheiro + ", cor: " + cor + "\n" ;
		}

	public Sabonete(String cheiro, String cor) {
		super();
		this.cheiro = cheiro;
		this.cor = cor;
	}
	public Sabonete(String texto) {
		
		String[]  arrayAuxiliar1 = texto.split(",");
		String[]  arrayAuxiliar2 = arrayAuxiliar1[0].split(":");		
		this.cheiro = arrayAuxiliar2[1].trim();		
		
		String[]  arrayAuxiliar3 = arrayAuxiliar1[0].split(":");
		this.cor = arrayAuxiliar3[1].trim();
	}
}
