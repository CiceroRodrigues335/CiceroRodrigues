package LPOO2017;

import javax.swing.JOptionPane;

public class L2Q5ArmazenarELerNomes {

	public static void main(String[] args) {
		// Escreva um programa que leia o nome de X pessoas. Após ler todos os nomes,
		// pergunte ao usuário o nome que ele deseja consultar e verifique se este nome
		// consta na lista. Obs.: O número de pessoas deve ser determinado pelo usuário.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas que deseja armazenar o nome:"));
		
		for(int i = 0; i < numero; i++) {
			String nomes = JOptionPane.showInputDialog("Digite o nome da " + (i+1) + "ª cliente:");
			
			
		}

	}

}
