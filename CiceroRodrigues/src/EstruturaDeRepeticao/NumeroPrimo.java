package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		boolean ehPrimo = true;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
		
		for(int i=2; i<numero; i++){
			if(numero%i==0){
				ehPrimo = false;
				break;
			}
		}
		if (ehPrimo){
			JOptionPane.showMessageDialog(null, numero + " é primo:");
		} else{
			JOptionPane.showMessageDialog(null, numero + " não é primo:");
		}
	}

}
