/*
 * Calcule o IMC de uma pessoa por meio de um programa. Nele, você solicitará o peso
do usuário em quilogramas (ex.: 58.9) e sua altura em metros (ex.: 1.68). A partir
dessas informações, você calculará seu Índice de Massa Corporal (IMC), indicando
se seu índice é:
● Abaixo do peso (IMC < 18,5)
● Peso normal (IMC 18,5-24,9)
● Sobrepeso (IMC 25-29,9)
● Obeso (IMC >= 30).
 */
package if_else;

import javax.swing.JOptionPane;

public class Exercise05 {

	public static void main(String[] args) {
		double imc;

		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso em KG (ex: 58.9): "));

		while (peso < 0) {
			peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso em KG novamente (ex: 58.9): "));
		}

		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros (ex: 1.77): "));

		while (altura < 0) {
			altura = Double
					.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros novamente (ex: 1.77): "));
		}
		imc = peso / (altura * altura);

		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso.", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (imc >= 18.5 || imc <= 24.9) {
			JOptionPane.showMessageDialog(null, "Seu peso está normal.", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (imc >= 25 || imc <= 29.9) {
			JOptionPane.showMessageDialog(null, "Você está com sobrepeso.", null, JOptionPane.INFORMATION_MESSAGE);
		} else if (imc >= 30) {
			JOptionPane.showMessageDialog(null, "Você está obeso.", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Tente novamente.", null, JOptionPane.ERROR_MESSAGE);
		}
	}

}
