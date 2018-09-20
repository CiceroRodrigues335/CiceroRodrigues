package Correcao2Avaliacao;

import javax.swing.JOptionPane;

public class NotasAbaixoMedia {

	public static double funcao(double a, double b, double c, double d, double e){
		double media, calculo = 0;
		media = (a+b+c+d+e)/5;
		if (a<media){
			calculo++;
		}if(b<media){
			calculo++;
		}if(c<media){
			calculo++;
		}if(d<media){
			calculo++;
		}if(e<media){
			calculo++;
		}
		return calculo;
	}
	public static void main(String[] args) {
		double a, b, c, d, e;
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
		d = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
		e = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
		
		JOptionPane.showMessageDialog(null, "A quantidade de notas abaixo da média é " + funcao(a,b,c,d,e));

	}

}
