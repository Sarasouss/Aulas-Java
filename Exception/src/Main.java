
public class Main {

	public static void main(String[] args) {

		Conta conta1 = new Conta(1000.0, 1000.0);
		Conta conta2 = new Conta(1500.0, 200.0);

		Cliente cliente1 = new Cliente("Sara", 69656326, conta1);
		Cliente cliente2 = new Cliente("Gustavo", 565389, conta2);
		
//------------------------ teste boolean ----------------------------------------------------
//		if (cliente1.getConta().sacar(100) == true) {
//			System.out.println("Saque realizado com sucesso");
//		} else {
//			System.out.println("Saque nao realizado porque seu saldo e insuficiente!");
//		}
//		System.out.println("Seu saldo atual e de " + cliente1.getConta().getSaldo());
	
		
//-------------------------------- teste Magic Numbers ---------------------------------------
//		switch (cliente1.getConta().sacarMN(100)) {
//		case 100:
//			System.out.println("saque realizado com sucesso!!");
//			break;
//		case 101:
//			System.out.println("saque realizado com sucesso, mas voce utilizou seu limite");
//			break;
//		case 102:
//			System.out.println("operacao nao realizada, voce nao tem saldo suficiente ");
//			break;
		
//-------------------------------------- teste Exception ----------------------------------------
			
			try {
			cliente1.getConta().sacarEx(100);
			}
			catch (ContaException e) {
				
				e.printStackTrace();
				System.out.println("Nao foi possivel realizar a operacao: " + e.getMessage());
		}
			
	}
	}

