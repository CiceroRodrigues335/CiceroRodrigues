import javax.swing.JOptionPane;

public class CalcularComissao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valorVenda, valorComissao, comissao;
		
		valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda"));
		
		valorComissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual da comissão"));
		
		comissao = valorVenda * valorComissao / 100;	
		
		JOptionPane.showMessageDialog(null, "O valor da comissão é de: " + comissao);
	}

}
