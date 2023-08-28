/*
 * A prefeitura de "Araquachussets" planeja conduzir uma pesquisa entre seus cidadãos,
a fim de coletar informações sobre seus nomes, idades, salários e número de filhos.
Para alcançar esse objetivo, sugiro a criação de um formulário online, que possa ser
preenchido pelos moradores da cidade.
Uma vez que a pesquisa tenha sido concluída, podemos utilizar os dados coletados
para gerar algumas informações estatísticas relevantes, tais como:

● A média de salário da população, que pode ser calculada dividindo-se a soma
de todos os salários pelo número total de respondentes.

● A média do número de filhos, que pode ser calculada dividindo-se a soma de
todos os filhos pelo número total de respondentes.

● O maior salário entre os habitantes, que pode ser identificado através da
comparação dos salários individuais.

● Uma lista com os nomes das pessoas cujo salário é inferior a R$ 1000,00. Essa
lista pode ser gerada filtrando-se os respondentes cujo salário é menor que
esse valor e extraindo seus nomes.

● A média de idade da população, que pode ser calculada da mesma forma que
a média de salário e a média de número de filhos.

 */
package While;

import javax.swing.JOptionPane;

public class exercise03 {

	public static void main(String[] args) {
		int totalRespondentes = 0;
		double somaSalarios = 0;
		int somaFilhos = 0;
		double maiorSalario = Double.MIN_VALUE;
		int totalSalariosAbaixo1000 = 0;
		int somaIdades = 0;

		do {
			String nome = JOptionPane.showInputDialog("Digite o nome (ou 'finalizar' para encerrar): ");

			if (nome.equalsIgnoreCase("finalizar")) {
				break;
			}

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

			double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));

			int numFilhos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de filhos: "));

			totalRespondentes++;
			somaSalarios += salario;
			somaFilhos += numFilhos;
			somaIdades += idade;

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}

			if (salario < 1000) {
				totalSalariosAbaixo1000++;
				JOptionPane.showMessageDialog(null, "Nome: " + nome, null, JOptionPane.INFORMATION_MESSAGE);
			}

		} while (true);

		if (totalRespondentes > 0) {
			double mediaSalario = somaSalarios / totalRespondentes;
			double mediaFilhos =  somaFilhos / totalRespondentes;
			double mediaIdade =  somaIdades / totalRespondentes;

			JOptionPane.showMessageDialog(null,
					"Média de salário: " + mediaSalario + "\nMédia de número de filhos: " + mediaFilhos
							+ "\nMaior salário: " + maiorSalario + "\nTotal de salários abaixo de R$ 1000,00: "
							+ totalSalariosAbaixo1000 + "\nMédia de idade: " + mediaIdade,
					null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum dado foi inserido.", null,
					JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
