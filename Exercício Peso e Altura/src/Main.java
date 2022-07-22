import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		int  sexo;
		int qtM = 0;
		int qtH = 0 ;
		double altura ;
        double somaH = 0 ; 
        double media = 0 ;
        double maior = 0 ; 
        double menor = 0 ;

        Scanner entrada = new  Scanner ( System.in );
        
        for ( int  i = 0 ; i < 10 ; i ++) {
            System.out.println("Escolha o sexo da pessoa 1-Mulher ou 2-Homem: " );
            sexo = entrada.nextInt();
            System.out.println("Digite a altura: ");
            altura = entrada.nextDouble();
            if ( sexo == 1 ) {
                qtM ++;
            } else  if ( sexo == 2 ) {
            	qtH ++;
            	somaH = somaH + altura ;
            } else {
               System.out.println("Sexo inválido!");
            }
            
            if ( altura > maior ) {
                 maior = altura ;
            } else  if ( altura < menor ){
                menor = altura ;
            }
        }
        	media = somaH / qtH ;
        
        System.out.println("A maior altura do grupo e de " + maior + " M, e a menor e de " + menor + " M" );
        System.out.println("A media de altura dos Homens e " + media + "M");
        System.out.println("O numero de mulheres e " + qtM);

        
		


	}

}
