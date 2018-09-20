package LPOO2017;

import javax.swing.JOptionPane;

public class L1Q3ImprimirPares0a30 {

	public static void main(String[] args) {
		//  Escreva um programa que imprima os números pares entre 0 e 30.
		
		int teste;
		String par = " ";
		for(int i = 1; i <= 30; i++) {
			teste = i;
			if (teste % 2 == 0) {
				par = par + teste + ", ";
			}
		}
		JOptionPane.showMessageDialog(null, "Os números pares entre 0 e 30 são" + par + ".");
	}

}
