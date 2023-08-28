//Desenvolva um programa em Java que leia uma matriz de dimensões 4x4 e exiba o
//resto da divisão de cada elemento da diagonal principal. Além disso, apresente
//também produto total da diagonal secundária da matriz.
package Matrix;

import javax.swing.JOptionPane;

public class exercise04 {

	public static void main(String[] args) {
		Double[][] matriz = new Double[4][4];
		
		//primeria diagonal
		Double produto1 = 0.0, produto2 = 0.0, produto3 = 0.0, produto4 = 0.0;
		Double dividir = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para a divisão (Ex: 2.0)"));
		
		// produto total da diagonal secundária
		Double prodTotal1 = 0.0, prodTotal2 = 0.0, prodTotal3 = 0.0, prodTotal4 = 0.0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número."));

				//Divisão da primeira diagonal
				produto1 = matriz[0][0] / dividir;
				produto2 = matriz[1][1] / dividir;
				produto3 = matriz[2][2] / dividir;
				produto4 = matriz[3][3] / dividir;
				
				//multiplicação da segunda diagonal
				prodTotal1 = matriz[0][3] * dividir;
				prodTotal2 = matriz[1][2] * dividir;
				prodTotal3 = matriz[2][2] * dividir;
				prodTotal4 = matriz[3][0] * dividir;
			}
		}
		JOptionPane.showMessageDialog(null, "Resultado da divisão da primeira matriz" + ("\n" + produto1)
				+ ("\n" + produto2) + ("\n" + produto3) + ("\n" + produto4), null, JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Resultado do produto da segunda matriz" + ("\n" + prodTotal1)
				+ ("\n" + prodTotal2) + ("\n" + prodTotal3) + ("\n" + prodTotal4), null, JOptionPane.INFORMATION_MESSAGE);
	}

}
