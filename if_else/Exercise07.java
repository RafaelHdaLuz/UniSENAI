/*
 * Você está construindo uma solução para calcular o valor final do salário de um
colaborador. Portanto, calcule o salário de um colaborador, sabendo que:
• A jornada de trabalho é de 40 horas semanais, ou 160 horas mensais;
• Caso haja horas extras, o valor a ser pago é de 50% a mais do valor normal da hora
para cada hora extra realizada.
 */
package if_else;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercise07 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		double salario, horaExtra, valorHoraExtra, salarioExtra;
		double salarioPorHora = Double.parseDouble(JOptionPane.showInputDialog("Quanto você ganha por hora? "));

		while (salarioPorHora < 0) {
			salarioPorHora = Double
					.parseDouble(JOptionPane.showInputDialog("Digite novamente quanto você ganha por hora: "));
		}

		double horasTrab = Double.parseDouble(JOptionPane.showInputDialog("Quantas horas você trabalhou no mês? "));

		while (horasTrab < 0) {
			horasTrab = Double
					.parseDouble(JOptionPane.showInputDialog("Digite novamente quantas horas você trabalhou no mês: "));
		}

		salario = salarioPorHora * horasTrab;

		if (horasTrab <= 160) {
			JOptionPane.showMessageDialog(null, "Seu salario é de R$" + df.format(salario) + ".", null,
					JOptionPane.INFORMATION_MESSAGE);
		} else if (horasTrab > 160) {
			horaExtra = horasTrab - 160;
			valorHoraExtra = horaExtra * salarioPorHora + (salarioPorHora * 0.5);
			salarioExtra = valorHoraExtra + salario;

			JOptionPane.showMessageDialog(null, "Seu salario (com hora extra) é de R$" + df.format(salarioExtra) + ".",
					null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Tente novamente.", null, JOptionPane.ERROR_MESSAGE);
		}
	}

}
