import javax.swing.JOptionPane;

public class CalcularPrestacaoAtrasada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valorPrestacao, taxaJuros, quantDias, prestacao;
		
		valorPrestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação:"));
		
		taxaJuros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa de juros:"));
		
		quantDias = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de dias em atraso:"));
		
		prestacao = valorPrestacao + (valorPrestacao * taxaJuros / 100 * quantDias);
		
		JOptionPane.showMessageDialog(null,"O valor da prestação em atraso será de: " + prestacao + " R$");
		
	}

}
