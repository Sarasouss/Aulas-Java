
public class Main {

	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada(true);
		Lampada lampada2 = new Lampada(false);
		
		lampada1.Imprimir();
		lampada1.Desligar();
		lampada1.Imprimir();
		lampada1.Desligar();
		lampada2.Imprimir();
		lampada2.Ligar();
		lampada2.Imprimir();
		// fazendo teste com as lampadas para mostara seu estado
	}

}
