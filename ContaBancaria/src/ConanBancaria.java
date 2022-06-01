

	public class ConanBancaria {
		
		private int numConta;
		private double saldo;
		private boolean ativo;
//	Criando as variaveis dos emtodos da conta
		public ConanBancaria() {
			numConta = 1 ;
			saldo = 1.0;
			ativo = true;
		}
//	Criando o construtor com os parametros dos metodos
		
		public ConanBancaria(boolean ativo, int numConta, double saldo) {
			this.numConta = numConta;
			this.saldo = saldo;
			this.ativo = ativo;
		}


		public void Receber(double valor){
			saldo += valor;
			
		}
//		M�todo de receber
	
		public double Ver() {
			return saldo;
		}
//		M�todo de Ver

		public void Dar(double valor) {
			if (saldo >= valor) {
			saldo -= valor;
			} else {
				System.out.println("Voc� n�o tem dinheiro suficiente na conta!");
			}
//		M�todo de Dar
		}
		
	}

