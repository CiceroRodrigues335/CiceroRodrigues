package PrimeiraAvaliacao;

import javax.swing.JOptionPane;

public class Metroplaza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double preco, quantidade, custo, imposto, lucro;
		
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da lata de cerveja em R$:"));
		quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de latas de cerveja vendidas:"));
		
		custo = preco * 0.6 * quantidade;
		imposto = preco * 0.3 * quantidade;
		lucro = preco * 0.1 * quantidade;
		
		JOptionPane.showMessageDialog(null, "Custo do produto: " + custo + " R$" + "\nTotal em impostos: " + imposto + " R$" +
		"\nLucro: " + lucro + " R$");
	}

}
