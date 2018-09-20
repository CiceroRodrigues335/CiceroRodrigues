package LPOO2017;

import javax.swing.JOptionPane;

public class L1Q6LerAlturaCalcIMC {

	public static void main(String[] args) {
		//  Leia o peso e a altura de 05 pessoas e calcule o IMC e armazene em um vetor. Após o termino do programa, imprima as seguintes informações:   
		// O Número de pessoas que estão abaixo do peso (IMC < 18,5);  
		// O Número de pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC < 25);  
		// O Número de pessoas que estão acima do peso (IMC > = 25)  
		
		double calculo;
		int imcbaixo = 0, imcnormal = 0, imcalto = 0;
		
		for (int i = 0; i < 3; i++) {	
			double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da " + (i+1) + "º cliente em quilos:"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Agora digite a altura em metros:"));
			calculo = peso / (altura * altura);
			if(calculo < 18.5) {
				imcbaixo++;
			}else if(calculo >= 18.5 && calculo < 25) {
				imcnormal++;
			}else {
				imcalto++;
			}
		}
		 JOptionPane.showMessageDialog(null, "Pessoas com IMC abaixo do normal: " + imcbaixo 
				 + "\nPessoas com IMC normal: " + imcnormal + "\nPessoas com IMC acima do normal: " + imcalto);

	}

}
