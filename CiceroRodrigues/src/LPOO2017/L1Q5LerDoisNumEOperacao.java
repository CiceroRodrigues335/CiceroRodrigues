package LPOO2017;

import javax.swing.JOptionPane;

public class L1Q5LerDoisNumEOperacao {

	public static void main(String[] args) {
		// Escreva um programa que leia dois números e a operação aritmética desejada.   
		//Se o usuário digita ‘+’, retorne o resultado da soma entre os números; 
		//Se o usuário digita ‘-’, retorne o resultado da subtração entre os números; 
		//Se o usuário digita ‘*’, retorne o resultado da multiplicação entre os números; 
		//Se o usuário digita ‘/’, retorne o resultado da divisão entre os números; 
		
		double numero1, numero2, resultado;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
		int operador = Integer.parseInt(JOptionPane.showInputDialog("Digite um número referente a um operador:"
				+ "\n(1) + (soma)\n(2) - (subtração)\n(3) * (multiplicação)\n(4) / (divisão)"));
		
		if(operador == 1) {
			resultado = numero1 + numero2;
			JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " + " + numero2 + " é igual a " + resultado);
		} else if(operador == 2) {
			resultado = numero1 - numero2;
			JOptionPane.showMessageDialog(null, "A subtração de " + numero1 + " - " + numero2 + " é igual a " + resultado);
		} else if(operador == 3) {
			resultado = numero1 * numero2;
			JOptionPane.showMessageDialog(null, "A multiplicação de " + numero1 + " * " + numero2 + " é igual a " + resultado);
		} else if(operador == 4) {
			resultado = numero1 / numero2;
			JOptionPane.showMessageDialog(null, "A divisão de " + numero1 + " / " + numero2 + " é igual a " + resultado);
		}
	}

}
