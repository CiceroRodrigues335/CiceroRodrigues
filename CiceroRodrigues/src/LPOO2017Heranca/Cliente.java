package LPOO2017Heranca;

public class Cliente {

	private String nomeP;
	private String cpf;

	public Cliente(String Nome, String CPF) {
		this.nomeP = Nome;
		this.cpf = CPF;
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
