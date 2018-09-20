package Jogos;

import javax.swing.JOptionPane;

public class PedraPapelTesouraMelhor3 {

	public static void main(String[] args) {
		// Pedra Papel Tesoura entre dois jogadores em melhor de 3.

		int J1, J2, empate = 0, vitJ1 = 0, vitJ2 = 0;
		int pedra = 0, papel = 1, tesoura = 2;
		
		for (int n = 1; n <= 3; n = n+1){
		
		J1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1\n0 - Pedra, 1 - Papel, 2 - Tesoura"));
		J2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2\n0 - Pedra, 1 - Papel, 2 - Tesoura"));
		
		if (J1 == pedra && J2 == pedra || J1 == papel && J2 == papel || J1 == tesoura && J2 == tesoura){
			JOptionPane.showMessageDialog(null, "Empate!");
			empate++;
			// Empates
		} else if (J1 == pedra && J2 == tesoura || J1 == papel && J2 == pedra || J1 == tesoura && J2 == papel){
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu!");
			vitJ1++;
			//Vitórias J1
		} else if (J1 == pedra && J2 == papel || J1 == papel && J2 == tesoura || J1 == tesoura && J2 == pedra){
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
			vitJ2++;
			//Vitórias J2
		} else {
			JOptionPane.showMessageDialog(null, "Digite valores correspondentes:\n0 - pedra, 1 - papel, 2 - tesoura.");
		}
	}JOptionPane.showMessageDialog(null, "Vitórias do jogador 1: " + vitJ1 + "\nVitórias do jogador 2: "
			+ vitJ2 + "\n Empates: " + empate);

	}

}
