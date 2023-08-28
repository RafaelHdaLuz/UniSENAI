/*
 * Solicite que o usuário informe uma letra do alfabeto. Posteriormente, verifique se essa
letra é uma vogal, uma consoante ou um caractere inválido.
 */
package Switch;

import javax.swing.JOptionPane;

public class exercise02 {

	public static void main(String[] args) {

			
		
		 // entrada de dados
		String palavra = JOptionPane.showInputDialog("Digite uma letra");

		// validacao
		while (palavra.length() > 1) {
			palavra = JOptionPane.showInputDialog("Digite somente um caracter, bobao");
		}

		// escolhas
		switch (palavra) {
		case "a", "e", "i", "o", "u":
			JOptionPane.showMessageDialog(null, "Vogal", null, JOptionPane.ERROR_MESSAGE);
			break;

		case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z":
			JOptionPane.showMessageDialog(null, "Consoante", null, JOptionPane.ERROR_MESSAGE);
			break;

		default:
			JOptionPane.showMessageDialog(null, "caractere inválido.", null, JOptionPane.ERROR_MESSAGE);
		}
		 

	}

}
