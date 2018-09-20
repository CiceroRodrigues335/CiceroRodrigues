package ListasExercicios;

import javax.swing.JOptionPane;

public class L1Q1Idade {

	public static void main(String[] args) {
		
		int idade, nascimento, atual;
		
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		
		if(nascimento > atual){
			idade = nascimento - atual;
		} else{
		idade = atual - nascimento;
		}
		JOptionPane.showMessageDialog(null, idade + " anos de idade.");
	}

}