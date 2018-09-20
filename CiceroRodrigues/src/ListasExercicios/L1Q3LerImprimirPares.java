package ListasExercicios;

import javax.swing.JOptionPane;

public class L1Q3LerImprimirPares {

	public static void main(String[] args) {
		
		String C = "";
		
		for(int n = 1; n < 30; n++){
			if(n % 2 == 0){
				C = C + ", " + n;
			}
		}
		JOptionPane.showMessageDialog(null, C);
	} 
}