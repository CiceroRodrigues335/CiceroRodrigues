package LPOO2017Heranca;

public class ContaBancaria {
	// Crie uma classe ContaBancaria, que contém os atributos nome do cliente,
	// num_conta, saldo e os métodos sacar (o saldo não pode ficar negativo) e
	// depositar.
	
	Cliente cliente;
	private double saldo;
	private String numConta;
	
	public ContaBancaria(Cliente cliente , double saldo, String numConta) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.numConta = numConta;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double depositar) {
		this.saldo = depositar;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

}
