import javax.swing.JOptionPane;

public class CalcularPrestacaoAtrasada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valorPrestacao, taxaJuros, quantDias, prestacao;
		
		valorPrestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da presta��o:"));
		
		taxaJuros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa de juros:"));
		
		quantDias = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de dias em atraso:"));
		
		prestacao = valorPrestacao + (valorPrestacao * taxaJuros / 100 * quantDias);
		
		JOptionPane.showMessageDialog(null,"O valor da presta��o em atraso ser� de: " + prestacao + " R$");
		
	}

}
