package LPOO2017;

import javax.swing.JOptionPane;

public class L1Q2Le5AlturaCalcuMedia {

	public static void main(String[] args) {
		//  Escreva um programa que leia a altura de 05 pessoas e calcule a m�dia. 
		
		double altura = 0, media;
		String C = " ";

		for(int i = 1; i < 6; i++) {
			double medidas = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + i +"� altura:"));
			altura = medidas + altura;
			C = C + " + " + medidas;
		}
		media = altura / 5;
		JOptionPane.showMessageDialog(null, "A m�dia das alturas " + C + " �: " + media);
	}

}
