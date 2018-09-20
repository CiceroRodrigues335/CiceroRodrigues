package Correcao2Avaliacao;

import javax.swing.JOptionPane;

public class MultaTransito {

	public static double funcao(double a, double b){
		double calculo;
		calculo = a - b;
		if(calculo > 0 && calculo <= 10){
			calculo = 150;
		} else if(calculo > 10 && calculo <= 30){
			calculo = 230;
		} else if(calculo > 30){
			calculo = 520;
		} else{
			calculo = 0;
		}
		return calculo;
	}
	public static void main(String[] args) {
		double vmotorista, vmaxima;
		vmotorista = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do motorista:"));
		vmaxima = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade máxima permitida:"));
		JOptionPane.showMessageDialog(null, "Multa de: R$ " + funcao(vmotorista,vmaxima));
	}

}
