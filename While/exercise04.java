/*
 * Foi conduzida uma pesquisa com "N" indivíduos sobre suas opiniões em relação à
pré-estreia de um filme. Os dados coletados incluíram sexo, idade e uma nota de 0 a
10 referente à opinião sobre o filme. As perguntas foram feitas repetidamente até que
todas as pessoas disponíveis tivessem respondido.
Com base nos resultados da pesquisa, podemos calcular e apresentar as seguintes
informações:
● A média de idade das pessoas que responderam ao questionário;
● Lista de pessoas que deram nota igual a 10;
● A quantidade de homens cujas opiniões sobre o filme foram inferiores a 5;
● A quantidade de mulheres cujas opiniões sobre o filme foram inferiores a 5;
● A quantidade de homens cujas opiniões sobre o filme foram superiores a 7;
● A quantidade de mulheres cujas opiniões sobre o filme foram superiores a 7;
● Média das notas informadas.
Essas informações podem ajudar a compreender melhor a recepção do público em
relação ao filme e a orientar decisões futuras da equipe responsável pela sua
promoção.
Obs.: não esqueça de validar se a nota está entre 0 e 10.

REVISAR
 */
package While;

import javax.swing.JOptionPane;

public class exercise04 {

	public static void main(String[] args) {

		int totalRespondentes = 0;
		int totalIdade = 0;
		int totalNotas = 0;
		int totalHomensNotasAbaixo5 = 0;
		int totalMulheresNotasAbaixo5 = 0;
		int totalHomensNotasAcima7 = 0;
		int totalMulheresNotasAcima7 = 0;
		int totalNotas10 = 0;
		String continuar = "";

		do {
			int sexo = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o sexo (1 para masculino \n 2 para feminino): "));

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));

			int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota (de 0 a 10): "));

			if (nota < 0 || nota > 10) {
				JOptionPane.showMessageDialog(null, "Nota inválida. Digite uma nota entre 0 e 10.", null,
						JOptionPane.INFORMATION_MESSAGE);
				continue;
			}

			totalRespondentes++;
			totalIdade += idade;
			totalNotas += nota;

			if (nota == 10) {
				totalNotas10++;
			}
			// masculino
			if (sexo == 1) {
				if (nota <= 5 && nota >= 0) {
					totalHomensNotasAbaixo5++;
				} else if (nota >= 7 && nota <= 10) {
					totalHomensNotasAcima7++;
				}

				// feminino
			} else if (sexo == 2) {
				if (nota <= 5 && nota > 0) {
					totalMulheresNotasAbaixo5++;
				} else if (nota >= 7 && nota <= 10) {
					totalMulheresNotasAcima7++;
				}
			}

			continuar = JOptionPane.showInputDialog("Deseja finalizar? ('finalizar'/n)? ");
			if (continuar.equalsIgnoreCase("finalizar")) {
				break;
			}
		} while (true);

		if (totalRespondentes > 0) {
			double mediaIdade = totalIdade / totalRespondentes;
			double mediaNotas = totalNotas / totalRespondentes;

			JOptionPane.showMessageDialog(null,
					"Média de idade das pessoas que responderam: " + mediaIdade
							+ "\nLista de pessoas que deram nota 10 = " + totalNotas10
							+ "\nQuantidade de homens com notas abaixo de 5 = " + totalHomensNotasAbaixo5
							+ "\nQuantidade de mulheres com notas abaixo de 5 = " + totalMulheresNotasAbaixo5
							+ "\nQuantidade de homens com notas acima de 7 = " + totalHomensNotasAcima7
							+ "\nQuantidade de mulheres com notas acima de 7 = " + totalMulheresNotasAcima7
							+ "\nMédia das notas informadas = " + mediaNotas,
					null, JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, "Nenhum dado foi inserido.", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}
}