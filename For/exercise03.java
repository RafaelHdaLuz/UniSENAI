/*
 * Prepare um código-fonte para um programa que verifica APENAS os números primos
de 1 a 100
 */
package For;

import javax.swing.JOptionPane;

public class exercise03 {

	public static void main(String[] args) {
		String nro = "";
		// "simular" entrada de dados do usuário.
		for (int i = 2; i < 101; i++) {

			// variavel logica.
			boolean primo = true;

			// verificar se é número primo.
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}

			if (primo == true) {
				nro += (i + " ");
			}
		}
		JOptionPane.showMessageDialog(null, "Números primos: " + nro, null, JOptionPane.INFORMATION_MESSAGE);
	}

}
