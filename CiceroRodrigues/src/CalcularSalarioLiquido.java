import javax.swing.JOptionPane;

public class CalcularSalarioLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salarioBruto, salarioLiquido;
		
		salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário bruto:"));
		
		salarioLiquido = salarioBruto - (salarioBruto * 0.09);
		
		JOptionPane.showMessageDialog(null,"O valor do salário liquido é: " + salarioLiquido + "R$");
		
		
	}

}
