package funcao;
import javax.swing.JOptionPane;
public class FuncaoSomaTresNumeros {

	public static int soma(int n1, int n2, int n3, int n4) {
		int resultado;
		
		resultado = n1 + n2 + n3 + n4;
		
		return resultado;
		
	}
	public static void main(String[] args) {

		int numero1, numero2, numero3, numero4;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero: "));
		numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto n�mero: "));
		
		JOptionPane.showMessageDialog(null, soma(numero1, numero2, numero3, numero4));

	}

}
