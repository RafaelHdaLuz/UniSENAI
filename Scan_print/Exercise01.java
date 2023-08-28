/*DESAFIO 1
Construa uma solução que solicite ao usuário seu nome e idade. Em seguida, exiba
uma saudação com o nome digitado e informe a idade dessa pessoa.
*/
package Scan_print;

import javax.swing.JOptionPane;

public class Exercise01 {

	public static void main(String[] args) {
		
		// Recebere nome e idade
		String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));

		JOptionPane.showMessageDialog(null, "Olá " + nome + ", bem-vindo!", null, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos.", null, JOptionPane.INFORMATION_MESSAGE);
	}

}
