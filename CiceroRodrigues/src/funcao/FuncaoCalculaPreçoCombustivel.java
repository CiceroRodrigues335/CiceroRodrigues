package funcao;

import javax.swing.JOptionPane;

public class FuncaoCalculaPreçoCombustivel {

	public static double calculo(double c, double q){
		double calculos = 0;
		if (c == 2 && q <= 20){
			calculos = -(q * 0.03) + q;
			// Alcool
		} else if(c == 2 && q > 20){
			calculos = -(q * 0.05) + q;
		} else if (c == 1 && q <= 20){
			calculos = -(q * 0.04) + q;
			//Gasolina
		} else if (c == 1 && q > 20){
			calculos = -(q * 0.06) + q;
		}
		return calculos;
	}
	public static void main(String[] args) {
		
		double menu1, menu2;
		double i = 0;
		
		do{
		menu1 = Double.parseDouble(JOptionPane.showInputDialog("Digite 1 para Gasolina; \nDigite 2 para Álcool;"));
		menu2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de combustível"));
		calculo(menu1, menu2);
		i++;
		} while(i > 0);
	}
}
