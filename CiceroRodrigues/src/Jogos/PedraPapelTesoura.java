package Jogos;

import javax.swing.JOptionPane;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int J1, J2;
		int pedra = 0, papel = 1, tesoura = 2;
		
		J1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1\n0 - Pedra, 1 - Papel, 2 - Tesoura:"));
		J2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2\n0 - Pedra, 1 - Papel, 2 - Tesoura:"));
		
		if (J1 == pedra && J2 == pedra || J1 == papel && J2 == papel || J1 == tesoura && J2 == tesoura){
			JOptionPane.showMessageDialog(null, "Empate!");
			// Empates
		} else if (J1 == pedra && J2 == tesoura || J1 == papel && J2 == pedra || J1 == tesoura && J2 == papel){
			JOptionPane.showMessageDialog(null, "Jogador 1 venceu!");
			//Vitórias J1
		} else if (J1 == pedra && J2 == papel || J1 == papel && J2 == tesoura || J1 == tesoura && J2 == pedra){
			JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
			//Vitórias J2
		} else {
			JOptionPane.showMessageDialog(null, "Digite valores correspondentes:\n0 - pedra, 1 - papel, 2 - tesoura.");
		}
		
	}

}
