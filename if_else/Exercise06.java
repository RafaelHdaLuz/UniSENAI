/*
 * 	Construa um programa que solicite ao usuário três comprimentos de lado e, em
seguida, verifique se é possível formar um triângulo. Se sim, exiba o tipo de triângulo.
Obs.: pesquise o que são triângulos equiláteros, isósceles e escalenos.
		
		equilatero = tudo igual
		isoceles = 2 lados iguais
		escalenos = tudo diferente
 */
package if_else;

import javax.swing.JOptionPane;

public class Exercise06 {

	public static void main(String[] args) {

		int vetorLado[] = new int[3];

		for (int i = 0; i < 3; i++) {
			vetorLado[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + " lado do triângulo: "));

			while (vetorLado[i] < 0) {
				vetorLado[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente o lado do triângulo: "));
			}
		}

		if (vetorLado[0] == vetorLado[1] && vetorLado[0] == vetorLado[2] && vetorLado[1] == vetorLado[2]) {
			JOptionPane.showMessageDialog(null, "Triângulo equilátero.", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (vetorLado[0] == vetorLado[1] || vetorLado[1] == vetorLado[2] || vetorLado[0] == vetorLado[2]) {
			JOptionPane.showMessageDialog(null, "Triângulo ísoceles.", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Triângulo escaleno.", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
