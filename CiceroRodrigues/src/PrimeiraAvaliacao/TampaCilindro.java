package PrimeiraAvaliacao;

import javax.swing.JOptionPane;

public class TampaCilindro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double diametro, calculo, gasto, quantidade;
		
		diametro = Double.parseDouble(JOptionPane.showInputDialog("Digite o diâmetro da tampa:"));
		quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de tampas a serem pintadas:"));
		
		calculo = 3.14 * ((diametro/2) * (diametro/2));
		
		gasto = 1.5 * calculo * quantidade;
		
		JOptionPane.showMessageDialog(null, "Seu gasto será de: " + gasto + " R$");
	}

}
