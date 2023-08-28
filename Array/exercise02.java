/*
 * Um professor deseja ter uma aplicação que calcule a média PONDERADA de seus
cinco alunos durante o bimestre. O bimestre é composto por 2 notas, portanto, é
necessário criar dois vetores para armazenar cada uma das notas dos alunos. Em
seguida, outro vetor deve ser criado para armazenar o resultado da média dos alunos.
 */
package Array;

import javax.swing.JOptionPane;

public class exercise02 {

	public static void main(String[] args) {

		int pesoNota_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da primeira nota:"));
		int pesoNota_2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da segunda nota:"));
		
		// validação
		while (pesoNota_1 < 0 || pesoNota_1 > 10 || pesoNota_2 < 0 || pesoNota_2 > 10) {
			pesoNota_1 = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Nota inválida! Digite o peso da primeira nota:"));
			pesoNota_2 = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Nota inválida! Digite o peso da segunda nota:"));
		}

		Double[] vetorNota_1 = new Double[5];
		Double[] vetorNota_2 = new Double[5];
		Double[] mediaPonderada = new Double[5];
		
		// receber as notas
		for (int i = 0; i < 5; i++) {
			vetorNota_1[i] = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota " + (i + 1) + " aluno"));
			vetorNota_2[i] = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota " + (i + 1) + " aluno"));
		}
		
		// calculo da média ponderada
		for (int i = 0; i < 5; i++) {
			mediaPonderada[i] = (pesoNota_1 * vetorNota_1[i] + vetorNota_2[i] * pesoNota_2) / (pesoNota_1 + pesoNota_2);
		}
		
		// mostrar a média
		for (int i = 0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, "A média ponderada do " + (i + 1) + " aluno é: " + mediaPonderada[i],
					null, JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
