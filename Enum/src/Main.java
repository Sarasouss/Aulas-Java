
public class Main {
	public static final double PI = 3.14; 
	private enum Sexo{ //Pode ser criada em uma folha a parte ou na mesma que será instaciado
		MASCULINO, FEMININO;
	}
	public static void main(String[] args) {
		DiaDaSemana hoje = DiaDaSemana.SEXTA;
		
		double  pi = Main.PI;
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		String s = "TERCA";
		 hoje = DiaDaSemana.valueOf(s);//Faz a conversão do valor de Dia da Semana pro valor que está dentro da Variavel string

		 System.out.println(hoje.getNum());
		 
	
		   Sexo sexo = Sexo.MASCULINO;
	}

}
