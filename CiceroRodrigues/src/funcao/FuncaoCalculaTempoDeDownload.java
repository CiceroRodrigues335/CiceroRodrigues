package funcao;
import javax.swing.JOptionPane;
//Desenvolva um programa que contenha uma função que receba o tamanho de 
//um arquivo (em MiB) e a velocidade do link de Internet (em Mbps) e retorne o 
//tempo aproximado (em minutos) de download deste arquivo. A seguir, desenvolva 
//um código no procedimento  main()  que solicite ao usuário que informe o tamanho 
//de um arquivo qualquer, a velocidade do link de Internet e, utilizando a função 
//criada, mostre na tela quanto tempo levará para realizar o download. 
//Observação: 1 Byte possui 8 bits; 1 MiB possui 1.048.576 Bytes; 1Mbps são 1.000.000 de bits por segundo.
public class FuncaoCalculaTempoDeDownload {

	public static double download(double tamanho, double velocidade){
		double calculo, conversor;
		calculo = ((tamanho * 8000000)/ 1000000) / velocidade;
		conversor = calculo / 60;
		return conversor;
	}
	
	public static void main(String[] args) {

		double tamanho, velocidade;
		
		tamanho = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do arquivo em Mebibits:"));
		velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade da internet em Megabits/s:"));
		
		JOptionPane.showMessageDialog(null, download(tamanho, velocidade) + " min.");
	}

}
