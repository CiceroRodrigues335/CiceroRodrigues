package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class PedirMediaCWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int teclado, mediaFinal, media = 12;
		
		do{
			teclado = Integer.parseInt(JOptionPane.showInputDialog("1-Calcular Média; \n2-Pontuação Final; \n3-Sair."));
		if (teclado == 1){
			int valor1, valor2, media1;
			valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota:"));
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota:"));
			media1 = (valor1 + valor2) / 2;
			JOptionPane.showMessageDialog(null, " Média = " + media1);
		} else if (teclado == 2){
			int valor3;
			valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a média:"));
			mediaFinal = -(media - valor3) + 12;
			JOptionPane.showMessageDialog(null, "Nota mínima: " + mediaFinal
					);
		} else if (teclado == 3){
			break;
		}
			i++;
		} while(i > 0);
	}

}
