package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base, expoente, potencia = 1;
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
		expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente"));
		
		if (base==0&&expoente==0){
			JOptionPane.showMessageDialog(null, "Indeterminado");
		} else{
		for(int i=1; i<=expoente; i++){
			potencia = potencia * base;
		}JOptionPane.showMessageDialog(null, "resultado: " + potencia);
		}
	}
}