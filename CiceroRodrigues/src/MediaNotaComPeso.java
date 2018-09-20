import javax.swing.JOptionPane;

public class MediaNotaComPeso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, peso1, nota2, peso2, nota3, peso3, media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
		
		peso1 = 2;
		peso2 = 3;
		peso3 = 5;
		
		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		
		JOptionPane.showMessageDialog(null, "A média do aluno foi: " + media);
	}

}
