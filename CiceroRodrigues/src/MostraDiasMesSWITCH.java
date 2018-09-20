import javax.swing.JOptionPane;

public class MostraDiasMesSWITCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes;
		
		mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o nº do mês"));
		
		switch(mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			JOptionPane.showMessageDialog(null, "31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			JOptionPane.showMessageDialog(null, "30 dias");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "28 dias");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Mês inválido!");
		}
	}

}
