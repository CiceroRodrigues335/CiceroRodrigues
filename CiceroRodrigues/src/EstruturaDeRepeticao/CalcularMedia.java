package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class CalcularMedia {
	public static double calculaMedia() {
		double nota1, nota2, media;
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        media = (nota1 + nota2) / 2;
        return media;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media, notaFinal;
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a op��o:\n"
                            + "1) M�dia\n"
                            + "2) Aprova��o\n"
                            + "3) M�nimo Final\n"
                            + "0) Sair\n"));
            switch (opcao) {
            case 1:
                media = calculaMedia();
                JOptionPane.showMessageDialog(null, "M�dia: " + media);
                break;
            case 2:
                media = calculaMedia();
                if (media >= 6.0) {
                    JOptionPane.showMessageDialog(null, "O estudante est� aprovado!");
                } else {
                    JOptionPane.showMessageDialog(null, "O estudante est� reprovado!"
                    		+ "");
                }
                break;
            case 3:
               media = calculaMedia();
                notaFinal = 12 - media;
                JOptionPane.showMessageDialog(null, "Sua nota m�nima na final dever� ser " + notaFinal);
                break;
            case 0:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
            }
        } while (opcao != 0);
    }
}