package LPOO2017;

import javax.swing.JOptionPane;

public class L1Q5LerDoisNumEOperacao {

	public static void main(String[] args) {
		// Escreva um programa que leia dois n�meros e a opera��o aritm�tica desejada.   
		//Se o usu�rio digita �+�, retorne o resultado da soma entre os n�meros; 
		//Se o usu�rio digita �-�, retorne o resultado da subtra��o entre os n�meros; 
		//Se o usu�rio digita �*�, retorne o resultado da multiplica��o entre os n�meros; 
		//Se o usu�rio digita �/�, retorne o resultado da divis�o entre os n�meros; 
		
		double numero1, numero2, resultado;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int operador = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero referente a um operador:"
				+ "\n(1) + (soma)\n(2) - (subtra��o)\n(3) * (multiplica��o)\n(4) / (divis�o)"));
		
		if(operador == 1) {
			resultado = numero1 + numero2;
			JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " + " + numero2 + " � igual a " + resultado);
		} else if(operador == 2) {
			resultado = numero1 - numero2;
			JOptionPane.showMessageDialog(null, "A subtra��o de " + numero1 + " - " + numero2 + " � igual a " + resultado);
		} else if(operador == 3) {
			resultado = numero1 * numero2;
			JOptionPane.showMessageDialog(null, "A multiplica��o de " + numero1 + " * " + numero2 + " � igual a " + resultado);
		} else if(operador == 4) {
			resultado = numero1 / numero2;
			JOptionPane.showMessageDialog(null, "A divis�o de " + numero1 + " / " + numero2 + " � igual a " + resultado);
		}
	}

}
