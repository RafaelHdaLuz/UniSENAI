/*
 * Desenvolva um programa que permita calcular o imposto de renda de uma pessoa. O
usuário informa o valor do salário bruto mensal e o programa deve calcular o valor do
imposto de acordo com a seguinte tabela:
● Salário até R$1.903,98: isento de imposto
● Salário de R$1.903,99 até R$2.826,65: 7,5% de imposto
● Salário de R$2.826,66 até R$3.751,05: 15% de imposto
● Salário de R$3.751,06 até R$4.664,68: 22,5% de imposto
● Salário acima de R$4.664,68: 27,5% de imposto
Calcule o valor do imposto de acordo com o salário informado pelo usuário e exiba o
resultado. Lembre-se de que o valor do imposto deve ser calculado apenas sobre a
diferença entre o salário e o limite inferior de cada faixa de imposto. Por exemplo, se
o salário for R$2.000,00, o valor do imposto será 7,5% sobre R$96,01 (R$2.000,00 -
R$1.903,99). Caso o valor do imposto seja igual a zero, exiba a mensagem "Isento de
imposto". Caso contrário, exiba o valor do imposto calculado.
 */
package Switch;

import javax.swing.JOptionPane;

public class exercise04 {

	public static void main(String[] args) {
		// pedir salario
		Double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));

		// validacao
		while (salario < 0) {
			salario = Double.parseDouble(JOptionPane.showInputDialog("Valor inválido!\nQual o seu salário?"));
		}

		int imposto = 0;

		// validar o imposto
		if (salario <= 1903.98) {
			imposto = 1;
		} else if (salario >= 1903.99 && salario <= 2826.65) {
			imposto = 2;
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			imposto = 3;
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			imposto = 4;
		} else if (salario > 4664.68) {
			imposto = 5;
		}

		// mostrar ao usuario
		switch (imposto) {
		case 1:
			JOptionPane.showMessageDialog(null, "Isento de imposto", null, JOptionPane.INFORMATION_MESSAGE);
			break;

		case 2:
			Double impostoPagar;
			impostoPagar = salario * 0.075;
			JOptionPane.showMessageDialog(null, "Total a pagar de imposto = R$" + impostoPagar, null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case 3:
			Double impostoPagar1;
			impostoPagar1 = salario * 0.15;
			JOptionPane.showMessageDialog(null, "Total a pagar de imposto = R$" + impostoPagar1, null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case 4:
			Double impostoPagar2;
			impostoPagar2 = (salario * 22.5) / 100;
			JOptionPane.showMessageDialog(null, "Total a pagar de imposto = R$" + impostoPagar2, null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case 5:
			Double impostoPagar3;
			impostoPagar3 = (salario * 27.5) / 100;
			JOptionPane.showMessageDialog(null, "Total a pagar de imposto = R$" + impostoPagar3, null,
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}

	}

}
