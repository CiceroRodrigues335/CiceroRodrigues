package LPOO2017;

import javax.swing.JOptionPane;

public class L2Q1Ler10NumSomar {

	public static void main(String[] args) {
		// Escreva um programa que leia 10 n�meros e armazene em um vetor. Em seguida, mostre a soma desses n�meros.
		
		double numero, soma = 0;
		
		for(int i = 0; i < 10; i++) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite  o " + (i+1) + "� n�mero:"));
			soma += numero;
		}
		JOptionPane.showMessageDialog(null, "A soma �: " + soma);
	}

}
