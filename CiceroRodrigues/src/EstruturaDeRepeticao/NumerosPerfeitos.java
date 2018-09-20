package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class NumerosPerfeitos {

	public static void main(String[] args) {
		
		double numero, soma = 0;
		
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero:"));
		
		if(numero <= 0){
			JOptionPane.showMessageDialog(null, "Digite um valor maior que 0!");
		} else {
		
		for(int i = 1; i < numero; i++){
			if(numero % i == 0){
			soma = soma + i;
			} 
		} if (soma == numero){
			JOptionPane.showMessageDialog(null, "É perfeito!");
		} else {
			JOptionPane.showMessageDialog(null, "Não perfeito!");
		}
	} 
}	
}
