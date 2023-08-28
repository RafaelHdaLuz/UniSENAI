/*
 * Construa um programa que solicita ao usuário uma frase. Ao final, indique quantas
vogais, consoantes, espaços e outros caracteres compõem essa frase.

 */
package For;

import javax.swing.JOptionPane;

public class exercise02 {

	public static void main(String[] args) {

		String frase = JOptionPane.showInputDialog("Digite uma frase");

		int vogal = 0;
		int consoante = 0;
		int caracEsp = 0;
		int contSpace = 0;

		for (int i = 0; i < frase.length(); i++) {
			String frase2 = String.valueOf(frase.charAt(i));
			
			// Validar se é vogal
			if (frase2.equalsIgnoreCase("a") || frase2.equalsIgnoreCase("e") || frase2.equalsIgnoreCase("i")
					|| frase2.equalsIgnoreCase("o") || frase2.equalsIgnoreCase("u")) {
				vogal++;
			} else if (frase.charAt(i) == ' ') {
				contSpace++;
			} else if (!Character.isLetter(frase.charAt(i))) {
				caracEsp++;
			} else {
				consoante++;
			}

		}

		JOptionPane.showMessageDialog(null, "Quantidade de caracteres especiais = " + caracEsp, null,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Quantidade de vogais = " + vogal, null, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Quantidade de consoante = " + consoante, null,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Quantidade de espaço = " + contSpace, null,
				JOptionPane.INFORMATION_MESSAGE);

	}
}
