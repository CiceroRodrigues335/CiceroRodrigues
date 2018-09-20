package ListasExercicios;

import javax.swing.JOptionPane;

public class L1Q2AlturaEMedia {

	public static void main(String[] args) {
		
		double alturas, somadora = 0;
		int i = 0;
		while(i < 5){
			alturas = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
			somadora = somadora + alturas;
			i++;
		}
		JOptionPane.showMessageDialog(null, "Média das 5 alturas:" + somadora/5);
	}
}