package funcao;
import javax.swing.JOptionPane;
public class FuncaoEhPar {

	public static boolean ehPar(int n) {
		if ( n % 2 ==0){
			return true;
		} else {
			return false;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
	}
	
	public static void main(String[] args) {
	
	int numero;
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
	
	if (ehPar(numero)){
		JOptionPane.showMessageDialog(null, numero + " é par");
	} else {
		JOptionPane.showMessageDialog(null, numero + " é ímpar");
	}

	}

}
