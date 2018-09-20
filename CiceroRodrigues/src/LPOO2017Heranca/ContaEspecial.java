package LPOO2017Heranca;

public class ContaEspecial extends ContaBancaria {
	// Crie duas classes herdadas de ContaBancaria: ContaPoupança e ContaEspecial,
	// com as seguintes características a mais: Classe ContaPoupança tem o atributo
	// dia de rendimento e o calcularNovoSaldo, recebe a taxa de rendimento da
	// poupança e atualiza o saldo. Já a classe ContaEspecial possui o atributo
	// limite é uma redefinição no métodos sacar, permitindo saldo negativo até o
	// valor do limite.
	
	private double limiteConta;
	
	public ContaEspecial(Cliente cliente , double saldo, String numConta, double limiteConta) {
		super(cliente , saldo, numConta);
		this.limiteConta = limiteConta;
	}
	
	public void depositarE(double depositar) {
		if(depositar > 0) {
			super.setSaldo(super.getSaldo() + depositar);
		}
	}
	
	public void sacarE(double sacar) {
		double varL = super.getSaldo() + this.limiteConta;
		if(sacar <= varL) {
			super.setSaldo(super.getSaldo() - sacar);
		}
	}

	public double getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}
	
	
	
}
