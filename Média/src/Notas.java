
public class Notas {

	//Exercic�o 1
	public static void main(String[] args) {
		double nota1 = 8.5;
		double nota2 = 7.5;
		double nota3 = 6.0; 
		double median1;
		double median2;
		double median3;
		double mediag;
		double somap = 10;
		
	
		System.out.println("Primeira nota " + (nota1));
		System.out.println("Segunda nota " + (nota2));
		System.out.println("Terceira nota " + (nota3));
		System.out.println("-----------------------------------");
		
		
		System.out.println("O peso da nota 1 � 3 ");
		System.out.println("Ent�o o resultado dela � " +(median1 = nota1 * 3));
		
		System.out.println("O peso da nota 2 � 2"  );
		System.out.println("Ent�o o resultado dela � " +(median2 = nota2 * 2));
		
		System.out.println("O peso da nota 3 � 5"  );
		System.out.println("Ent�o o resultado dela � " +(median3 = nota3 * 5));
		System.out.println("-----------------------------------");
		
		System.out.println("M�dia do Peso das Notas " +(mediag = median1 + median2 + median3));
		System.out.println("M�dia Total: " + (mediag / somap));
	}

}
