package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero, parimpar;
		
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número:"));
		
		parimpar = numero % 2;
		
		if(parimpar < 1)
			JOptionPane.showMessageDialog(null, "o número é PAR: " + numero);
		else
			JOptionPane.showMessageDialog(null, "O número é IMPAR: " + numero);
	}

}
