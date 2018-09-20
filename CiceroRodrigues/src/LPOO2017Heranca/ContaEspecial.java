package LPOO2017Heranca;

public class ContaEspecial extends ContaBancaria {
	// Crie duas classes herdadas de ContaBancaria: ContaPoupan�a e ContaEspecial,
	// com as seguintes caracter�sticas a mais: Classe ContaPoupan�a tem o atributo
	// dia de rendimento e o calcularNovoSaldo, recebe a taxa de rendimento da
	// poupan�a e atualiza o saldo. J� a classe ContaEspecial possui o atributo
	// limite � uma redefini��o no m�todos sacar, permitindo saldo negativo at� o
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
