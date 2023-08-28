/*
 * Uma turma do curso de programação da escola X é formada por 30 alunos. Faça um
programa que leia as notas de cada aluno em uma avaliação e armazene-as em um
vetor. O programa deve calcular e imprimir a média da turma e a quantidade de alunos
que ficaram acima da média.

 */
package Array;

import javax.swing.JOptionPane;

public class exercise03 {

	public static void main(String[] args) {

		double[] notas = new double[30];
		double somaNotas = 0;
		int acimaMedia = 0;

		for (int i = 0; i < 30; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (i + 1) + "º aluno."));
		}

		// Cálculo da média da turma
		for (int i = 0; i < 30; i++) {
			somaNotas += notas[i];
		}

		double mediaTurma = somaNotas / 3;

		// Contagem de alunos acima da média
		for (int i = 0; i < 30; i++) {
			if (notas[i] > mediaTurma) {
				acimaMedia++;
			}
		}
		JOptionPane.showMessageDialog(null,
				"Média da turma: " + mediaTurma + 
				"\nQuantidade de alunos acima da média: " + acimaMedia, null,
				JOptionPane.INFORMATION_MESSAGE);
	}
}
