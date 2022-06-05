
public class Lampada {
	
	private boolean ligado;
	// atributo boolean que diz se e true (verdadeiro) ou false (falso)
	public Lampada(boolean ligado) {
		this.ligado = ligado;
	}
	// metodo para mudar o estado da lamapda
	
	public void Ligar() {
		if(ligado == true) {
			System.out.println("A lâmpada já está ligada!");
		}else {
			ligado = true;
		}
	}
	// metodo ligar com if else para caso a resposta seja true
	
	public void Desligar() {
		if(ligado == false) {
			System.out.println("A lâmpada já está desligada!");
		}else {
			ligado = false;
		}
	}
	// metodo desligar com if else para caso a resposta seja false
	
	public void Imprimir() {
		if(ligado == true) {
			System.out.println("A lâmpada está ligada.");
		}else {
			System.out.println("A lâmpada está desligada.");
		}
	}
	// metodo imprimir que mostra o resultado do if else na  tela com syso
	// mostrando o estado da lampada
}
