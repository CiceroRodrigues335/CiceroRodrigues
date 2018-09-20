package Correcao2Avaliacao;

import javax.swing.JOptionPane;

public class ImaparesEPares2e3 {

	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		String C = "", D = "";
		for (int i = a; i <= b; i++){
			if(i % 2 == 0){
				if(i % 2 == 0 && i % 3 == 0)
				C = C + " " + i;
			} else if ( i % 2 == 1){
				D = D + " " + i;
			} 
		}JOptionPane.showMessageDialog(null, "Entre os números " + a + " e " + b + " existem os números:\n" 
			+ "- Impares: " + D + "\n- Pares divisivéis por 2 e 3: " + C);
	}
}
