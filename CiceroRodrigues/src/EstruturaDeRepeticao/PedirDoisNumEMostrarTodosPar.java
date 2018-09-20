package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class PedirDoisNumEMostrarTodosPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B;
		String C = "";
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero A:"));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero B:"));
		
		for (int n = A; n <= B; n = n+1){
			if (n % 2 == 0){
				C = C + " " + n;
			}
		}
		JOptionPane.showMessageDialog(null, C);
	}

}
