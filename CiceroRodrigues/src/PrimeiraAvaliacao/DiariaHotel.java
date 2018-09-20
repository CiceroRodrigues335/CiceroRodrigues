package PrimeiraAvaliacao;

import javax.swing.JOptionPane;

public class DiariaHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double diaria, taxa;
		
		diaria = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de diárias:"));
		
		if (diaria < 5){
			taxa = diaria * 54;
			JOptionPane.showMessageDialog(null, "Total a pagar: " + taxa + " R$");
		} else {
			taxa = diaria * 53.6;
			JOptionPane.showMessageDialog(null, "Total a pagar: " + taxa + " R$");
		}
	}

}
