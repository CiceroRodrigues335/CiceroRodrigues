import javax.swing.JOptionPane;

public class ConversorDeMoedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valorDolar, valorReal, cotacaoDolar;
	
		valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em d�lares a ser convertido"));
		
		cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cota��o do Dolar"));
		
		valorReal = valorDolar * cotacaoDolar;
		
		JOptionPane.showMessageDialog(null, "Valor em d�lares: " + valorDolar + " US$\n" + 
		"Valor em reais: " + valorReal + " R$");
		
	}

}
