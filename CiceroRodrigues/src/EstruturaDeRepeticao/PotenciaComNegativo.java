package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class PotenciaComNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean neg = false;
		
		int base, expoente;
		
		double p = 1;
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
		expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente"));
		
		if (base == 0 && expoente == 0){
			JOptionPane.showMessageDialog(null,  "inválido");
		} else {
			if(expoente < 0){
				expoente = -expoente;
				neg = true;
			} 
		}
		for(int i = 1; i <= expoente; i++){
			p = p * base;
		}
		if (neg == true){
			p = 1 / p;
		}
		JOptionPane.showMessageDialog(null, p);
	} 

}

