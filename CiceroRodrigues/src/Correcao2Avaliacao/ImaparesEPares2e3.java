package Correcao2Avaliacao;

import javax.swing.JOptionPane;

public class ImaparesEPares2e3 {

	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		String C = "", D = "";
		for (int i = a; i <= b; i++){
			if(i % 2 == 0){
				if(i % 2 == 0 && i % 3 == 0)
				C = C + " " + i;
			} else if ( i % 2 == 1){
				D = D + " " + i;
			} 
		}JOptionPane.showMessageDialog(null, "Entre os n�meros " + a + " e " + b + " existem os n�meros:\n" 
			+ "- Impares: " + D + "\n- Pares divisiv�is por 2 e 3: " + C);
	}
}
