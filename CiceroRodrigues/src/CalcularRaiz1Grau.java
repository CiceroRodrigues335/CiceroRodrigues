import javax.swing.JOptionPane;

public class CalcularRaiz1Grau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double coeficienteA, coeficienteB, raiz;
		
		coeficienteA = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A:"));
	
		coeficienteB = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B:"));
		
		raiz = -coeficienteB / coeficienteA;
		
		JOptionPane.showMessageDialog(null, "A raiz da equação é: " + raiz);	
	}

}
