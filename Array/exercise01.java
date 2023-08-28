/*
 * Faça um programa que leia 10 números inteiros digitados pelo usuário e armazeneos em um vetor. 
 * Em seguida, calcule e imprima a média desses números e informe o
2º maior e o 3º menor número.
 */
package Array;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class exercise01 {

	public static void main(String[] args) {
		int[] nro = new int[10];

		for (int i = 0; i < 10; i++) {
			nro[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número."));
		}
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += nro[i];
		}
		double media = (double) soma / nro.length;
		JOptionPane.showMessageDialog(null, "Média dos números: " + media, null, JOptionPane.INFORMATION_MESSAGE);

		// 'sort' ordena os numeros do array do menor p maior
		Arrays.sort(nro);

		// 2º ' número //ele pega a penúltima posição
		int segundoMaior = nro[nro.length - 2];
		JOptionPane.showMessageDialog(null, "2º maior número: " + segundoMaior, null, JOptionPane.INFORMATION_MESSAGE);

		// 3º menor número //ele pega a 3 posição (0,1,2)
		int terceiroMenor = nro[2];
		JOptionPane.showMessageDialog(null, "3º menor número: " + terceiroMenor, null, JOptionPane.INFORMATION_MESSAGE);
	}

}