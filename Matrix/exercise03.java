/*
 * Crie um programa para solicitar os valores de uma matriz 3x2. Em seguida, você
deverá fazer a transposição dessa matriz.
Obs.: pesquisar o que é matriz transposta.
 */
package Matrix;

import javax.swing.JOptionPane;

public class exercise03 {

	public static void main(String[] args) {
		String[][] matriz = new String[3][2];
		String[][] matrizTransposta = new String[2][3];
		String transposta = "";

		// Solicitar os valores da matriz original
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				matriz[i][j] = JOptionPane.showInputDialog("Digite o valor para a matriz");

			}
		}

		// Realizar a transposição da matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}

		// Exibir a matriz transposta
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				transposta += matrizTransposta[i][j] + " ";
			}
			transposta += "\n";
		}

		JOptionPane.showMessageDialog(null, "Matriz Transposta:\n" + transposta, null,
				JOptionPane.INFORMATION_MESSAGE);
	}
}