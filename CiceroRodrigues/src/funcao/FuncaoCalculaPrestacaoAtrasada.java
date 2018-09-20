package funcao;
import javax.swing.JOptionPane;
public class FuncaoCalculaPrestacaoAtrasada {

	public static double prestacao(double v, double t, double te){
		double calculo;
		calculo = v + (v * t /100 * te);
		return calculo;
	}
	public static void main(String[] args) {
	//prestação = valor + (valor x taxa/100 x tempo), 
		double valor, taxa, tempo;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser pago:"));
		taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa por mês:"));
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo em meses:"));
		
		JOptionPane.showMessageDialog(null, prestacao(valor, taxa, tempo));
	}
}
