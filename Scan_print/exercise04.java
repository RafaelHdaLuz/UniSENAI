/*
 * Solicite ao usuário o nome, idade e altura (em metros). Ao final, mostre todas as
informações em uma única linha, de maneira organizada.
		
 */
package Scan_print;

import javax.swing.JOptionPane; 

public class exercise04 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura (em metros)"));
		
		JOptionPane.showMessageDialog(null, nome + ", " + idade + " anos" + ", " + altura + "m.", null, JOptionPane.INFORMATION_MESSAGE);
	}

}
