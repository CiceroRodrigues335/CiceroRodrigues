package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m;
		String tabuada = "";
		
		m = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
		
		for (int n = 1; n <= 10; n++){
			tabuada = tabuada + m + " x " + n + " = " + (n * m) + "\n";
		}
		JOptionPane.showMessageDialog(null, tabuada);
	}

}
