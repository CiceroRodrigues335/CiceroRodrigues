package LPOO2017Heranca;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class L1Banco {

	public static void main(String[] args) {
		// Crie uma classe Teste e nela ofereça as seguintes opções:
		// 1) Incluir dados relativos a conta de um cliente (Limitado a 5 contas);
		// 2) Sacar um determinado valor de uma conta (Procure pelo número da conta);
		// 3) Depositar um determinado valor na sua conta (Procure pelo número da
		// conta);
		// 4) Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles
		// que possuem conta poupança;
		// 5) Mostrar os dados de todas as contas cadastradas.
		// 0) Sair.

		List<ContaBancaria> listaBancaria = new ArrayList<>();

		int opcaoMenu;

		do {
			opcaoMenu = Integer.parseInt(
					JOptionPane.showInputDialog("Digite 1 para incluir dados relativos a conta de um cliente;\n"
							+ "Digite 2 para sacar um determinado valor de uma conta;\nDigite 3 para depositar um determinado valor na conta;\n"
							+ "Digite 4 para mostrar o saldo pós rendimento (conta poupança);\nDigite 5 para mostrar os dados de todas as contas cadastradas;\n"
							+ "Digite 0 para sair."));
			Cliente c;
			ContaPoupanca p;
			ContaEspecial e;
			switch (opcaoMenu) {
			case 1:
				int opcaoConta;
				opcaoConta = Integer.parseInt(
						JOptionPane.showInputDialog("Digite 1 para Conta Poupança\nDigite 2 para Conta Especial"));
				if (opcaoConta == 1) {
					String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
					String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
					double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));
					String numConta = JOptionPane.showInputDialog("Digite o número da conta:");
					String diaRendimento = JOptionPane.showInputDialog("Digite o dia de rendimento:");
					double juros = Double.parseDouble(JOptionPane.showInputDialog("Digite o juros da conta:"));

					c = new Cliente(nome, cpf);
					p = new ContaPoupanca(c, saldo, numConta, diaRendimento, juros);
					listaBancaria.add(p);
					break;
				}
				if (opcaoConta == 2) {
					String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
					String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
					double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));
					String numConta = JOptionPane.showInputDialog("Digite o número da conta:");
					double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta:"));

					c = new Cliente(nome, cpf);
					e = new ContaEspecial(c, saldo, numConta, limite);
					listaBancaria.add(e);
					break;
				}
			case 2:
				double sacar;
				String verifNumCont;
				verifNumCont = JOptionPane.showInputDialog("Digite o número da conta da qual deseja sacar:");

				for (int i = 0; i < listaBancaria.size(); i++) {
					ContaBancaria contaB = listaBancaria.get(i);

					if (listaBancaria.get(i).getNumConta().equals(verifNumCont)) {
						sacar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado:"));

						if (contaB instanceof ContaPoupanca) {
							ContaPoupanca contaP = (ContaPoupanca) contaB;
							contaP.sacarP(sacar);
						}
						if (contaB instanceof ContaEspecial) {
							ContaEspecial contaE = (ContaEspecial) contaB;
							contaE.sacarE(sacar);
						}
					}

				}
				break;
			case 3:
				double depositar;
				verifNumCont = JOptionPane.showInputDialog("Digite o número da conta da qual deseja depositar:");

				for (int i = 0; i < listaBancaria.size(); i++) {
					ContaBancaria contaB = listaBancaria.get(i);

					if (listaBancaria.get(i).getNumConta().equals(verifNumCont)) {
						depositar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado:"));

						if (contaB instanceof ContaPoupanca) {
							ContaPoupanca contaP = (ContaPoupanca) contaB;
							contaP.depositarP(depositar);
						}
						if (contaB instanceof ContaEspecial) {
							ContaEspecial contaE = (ContaEspecial) contaB;
							contaE.depositarE(depositar);
						}
					}

				}
				break;
			case 4:
				verifNumCont = JOptionPane.showInputDialog("Digite o número da conta da qual deseja render juros:");
				for (int i = 0; i < listaBancaria.size(); i++) {
					ContaBancaria contaB = listaBancaria.get(i);
					if (contaB instanceof ContaPoupanca) {
						ContaPoupanca contaP = (ContaPoupanca) contaB;
						JOptionPane.showMessageDialog(null, "Saldo atual pós rendimento: " + contaP.renderP()
								+ "(juros: " + contaP.getJurosRendimento() + ")");

					}
				}
				break;
			case 5:
				String todasContas = null;
				for (int i = 0; i < listaBancaria.size(); i++) {
					ContaBancaria contaTemp = listaBancaria.get(i);
					if (contaTemp instanceof ContaPoupanca) {
						todasContas += ((ContaPoupanca) contaTemp).getJurosRendimento() + "\n" + contaTemp.getCliente()
								+ "\n" + contaTemp.getNumConta() + "\n" + contaTemp.getSaldo() + "\n";
					}
					if (contaTemp instanceof ContaEspecial) {
						todasContas += ((ContaEspecial) contaTemp).getLimiteConta() + "\n" + contaTemp.getCliente()
								+ "\n" + contaTemp.getNumConta() + "\n" + contaTemp.getSaldo() + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, todasContas);
				break;
			}
		} while (opcaoMenu != 0);

	}

}
