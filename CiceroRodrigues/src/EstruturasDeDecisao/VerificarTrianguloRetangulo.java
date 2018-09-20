package EstruturasDeDecisao;

import javax.swing.JOptionPane;

public class VerificarTrianguloRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double verificacao1, verificacao2, cateto1, cateto2, hipotenusa;
		
		hipotenusa = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamamho da hipotenusa (lado maior do triangulo):"));
		cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho de um cateto (lado menor que a hipotenusa do triangulo)"));
		cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do ultimo cateto:"));
		
		verificacao1 = (cateto1 * cateto1) + (cateto2 * cateto2);
		verificacao2 = hipotenusa * hipotenusa;
		
		if(verificacao1 == verificacao2)
			JOptionPane.showMessageDialog(null, "Seu triangulo é um triangulo retângulo");
		else
			JOptionPane.showMessageDialog(null, "Seu triangulo não é um triagulo retângulo");
		
	}

}
