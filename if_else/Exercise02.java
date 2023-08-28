/*
 * Agora, prepare seu código para que ele receba 3 notas, calcule a média aritmética e
verifique se o aluno foi aprovado, está em recuperação ou está reprovado 
(use asregras do Desafio 1).
 */
package if_else;

import javax.swing.JOptionPane;

public class Exercise02 {

	public static void main(String[] args) {
		Double vetorNota[] = new Double[3];
		Double notaFinal;

		// Receber as 3 notas
		for (int i = 0; i < 3; i++) {
			vetorNota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i+1) + " nota: "));

			// Validação
			while (vetorNota[i] < 0 || vetorNota[i] > 10) {
				vetorNota[i] = Double.parseDouble(JOptionPane.showInputDialog("A nota preica estar entre 0 e 10" + "\nDigite a " + (i+1) + " nota: "));
			}

		}
		
		//Cálculo da nota final
		notaFinal = (vetorNota[0] + vetorNota[1] + vetorNota[2]) / 3;

		if (notaFinal >= 7) {
			JOptionPane.showMessageDialog(null, "APROVADO!", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (notaFinal >= 5 && notaFinal < 7) {
			JOptionPane.showMessageDialog(null, "Você está de recuperação.", null, JOptionPane.WARNING_MESSAGE);
		} else if (notaFinal < 5) {
			JOptionPane.showMessageDialog(null, "Você está reprovado.", null, JOptionPane.WARNING_MESSAGE);
		} 
	}

}
