package SimuladoRecuperacao2Avaliacao;
import javax.swing.JOptionPane;
public class MassaRadioativaWHILE {

	public static double funcao(double massa){
		double tempo = 0;

		while(massa >= 0.05){
			massa = massa / 2;
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
