package SimuladoRecuperacao2Avaliacao;
import javax.swing.JOptionPane;
public class RecebeTresInteiros {

	public static int funcao(int a, int b, int c){
		int retorno = 0;
		if(a != b && a != c && b != c){
			retorno = 0;
		} else if(a == b && a == c && b == c){
			retorno = 20;
		} else if(a != b && a == c && b == c){
			retorno = 10;
		} else if(a == b && a != c && b == c){
			retorno = 10;
		} else if(a == b && a == c && b != c){
			retorno = 10;
		}
		return retorno;
	}
	public static void main(String[] args) {
		int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número inteiro:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número inteiro:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número inteiro:"));
		JOptionPane.showMessageDialog(null, funcao(a,b,c));
	}
}
