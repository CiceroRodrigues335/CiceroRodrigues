package Correcao2Avaliacao;
import javax.swing.JOptionPane;
public class MelhorHeroi {

	public static void main(String[] args) {
		
		//esse código faz uma votação para melhor herói, onde será repetido a entrada até digitar 0 e apresentar o vencedor mais votado.
		int menu, ironman = 0, batman = 0, superman = 0, spiderman = 0;
		do{
		menu = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para o respectivo herói:\n"
				+ "1 - Iron Man;\n2 - Batman;\n3 - SuperMan;\n4 - SpiderMan;" + "\n0 - sair."));
		if(menu == 1){
			ironman = ironman + 1;
		}else if(menu == 2){
			batman = batman + 1;
		}else if(menu == 3){
			superman = superman + 1;
		}else if(menu == 4){
			spiderman = spiderman + 1;
		}else if(menu == 0){
			JOptionPane.showMessageDialog(null, "Iron Man: " + ironman + "\nBatman: " + batman
					+ "\nSuperman: " + superman + "\nSpiderman: " + spiderman);
			break;
		}else{
			JOptionPane.showMessageDialog(null, "Digite um valor correspondente a um herói ou digite 0(zero) para sair!");
		}
		}while(menu > 0);
	}
}
