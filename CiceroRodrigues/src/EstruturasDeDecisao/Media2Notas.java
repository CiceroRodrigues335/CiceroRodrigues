package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class Media2Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media ,nota1, nota2;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		
		media = (nota1 + nota2) / 2;
		
		if (media >=6) {
			JOptionPane.showMessageDialog(null, "Média: " + media + " - Aprovado!");
		} else{
			JOptionPane.showMessageDialog(null, "Média: " + media + " - Reprovado!");
		}
		
	}

}
