package funcao;

import javax.swing.JOptionPane;

//Desenvolva um programa que contenha uma fun��o que permita uma cliente converter 
	//uma quantia em d�lares (USD) para reais (RBL), 
	//dado que esta fun��o dever� receber a quantia em d�lares 
	//e a cota��o e retornar o valor em reais. A seguir, desenvolva um c�digo no procedimento  main()  
	//que solicite ao usu�rio que informe a quantia a ser convertida e a cota��o e, 
	//utilizando a fun��o criada, mostre na tela o valor em reais.
public class FuncaoConversaoDeMoedas {
	public static double quantia(double m1, double m2){
		double valorReal;
		valorReal = m1 * m2;
		return valorReal;
	}
	public static void main(String[] args) {
		double valorDolar, cotacaoDolar;
		
		valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em d�lares a ser convertido"));
		
		cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cota��o do Dolar"));
		
		JOptionPane.showMessageDialog(null, quantia(valorDolar, cotacaoDolar));

	}

}
