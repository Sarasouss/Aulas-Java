// Polimorfismo: Com a mesma vari�vel conseguimos agir de diversasa formas,consigo colocar diversos endere�os na mesma v�riavel.

public class Main {

	public static void main(String[] args) {

//	Animal animal = new Cachorro();
//	
//	animal.falar();
//	
//	animal = new Gato();
//	
//	animal.falar();
	
	Gato gato = new Gato();
	Cachorro cachorro = new Cachorro();
	falar(gato);
	falar(cachorro);
	}
	public static void falar(Animal a) {
		a.falar();
		
		if(a instanceof Cachorro) { //Compara as Inst�ncias, "se o objeto � da mesma classe do qual eu estou comparando."
			Cachorro c = (Cachorro) a;
			
		c.morder();
		}
		
	}
			
}
