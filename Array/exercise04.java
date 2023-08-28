/*
 * Faça um programa que leia 5 números inteiros digitados pelo usuário e armazene-os
em um vetor. Em seguida, o programa deve ordenar os números em ordem crescente
e imprimir o vetor ordenado.
 */
package Array;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class exercise04 {

	public static void main(String[] args) {
		int[] numeros = new int[5];

		for (int i = 0; i < 5; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número inteiro:"));
		}

		Arrays.sort(numeros);
								// 'new' é a construção do objeto
		StringBuilder mensagem = new StringBuilder("Números ordenados em ordem crescente:\n");
		for (int num : numeros) {
			mensagem.append(num).append("\n");
		}

		JOptionPane.showMessageDialog(null, mensagem.toString(), "Números Ordenados", JOptionPane.INFORMATION_MESSAGE);
	}
}
