package Correcao2Avaliacao;

import javax.swing.JOptionPane;

public class NotaMaiorEMenor {

	public static void main(String[] args) {
	
		double maior = 0, menor = 10, media = 0;
		
		for(int i = 0; i < 50; i++){
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
			
			if(nota > maior){
				maior = nota;
			}
			if(nota < menor){
				menor = nota;
			}
			media = media + nota;
		}
		media = media / 50;
		JOptionPane.showMessageDialog(null, "Maior nota: " + maior + "\nMenor nota: " + menor 
				+ "\nMédia: " + media);
	}

}
