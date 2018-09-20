import javax.swing.JOptionPane;

public class CalcularCapacidadeCaixaAguaRetangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double comprimento, largura, altura, volume, capacidade;
		
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento:"));
		
		largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura:"));
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
		
		volume = comprimento * largura * altura;
		
		capacidade = volume * 1000;
		
		JOptionPane.showMessageDialog(null, "Capacidade da caixa de água é de " + capacidade + " litros");
		
	}

}
