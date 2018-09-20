package AutoAvaliacao;

import javax.swing.JOptionPane;

public class LataTinta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tamanho, watts, tamanho2, watts2;
		
		watts = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de watts/h"));
		
		watts2 = 400;
		tamanho = 1.2;
		tamanho2 = (tamanho * watts) / watts2;
		
		JOptionPane.showMessageDialog(null, tamanho2 + " metros quadrados.");
	}

}
