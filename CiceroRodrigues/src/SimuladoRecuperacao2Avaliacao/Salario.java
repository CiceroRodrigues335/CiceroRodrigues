package SimuladoRecuperacao2Avaliacao;
import javax.swing.JOptionPane;
public class Salario {
	public static double funcao(double a, double b){
		double calculo, impostos, vendas;
		impostos = a - a * 0.27;
		vendas = b * 15;
		calculo = impostos + vendas;
		return calculo;
	}
	public static void main(String[] args) {

		double a, b;
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário bruto:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de produtos vendidos:"));
		JOptionPane.showMessageDialog(null, "Salário a ser pago: R$ " + funcao(a,b) + "");
	}
}
