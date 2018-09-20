package LPOO2017;

import javax.swing.JOptionPane;

public class L1Q1CalcuIdade {

	public static void main(String[] args) {
		// Escreva um programa que calcule a idade do usuário. 
		//Para isso, o programa deve ler o ano de nascimento, o ano atual e depois mostrar a idade.  
		//Obs.: O ano deve ser informado no formato AAAA (ex.: 1980).
		
		int idade, anoAtual, anoNasci;
		
		anoNasci = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		
		if(anoNasci > anoAtual) {
			JOptionPane.showMessageDialog(null, "O ano de nascimento não pode ser maior que o atual!");
		}else if(anoNasci <= anoAtual) {
		
		idade = anoAtual - anoNasci;
		
		JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
		}

	}

}
