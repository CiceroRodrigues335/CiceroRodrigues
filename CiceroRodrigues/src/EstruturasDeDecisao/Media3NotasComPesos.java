package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class Media3NotasComPesos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media, nota1, peso1, nota2, peso2, nota3, peso3;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
		
		peso1 = 2;
		peso2 = 3;
		peso3 = 5;
		
		media = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3)) / (peso1+peso2+peso3);
		
		if(media>=6)
		JOptionPane.showMessageDialog(null, "Média: " + media + " - Aprovado!");
		else
		JOptionPane.showMessageDialog(null, "Média:     " + media + " - Reprovado!");
	}

}
