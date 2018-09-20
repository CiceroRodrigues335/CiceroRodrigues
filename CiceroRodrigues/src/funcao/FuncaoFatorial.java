package funcao;

import javax.swing.JOptionPane;

public class FuncaoFatorial {
	public static int fatorado(int n){
		int fatorial = 1;
		
		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}
	public static void main(String[] args) {
		int fatorial;
		fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		JOptionPane.showMessageDialog(null, fatorado(fatorial));
	}
}
