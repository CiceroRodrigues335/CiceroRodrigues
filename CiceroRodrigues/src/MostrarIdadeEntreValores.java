import javax.swing.JOptionPane;
public class MostrarIdadeEntreValores {
	public static void main(String[] args) {
		int idade;
		do{
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
		} while(idade<=18||idade>=90);
		JOptionPane.showMessageDialog(null, idade);
	}
}
