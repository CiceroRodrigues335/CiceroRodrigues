package LPOO2017;

import javax.swing.JOptionPane;

public class L2Q3Ler10NotasMediaEAprovados {

	public static void main(String[] args) {
		//Leia as notas de 10 alunos e armazene em um vetor. 
		//Calcule a media das notas informadas e mostre quantos alunos ficaram acima da m�dia.  
		
		 int aprovados = 0;
		 int quantNotas;
		 
		 quantNotas = Integer.parseInt(JOptionPane.showInputDialog("Atualmente s�o usadas quantas notas para calcular a m�dia na sua escola?")); 
		 
		 for(int i = 0; i < 10; i++) {
			 double somadora = 0;
			 for(int e = 0; e < quantNotas; e++) {
				 double notas = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (e+1) + "� nota do " + (i+1) + "� aluno:"));
				 somadora += notas;
			 }
			 double media = somadora / quantNotas;
			 if (media >= 6) {
				 aprovados++;
			 }
		 }
		 JOptionPane.showMessageDialog(null, "A quantidade de aprovados �: " + aprovados);
	}

}
