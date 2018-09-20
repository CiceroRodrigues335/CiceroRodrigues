import javax.swing.JOptionPane;

public class CalcularImpostos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double preco1, preco2, cofins, icms;
		
		preco1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
		
		icms = preco1 * 0.15;
		cofins = preco1 * 0.07;
		
		preco2 = preco1 + icms + cofins;
		
		JOptionPane.showMessageDialog(null,"Preço do produto: " + preco1 + " R$\n" + "ICMS: " + icms + " R$\n"
				+ "COFINS: " + cofins + " R$\n" + " Total: " + preco2 + " R$");
		
	}

}
