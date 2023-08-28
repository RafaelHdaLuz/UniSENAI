package Switch;

import javax.swing.JOptionPane;

public class exerciseDoisPontoZero {

	public static void main(String[] args) {

		// entrada de dados
		String palavra = JOptionPane.showInputDialog("Digite uma letra");

		// validacao
		while (palavra.length() > 1) {
			palavra = JOptionPane.showInputDialog("Digite somente um caracter, bobao");
		}

		int palavra1 = 0;

		if (!Character.isLetter(palavra.charAt(palavra1))) {
			palavra1 = 1;
		} else if (palavra.equalsIgnoreCase("a") || palavra.equalsIgnoreCase("e") || palavra.equalsIgnoreCase("i")
				|| palavra.equalsIgnoreCase("o") || palavra.equalsIgnoreCase("u")) {
			palavra1 = 2;
		} else {
			palavra1 = 3;
		}

		switch (palavra1) {
		case 1:
			JOptionPane.showMessageDialog(null, "Caractere especial", null, JOptionPane.INFORMATION_MESSAGE);
			break;

		case 2:
			JOptionPane.showMessageDialog(null, "Vogal", null, JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Consoante", null, JOptionPane.INFORMATION_MESSAGE);
		default:
			JOptionPane.showMessageDialog(null, "Se fu malandro", null, JOptionPane.INFORMATION_MESSAGE);
			break;
		}

	}

}
