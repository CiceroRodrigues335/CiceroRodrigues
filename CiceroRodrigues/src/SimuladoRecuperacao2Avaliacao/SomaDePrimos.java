package SimuladoRecuperacao2Avaliacao;

import javax.swing.JOptionPane;

public class SomaDePrimos {

	public static int funcao(int a, int b){
		int soma = 0;
		for(int n = a; n <= b; n++){
			boolean ehPrimo = true;
			for(int i = 2; i < n; i++){
				if(n % i == 0){
					ehPrimo = false;
					break;
				}
			}
			if(ehPrimo == true){
				soma = soma + n;
			}
		}
		return soma;
	}
	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero(maior que o primeiro):"));
		JOptionPane.showMessageDialog(null, funcao(a,b));
	}
}
