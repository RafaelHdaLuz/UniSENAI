/*
 * Prepare um código que solicita ao usuário dois números inteiros e exibe a soma, a
   subtração, a multiplicação e a divisão desses números.
 */
package Scan_print;

import javax.swing.JOptionPane;

public class Exercise02 {

	public static void main(String[] args) {
		
		float num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		float num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número: "));
		
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2), "Soma",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2), "subtração",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 + " x " + num2 + " = " + (num1 * num2), "Multiplicação",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + (num1 / num2), "Divisão",JOptionPane.INFORMATION_MESSAGE);
	}

}
