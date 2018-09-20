package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class NumeroPrimoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		boolean ehPrimo = true;
		int i=2;
				
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
		
		while (i<numero){
			if(numero%i==0){
				ehPrimo = false;
				i++;
			}
		}
		if (ehPrimo){
			JOptionPane.showMessageDialog(null, numero + " é primo:");
		} else{
			JOptionPane.showMessageDialog(null, numero + " não é primo:");
		}	
	}

}
