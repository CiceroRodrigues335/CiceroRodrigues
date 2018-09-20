package funcao;
import javax.swing.JOptionPane;
public class FuncaoEhPrimo {
	public static boolean verificar(int n) {
		boolean ehPrimo;
		ehPrimo = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				ehPrimo = false;
				break;
			}
		}
		return ehPrimo;
	}
	public static void main(String[] args) {
	int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		JOptionPane.showMessageDialog(null, verificar(numero));

	}

}
