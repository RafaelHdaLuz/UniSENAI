//Construa um código capaz de solicitar ao usuário uma nota de 0 a 10. Se ele tirou: a
//partir de 7, está aprovado; entre 5 e 6, está em recuperação; abaixo de 5, está
//reprovado.
package if_else;

import javax.swing.JOptionPane;

public class Exercise01 {

	public static void main(String[] args) {

		Double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));

		// validação da entrada de dados
		while (nota < 0 || nota > 10) {
			nota = Double.parseDouble(
					JOptionPane.showInputDialog("A nota preica estar entre 0 e 10" + "\nDigite a nota novamente"));
		}

		if (nota >= 7) {
			JOptionPane.showMessageDialog(null, "APROVADO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (nota >= 5 && nota < 7) {
			JOptionPane.showMessageDialog(null, "Você está de recuperação.", null, JOptionPane.WARNING_MESSAGE);
		} else if (nota < 5) {
			JOptionPane.showMessageDialog(null, "Você está reprovado.", null, JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Tente novamente.", null, JOptionPane.ERROR_MESSAGE);
		}
	}
}
