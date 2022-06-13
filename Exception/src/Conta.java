public class Conta {

	private double saldo;
	private Cliente cliente;
	private double limite;

	public Conta(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// ----------------------------------- metodos boolean
	// ---------------------------------------------------------
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
		return true;
	}

	public boolean transferir(Cliente cliente, double valor) {
		if (this.saldo < valor) {
			return false;
		}

		this.saldo -= valor;
		cliente.getConta().depositar(valor);
		return true;
	}

//	-------------------------------------- metodos magicos --------------------------------------------------------

	public int sacarMN(double valor) {

		if ((this.saldo < valor) && (this.saldo >= limite * -1)) {
			return 101;
		}

		else if ((this.saldo >= limite * -1)) {
			return 102;
		}
		return 100;
	}

	public int transferirMN(Cliente cliente, double valor) {

		if ((this.saldo < valor) && (this.saldo >= limite * -1)) {
			this.saldo += valor;
			return 101;
		}

		else if ((this.saldo < valor) && (this.saldo >= limite * -1)) {
			return 102;
		}
		this.saldo -= valor;
		cliente.getConta().depositar(valor);
		return 100;
	}

//	---------------------- Teste com exception ------------------------------------------------------------------------------
	public void sacarEx(double valor) throws ContaException {
		if (this.saldo < valor) {
			throw new ContaException("saldo insuficiente");
		} else if ((this.saldo - valor) < limite * -1) {
			throw new ContaException("Limite insuficiente");
		}
		this.saldo -= valor;
	}

//-----------------------------------------------------------------------------------------------------------------------------	
	public void depositar(double valor) {
		this.saldo += valor;
	}

}
