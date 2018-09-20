package funcao;

import javax.swing.JOptionPane;

//Desenvolva um programa que contenha uma função que permita uma cliente converter 
	//uma quantia em dólares (USD) para reais (RBL), 
	//dado que esta função deverá receber a quantia em dólares 
	//e a cotação e retornar o valor em reais. A seguir, desenvolva um código no procedimento  main()  
	//que solicite ao usuário que informe a quantia a ser convertida e a cotação e, 
	//utilizando a função criada, mostre na tela o valor em reais.
public class FuncaoConversaoDeMoedas {
	public static double quantia(double m1, double m2){
		double valorReal;
		valorReal = m1 * m2;
		return valorReal;
	}
	public static void main(String[] args) {
		double valorDolar, cotacaoDolar;
		
		valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares a ser convertido"));
		
		cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação do Dolar"));
		
		JOptionPane.showMessageDialog(null, quantia(valorDolar, cotacaoDolar));

	}

}
