/*
 * O professor "Beico Zito" está em busca de uma solução que possa calcular a soma
de cada linha e a soma total de uma matriz 4x5. Para isso, ele precisa de um algoritmo
que possa realizar esses cálculos.

 */
package Matrix;

import javax.swing.JOptionPane;

public class exercise01 {

	public static void main(String[] args) {
		int matriz[][] = new int[4][5];
		int contMatriz = 0;
		int contLinha[] = new int[5];
		String mensagem = "";
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
				contMatriz += matriz[i][j];
				contLinha[i] += matriz[i][j];
			}
			mensagem += ("\n" + contLinha[i]);
		}
		JOptionPane.showMessageDialog(null, "Soma dos números = " + contMatriz, null, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Soma das linhas = " + mensagem, null,
				JOptionPane.INFORMATION_MESSAGE);
	}
	
}
