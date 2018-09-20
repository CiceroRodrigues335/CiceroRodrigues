package ListasExercicios;

import javax.swing.JOptionPane;

public class L1Q4LerIdadesAte0 {

	public static void main(String[] args) {
	
		int i = 1, contadora = 0, somadora = 0;
		double media;
		
		while(i!=0){
			i = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
			contadora = contadora + 1;
			somadora = somadora + i;
		}
		media = somadora / (contadora - 1);
		JOptionPane.showMessageDialog(null, "Média das idades: " + media);
	}
}