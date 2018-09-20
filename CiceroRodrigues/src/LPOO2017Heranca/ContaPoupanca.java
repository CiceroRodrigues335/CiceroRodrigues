package LPOO2017Heranca;

public class ContaPoupanca extends ContaBancaria{

	// Crie duas classes herdadas de ContaBancaria: ContaPoupança e ContaEspecial,
	// com as seguintes características a mais: Classe ContaPoupança tem o atributo
	// dia de rendimento e o calcularNovoSaldo, recebe a taxa de rendimento da
	// poupança e atualiza o saldo. Já a classe ContaEspecial possui o atributo
	// limite é uma redefinição no métodos sacar, permitindo saldo negativo até o
	// valor do limite.
	
	private String diaRendimento;
	private double jurosRendimento;
	
	public ContaPoupanca(Cliente cliente , double saldo, String numConta, String diaRendimento, double jurosRendimento) {
		super(cliente , saldo, numConta);
		this.diaRendimento = diaRendimento;
		this.jurosRendimento = jurosRendimento;
	}
	
	public void depositarP(double depositar) {
		if(depositar > 0) {
			super.setSaldo(super.getSaldo() + depositar);
		}
	}
	
	public double renderP() {
		double nv = super.getSaldo() * (this.jurosRendimento/100.0);
		super.setSaldo(super.getSaldo() + nv);
		return this.getSaldo();
	}
	
	public void sacarP(double sacar) {
	if(sacar >=  super.getSaldo()) {
		super.setSaldo(super.getSaldo() - sacar);
	}
	}

	public String getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(String diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public double getJurosRendimento() {
		return jurosRendimento;
	}

	public void setJurosRendimento(double jurosRendimento) {
		this.jurosRendimento = jurosRendimento;
	}

}
