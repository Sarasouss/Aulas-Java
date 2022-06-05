
public class Fusca  implements Carro {

	@Override
	public void virarEsq() {
		System.out.println("Fusca Virou a Esquerda");
		
	}

	@Override
	public void VirarDir() {
		System.out.println("Fusca Virou a Direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Fusca Acelerou");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Fusca abriu a porta");
		
	}
	//Implementando os metodos da interface carro segundo a classe Fusca

}
