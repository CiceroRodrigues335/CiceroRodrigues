package LPOO2017;

import javax.swing.JOptionPane;

public class L2Q5ArmazenarELerNomes {

	public static void main(String[] args) {
		// Escreva um programa que leia o nome de X pessoas. Ap�s ler todos os nomes,
		// pergunte ao usu�rio o nome que ele deseja consultar e verifique se este nome
		// consta na lista. Obs.: O n�mero de pessoas deve ser determinado pelo usu�rio.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas que deseja armazenar o nome:"));
		
		for(int i = 0; i < numero; i++) {
			String nomes = JOptionPane.showInputDialog("Digite o nome da " + (i+1) + "� cliente:");
			
			
		}

	}

}
