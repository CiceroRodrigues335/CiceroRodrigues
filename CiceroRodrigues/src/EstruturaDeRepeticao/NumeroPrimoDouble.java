package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class NumeroPrimoDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Double numero;
		boolean ehPrimo = true;
		
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero:"));
		
		for(int i=2; i<numero; i++){
			if(numero%i==0){
				ehPrimo = false;

			}
		}
		if (ehPrimo){
			JOptionPane.showMessageDialog(null, numero + " é primo:");
		} else{
			JOptionPane.showMessageDialog(null, numero + " não é primo:");
		}
	}

}
