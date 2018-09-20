import javax.swing.JOptionPane;

public class SalarioEComissao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double produtos, salarioFinal;
		
		produtos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de produtos vendidos:"));
		
		salarioFinal = 1000 + produtos * 25;
		
		JOptionPane.showMessageDialog(null,"o salário do vendedor será: " + salarioFinal + " R$");
	
	}

}
