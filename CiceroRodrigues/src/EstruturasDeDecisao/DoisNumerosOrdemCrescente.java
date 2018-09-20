package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class DoisNumerosOrdemCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1, numero2;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
		
		if(numero1 > numero2)
			JOptionPane.showMessageDialog(null, "Ordem crescent   e: " + numero2 + ", " + numero1 + ".");
		else if(numero2 > numero1)
			JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero1 + ", " + numero2 + ".");
		else if(numero1 == numero2)
			JOptionPane.showMessageDialog(null, "Os números são iguais!");
	}

}
