/*
 * Construa uma solução que peça ao usuário sua idade e verifique se ele é:
● Uma criança, com idade abaixo de 18 anos;
● Um jovem, com idade entre 18 e 30 anos;
● Um adulto, com idade entre 30 e 59 anos;
● Um idoso, com idade a partir de 60 anos.
 */
package if_else;

import javax.swing.JOptionPane;

public class Exercise04 {

	public static void main(String[] args) {

		int age = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade (Ex: 15, 18): "));
		
		// Validação
		while (age < 0) {
			age = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade novamente: "));
		}
		
		if (age < 18) {
			JOptionPane.showMessageDialog(null, "Você ainda é crinça.", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (age >= 18 && age <= 30) {
			JOptionPane.showMessageDialog(null, "Você é jovem.", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (age > 30 && age < 59) {
			JOptionPane.showMessageDialog(null, "Você é adulto.", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (age >= 60 && age < 120) {
			JOptionPane.showMessageDialog(null, "Você é idoso.", null, JOptionPane.INFORMATION_MESSAGE);
		} 
		else {
			JOptionPane.showMessageDialog(null, "Idade inválida.", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
