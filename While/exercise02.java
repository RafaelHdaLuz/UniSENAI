/*
 * Você deverá desenvolver um algoritmo que solicite a idade, o gênero e o salário de
um grupo de pessoas. Para encerrar o programa, o usuário deve digitar "Finalizar".
Certifique-se de validar para que o usuário digite exatamente "Finalizar". Ao término
da execução do programa, será apresentado ao usuário as seguintes informações:

● A média de idade de pessoas do gênero feminino;
● A média de idade de pessoas do gênero masculino;
● A média salarial geral;
● A média salarial do gênero feminino;
● A média salarial do gênero masculino.
REVISAR!!!!
 */
package While;

import javax.swing.JOptionPane;

public class exercise02 {

	public static void main(String[] args) {
		int contador = 0, idade = 0, salario = 0, contM = 0, contF = 0, medSalarioGp, medIdade, salarioM = 0,
				salarioF = 0, mediaM, mediaF, genero = 0;
		String finalizar = "";

		do {
			contador += 1;

			idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da " + contador + " pessoa. "));

			genero = Integer.parseInt(JOptionPane.showInputDialog(
					"Qual o gênero da " + contador + " pessoa (utilize 1 para masculino ou " + "\n2 para feminino). "));

			salario = Integer.parseInt(JOptionPane.showInputDialog("Qual o salário da " + contador + " pessoa. "));

			finalizar = JOptionPane
					.showInputDialog("\nDeseja finalizar? (digite 'finalizar' para encerrar ou 'n' para continuar.) ");

			if (genero == 1) {
				contM += 1;
				salarioM += 1;
				mediaM = (salarioM * contador) / contador;
			} else if (genero == 2) {
				contF += 1;
				salarioF += 1;
				mediaF = (salarioF * contador) / contador;
			}

			medSalarioGp = (salario * contador) / contador;

			medIdade = (idade * contador) / contador;

			mediaM = (salarioM * contador) / contador;

			mediaF = (salarioF * contador) / contador;

			if (finalizar.equalsIgnoreCase("finalizar")) {
				break;
			}
		} while (true);

		JOptionPane.showMessageDialog(null, "A média salárial do grupo é " + medSalarioGp + " R$.", null,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "\nA média de todas as idades é " + medIdade + " anos.", null,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "\nA média do salário do gênero masculino é " + mediaM + " R$.", null,
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "\nA média do salário do gênero feminino é " + mediaF + " R$.", null,
				JOptionPane.INFORMATION_MESSAGE);

	}
}
