import javax.swing.JOptionPane;

public class ConversorDeMoedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valorDolar, valorReal, cotacaoDolar;
	
		valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares a ser convertido"));
		
		cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação do Dolar"));
		
		valorReal = valorDolar * cotacaoDolar;
		
		JOptionPane.showMessageDialog(null, "Valor em dólares: " + valorDolar + " US$\n" + 
		"Valor em reais: " + valorReal + " R$");
		
	}

}
