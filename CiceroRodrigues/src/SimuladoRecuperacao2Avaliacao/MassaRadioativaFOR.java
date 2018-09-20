package SimuladoRecuperacao2Avaliacao;

import javax.swing.JOptionPane;

public class MassaRadioativaFOR {

	public static double funcao(double a){
		double tempo = 0;
		for(; a >= 0.05; a = a / 2){
			tempo = tempo + 30;
		}
		return tempo;
	}
	public static void main(String[] args) {
		double massa;
		massa = Double.parseDouble(JOptionPane.showInputDialog("Digite a massa em gramas:"));
		JOptionPane.showMessageDialog(null, funcao(massa) + " segundos");
	}

}
