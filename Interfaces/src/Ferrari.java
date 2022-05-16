
public class Ferrari implements Automovel, ItemCaro {//implementar todos os metodos de Automovel 

	@Override
	public void virarEsq() {
		System.out.println("Ferrari Virou a Esquerda");
		
	}

	@Override
	public void VirarDir() {
		System.out.println("Ferrari Virou a Direita ");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari Acelerou");
		
	}

	@Override
	public double getpreco() {
		return 1000000;
	}
	
	
}
