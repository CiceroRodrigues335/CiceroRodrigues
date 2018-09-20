package EstruturaDeRepeticao;
import javax.swing.JOptionPane;
public class FatorialWhile {
	
	public static void main(String[] args) {
		int n, fatorial = 1;
		int i = 1;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para fatorar:"));
		
		while ( i <= n){
			fatorial = fatorial * i;
			JOptionPane.showMessageDialog(null, fatorial);
			i++;
		}
	}
}
