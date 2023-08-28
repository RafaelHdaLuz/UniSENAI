/*
 * Crie um programa que peça para o usuário selecionar uma figura geométrica de sua
escolha:
● Círculo;
● Quadrado;
● Retângulo;
● Triângulo.
Em seguida, peça os dados necessários para calcular e exibir a área da figura
selecionada.
 */
package Switch;

import javax.swing.JOptionPane;

public class exercise01 {

	public static void main(String[] args) {

		// pedir p usuario escolher
		int palavra = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma figura geométrica abaixo: "
				+ "\n1-Círculo;\r\n" + "2-Quadrado;\r\n" + "3-Retângulo;\r\n" + "4-Triângulo. "));

		// validacao
		if (palavra > 4 || palavra < 1) {
			JOptionPane.showMessageDialog(null, "Digite somente os números indicados!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		// escolhas
		switch (palavra) {
		case 1:
			double raio = Double.parseDouble(JOptionPane.showInputDialog("Qual o raio do círculo?"));
			if (raio <= 0) {
				JOptionPane.showMessageDialog(null, "Digite somente os números positivos!", null,
						JOptionPane.ERROR_MESSAGE);
			}

			double areaCirculo = 3.14 * (raio * raio);
			JOptionPane.showMessageDialog(null, "A área do círculo é " + areaCirculo, null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case 2:
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Qual o lado do Quadrado?"));
			if (lado <= 0) {
				JOptionPane.showMessageDialog(null, "Digite somente os números positivos!", null,
						JOptionPane.ERROR_MESSAGE);
			}
			double areaQuad = lado * lado;
			JOptionPane.showMessageDialog(null, "A área do Quadrado é " + areaQuad, null,
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			double base = Double.parseDouble(JOptionPane.showInputDialog("Qual a base do Retângulo?"));
			if (base <= 0) {
				JOptionPane.showMessageDialog(null, "Digite somente os números positivos!", null,
						JOptionPane.ERROR_MESSAGE);
			}
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do Retângulo?"));
			if (altura <= 0) {
				JOptionPane.showMessageDialog(null, "Digite somente os números positivos!", null,
						JOptionPane.ERROR_MESSAGE);
			}
			double areaRet = base * altura;
			JOptionPane.showMessageDialog(null, "A área do Retângulo é " + areaRet, null,
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			double baseTri = Double.parseDouble(JOptionPane.showInputDialog("Qual a base do Triângulo?"));
			if (baseTri <= 0) {
				JOptionPane.showMessageDialog(null, "Digite somente os números positivos!", null,
						JOptionPane.ERROR_MESSAGE);
			}
			double alturaTri = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do Triângulo?"));
			if (alturaTri <= 0) {
				JOptionPane.showMessageDialog(null, "Digite somente os números positivos!", null,
						JOptionPane.ERROR_MESSAGE);
			}
			double areaTri = (baseTri * alturaTri) / 2;
			JOptionPane.showMessageDialog(null, "A área do Triângulo é " + areaTri, null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		default:
			JOptionPane.showMessageDialog(null, "ta errado ", null, JOptionPane.INFORMATION_MESSAGE);
			break;
		}

	}

}
