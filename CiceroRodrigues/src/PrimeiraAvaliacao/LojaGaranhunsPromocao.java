package PrimeiraAvaliacao;

import javax.swing.JOptionPane;

public class LojaGaranhunsPromocao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor, desconto, total;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra:"));
		
		if (valor <= 150){
			desconto = valor * 0.03;
			total =valor + -desconto;
			JOptionPane.showMessageDialog(null, "Valor da compra: " + " R$" + valor + "\nValor do desconto: " + desconto + " R$"
					+ "\nTotal a pagar: " + total + " R$");
		} else if (valor > 150 && valor <= 250){
			desconto = valor * 0.05;
			total = valor + -desconto;
			JOptionPane.showMessageDialog(null, "Valor da compra: " + " R$" + valor + "\nValor do desconto: " + desconto + " R$"
					+ "\nTotal a pagar: " + total + " R$");
		} else if (valor > 250 && valor <= 350){
			desconto = valor * 0.1;
			total = valor + -desconto;
			JOptionPane.showMessageDialog(null, "Valor da compra: " + " R$" + valor + "\nValor do desconto: " + desconto + " R$"
					+ "\nTotal a pagar: " + total + " R$");
		} else {
			desconto = valor * 0.15;
			total = valor + -desconto;
			JOptionPane.showMessageDialog(null, "Valor da compra: " + " R$" + valor + "\nValor do desconto: " + desconto + " R$"
					+ "\nTotal a pagar: " + total + " R$");
		}
		
	}

}
