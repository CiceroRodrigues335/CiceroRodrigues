package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class MostraNomeMesIFELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double mes;
		
		mes = Double.parseDouble(JOptionPane.showInputDialog
				("Digite algum número entre 1 e 12 \npara saber o mês correspondente"));		
		
		if(mes == 1)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Janeiro");
		else if(mes == 2)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Fevereiro");
		else if(mes == 3)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Março");
		else if(mes == 4)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Abril");
		else if(mes == 5)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Maio");
		else if(mes == 6)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Junho");
		else if(mes == 7)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Julho");
		else if(mes == 8)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Agosto");
		else if(mes == 9)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Setembro");
		else if(mes == 10)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Outubro");
		else if(mes == 11)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Novembro");
		else if(mes == 12)
			JOptionPane.showMessageDialog(null, "O número: " + mes + " é referente ao mês de Dezembro");
		else
			JOptionPane.showMessageDialog(null, "Digite um valor entre 1 e 12!");
	}

}
