package AutoAvaliacao;

import javax.swing.JOptionPane;

public class GastoCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double distancia, consumo, preco, valor, resultado;
		
		distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância em Km"));
		consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite o consumo em L/km"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do combustível em R$"));
		
		valor = (distancia / consumo);
		resultado = valor * preco;
		
		JOptionPane.showMessageDialog(null, resultado + " R$");
	}

}
