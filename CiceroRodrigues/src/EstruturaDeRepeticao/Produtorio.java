package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class Produtorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, produto = 1;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		for (int i = 1; i <= n; i++){
			produto = produto * i;
		}JOptionPane.showMessageDialog(null, produto);
	}

}
