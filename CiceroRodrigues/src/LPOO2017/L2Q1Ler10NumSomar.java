package LPOO2017;

import javax.swing.JOptionPane;

public class L2Q1Ler10NumSomar {

	public static void main(String[] args) {
		// Escreva um programa que leia 10 números e armazene em um vetor. Em seguida, mostre a soma desses números.
		
		double numero, soma = 0;
		
		for(int i = 0; i < 10; i++) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite  o " + (i+1) + "º número:"));
			soma += numero;
		}
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);
	}

}
