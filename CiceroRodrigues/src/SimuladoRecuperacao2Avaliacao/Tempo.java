package SimuladoRecuperacao2Avaliacao;

import javax.swing.JOptionPane;

public class Tempo {
	public static int funcao(int a, int b, int c){
		int calculador;
		a = a * 365;
		b = b * 30;
		calculador = a + b + c;
		return calculador;
	}
	public static void main(String[] args) {
		int anos, meses, dias;
		anos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de anos:"));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de meses:"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de dias:"));
		JOptionPane.showMessageDialog(null, funcao(anos,meses,dias) + " dias");
	}
}
