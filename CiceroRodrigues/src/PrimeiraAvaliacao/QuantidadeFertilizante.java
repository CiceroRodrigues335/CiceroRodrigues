package PrimeiraAvaliacao;

import javax.swing.JOptionPane;

public class QuantidadeFertilizante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double quantidade, nitrogenio, potassio, fosforo;
		
		quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de fertilizante:"));
		
		nitrogenio = quantidade / 6 * 3;
		potassio = quantidade / 6 * 2;
		fosforo =  quantidade / 6 * 1;
		
		JOptionPane.showMessageDialog(null, "Nitrogênio: " + nitrogenio + "\nPotássio: " + potassio + "\nFósforo: " + fosforo);
	}

}
