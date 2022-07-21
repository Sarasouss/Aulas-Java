
public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa ();
		pessoa1.andar();
		pessoa1.falar();
		
		System.out.println();
		
		Homem homem1 = new Homem ();
		homem1.andar();
		homem1.dirigir();
		homem1.falar();
		
		System.out.println();
		
		Mulher mulher1 = new Mulher ();
		mulher1.andar();
		mulher1.falar();
		mulher1.ler();
			

	}

}
