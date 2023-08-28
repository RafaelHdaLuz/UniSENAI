/*
 * Construa uma solução que solicita ao usuário um número inteiro e exibe se o número
é par ou ímpar.	
 */
package Scan_print;

import javax.swing.JOptionPane;

public class Exercise03 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, num + " é número par", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, num + " é número ímpar", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
