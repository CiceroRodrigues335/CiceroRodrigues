package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class PedirVezesEMostrarNumDecrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int vezes;
		
		vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes a ser repitido:"));
		
		for (int n = vezes; n >= 1; n = n-1){
			JOptionPane.showMessageDialog(null, n);
		}
	}

}
