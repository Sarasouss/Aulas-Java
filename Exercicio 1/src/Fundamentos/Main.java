package Fundamentos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double var;
		
		Scanner entrada = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa();
		 
		System.out.println("Funcionario 1");
		System.out.println("Digite seu nome:");
		pessoa1.setNome(entrada.next());
		System.out.println("Digite sua idade");
		pessoa1.setIdade(entrada.nextInt());
		System.out.println("Digite seu Cargo");
		pessoa1.setCargo(entrada.next());
		System.out.println("Digite seu salario");
		pessoa1.setSalario(entrada.nextDouble());
		System.out.println(pessoa1);
	
			
		System.out.println("---------------------------------------------");
	
		
		Pessoa pessoa2 = new Pessoa();
		System.out.println("Funcionario 2");
		System.out.println("Digite seu nome:");
		pessoa2.setNome(entrada.next());
		System.out.println("Digite sua idade");
		pessoa2.setIdade(entrada.nextInt());
		System.out.println("Digite seu Cargo");
		pessoa2.setCargo(entrada.next());
		System.out.println("Digite seu salario");
		pessoa2.setSalario(entrada.nextDouble());
		System.out.println(pessoa2);
		
		
		if (pessoa1.getSalario() >= pessoa2.getSalario()) {
			var = pessoa1.getSalario() - pessoa2.getSalario();
		} else {
			var = pessoa2.getSalario() - pessoa1.getSalario();
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println("a Diferenca entre os salarios e de R$" + var);
	}
	}

