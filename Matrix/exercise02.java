/*
 * Crie duas matrizes 4x4 e compare para saber quantos elementos elas possuam que
são iguais. Apresente a quantidade e quais são esses elementos
 */
package Matrix;

import javax.swing.JOptionPane;

public class exercise02 {

	public static void main(String[] args) {
		int matriz1[][] = new int[2][2];
		int matriz2[][] = new int[2][2];
		int contMatrizIgual = 0;
		String elementoIgual = "";

		// Matriz 1
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++) {
				matriz1[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a matriz 1"));
			}
		}

		// Matriz 2
		for (int c = 0; c < 2; c++) {
			for (int d = 0; d < 2; d++) {
				matriz2[c][d] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a matriz 2"));
			}
		}

		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < 2; b++) {
				for (int c = 0; c < 2; c++) {
					for (int d = 0; d < 2; d++) {
						
						// Verificar se as duas matrizes são iguais
						if (matriz1[a][b] == matriz2[c][d]) {
							contMatrizIgual++;
							elementoIgual += (matriz2[c][d] + ",");
						}
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Quantidade de números iguais: " + contMatrizIgual + "\nOs caracteres iguais são: " + elementoIgual, null, JOptionPane.INFORMATION_MESSAGE);
				
				
	}
}