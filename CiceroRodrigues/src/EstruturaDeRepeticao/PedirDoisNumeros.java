package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class PedirDoisNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B;
		
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero A:"));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero B:"));
		
		for (int n = A; n <= B; n = n+1){
			JOptionPane.showMessageDialog(null, n);
		}
	}

}
