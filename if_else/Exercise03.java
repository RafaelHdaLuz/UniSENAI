/*
 * Peça ao usuário um número de 1 a 7. Ao final, seu programa indicará a qual dia da
semana esse número corresponde.
 */
package if_else;

import javax.swing.JOptionPane;

public class Exercise03 {

	public static void main(String[] args) {

		int diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7: "));

		while (diaSemana < 1 || diaSemana > 7) {
			diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Esse dia não existe, tente novamente."));
		}
		if (diaSemana == 1) {
			JOptionPane.showMessageDialog(null, "SEGUNDA-FEIRA!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (diaSemana == 2) {
			JOptionPane.showMessageDialog(null, "TERÇA-FEIRA!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (diaSemana == 3) {
			JOptionPane.showMessageDialog(null, "QUARTA-FEIRA!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (diaSemana == 4) {
			JOptionPane.showMessageDialog(null, "QUINTA-FEIRA!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (diaSemana == 5) {
			JOptionPane.showMessageDialog(null, "SEXTA-FEIRA!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (diaSemana == 6) {
			JOptionPane.showMessageDialog(null, "SÁBADO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (diaSemana == 7) {
			JOptionPane.showMessageDialog(null, "DOMINGO!", null, JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
