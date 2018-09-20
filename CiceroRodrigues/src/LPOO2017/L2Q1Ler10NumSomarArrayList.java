package LPOO2017;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class L2Q1Ler10NumSomarArrayList {

	public static void main(String[] args) {
		// Escreva um programa que leia 10 números e armazene em um vetor. Em seguida, mostre a soma desses números.
		
		ArrayList<Double> lista = new ArrayList<>();
		String numerosList = "";
		
		double soma = 0;
		
		for(int i = 0; i < 10; i++) {
			double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número:"));
			numerosList += numero + " +";
			lista.add(numero);
			soma += lista.get(i);
		}
		if (!numerosList.isEmpty()) numerosList = numerosList.substring (0, numerosList.length() - 1);
		
		//a linha acima tira o ultimo char da String, a linha baixo o primeiro char:
		//if (!numerosList.isEmpty()) numerosList = numerosList.substring (1);
		
		JOptionPane.showMessageDialog(null, "A soma dos elementos " + numerosList + " é: " + soma);
	}

}