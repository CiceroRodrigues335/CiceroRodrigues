package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class PedirVezesEMostrarOi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double vezes;
		
		vezes = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de vezes a ser repitido:"));
		
		for (int n = 1 ; n <= vezes; n = n+1){
			JOptionPane.showMessageDialog(null, "oi");
		}
		}

}
