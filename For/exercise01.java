/*
 * Solicite uma palavra ao usuário. Depois, apresente cada letra daquilo que ele
escreveu e conte quantos caracteres essa palavra tem.
 */
package For;

import javax.swing.JOptionPane;

public class exercise01 {

	public static void main(String[] args) {
		// Molicita a palavra ao usuario
		String palavra = JOptionPane.showInputDialog("Digite uma palavra");

		// Mostra cada letra		// Retorna a quantidade de caracteres que a compõe
		for (int i = 0; i < palavra.length(); i++) {					// Retorna o caractere no índice especificado em uma string.
			JOptionPane.showMessageDialog(null, (i + 1) + ". " + palavra.charAt(i), null,
					JOptionPane.INFORMATION_MESSAGE);
		}
		// Mostra a quantidade de letras
		JOptionPane.showMessageDialog(null, "A palavra tem " + palavra.length() + " letras.", null,
				JOptionPane.INFORMATION_MESSAGE);
	}

}
