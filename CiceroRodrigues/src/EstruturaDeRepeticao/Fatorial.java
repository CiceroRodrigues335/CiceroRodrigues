package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {

		int n, fatorial = 1;
		String C = "";
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para fatorar:"));
		
		for (int i = 1; i <= n; i++){
			fatorial = fatorial * i;
			C = C + ", " + fatorial;
		}JOptionPane.showMessageDialog(null, C);	
	}
}