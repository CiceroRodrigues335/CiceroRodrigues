package LPOO2017;

import javax.swing.JOptionPane;

public class L1Q4LerIdadeECalcuMediaSair0 {

	public static void main(String[] args) {
		//  Escreva um programa que leia a idade de v�rias pessoas e calcule a m�dia. 
		//O programa deve ler as idades at� o usu�rio digitar 0 (zero).
		
		int numero = 0, idade, soma = 0;
		double media;
		
		do {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade ou 0 para sair:"));
			for (int i = 1; i < 999999999; i++) {
				soma = soma + idade;
				numero = numero + i;
			}
		} while(idade!=0);
		media = soma / numero;
		JOptionPane.showMessageDialog(null, "A m�dia das idades �: " + media);
	}

}
