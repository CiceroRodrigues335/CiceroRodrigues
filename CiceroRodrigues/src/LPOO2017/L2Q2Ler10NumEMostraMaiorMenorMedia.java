package LPOO2017;

import javax.swing.JOptionPane;

public final class L2Q2Ler10NumEMostraMaiorMenorMedia {

	public static void main(String[] args) {

		// Escreva um programa que leia 10 números e mostre as seguintes informações:
		// a) Menor valor digitado
		// b) Maior valor digitado
		// c) Média dos valores digitados

		double maior = -999999, menor = 9999999, media, numero, somadora = 0;

		for (int i = 0; i < 10; i++) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número: "));
			if (numero > maior) {
				maior = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
			somadora += numero;
		}
		media = somadora / 10;
		JOptionPane.showMessageDialog(null, "Menor valor:  " + menor + "\nMaior valor: " + maior + "\nMédia dos valores: " + media);
	}

}