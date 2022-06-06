

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
//	Criamos os objetos Gato e Cachorro e chamamos o metodo falar e amb0os
	public static void falar(Animal a) {
		a.falar();
// Aqui chamamos o parametro (a) para o metodo falar, ele pode ser qualquer animal
		if(a instanceof Cachorro) { 
//		Compara as Instancias,se o objeto e da mesma classe do qual eu estou comparando.
			Cachorro c = (Cachorro) a;	
		c.morder();
//		Conseguimos chamar o metodo morde, apenas em cachorro, pois não é um metodo da classe animal
		}
		
	}
			
}
