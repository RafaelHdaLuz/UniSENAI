/*
 * Desenvolva um sistema de votação para uma eleição. O programa terá um menu que
deve permitir ao usuário digitar o número do candidato de sua escolha, que varia de
1 a 5, e em seguida, exibir uma mensagem informando o nome e a plataforma política
do candidato escolhido.
Após o usuário digitar o número do candidato, deve-se verificar o número digitado e
exibir uma mensagem com o nome e a plataforma política do candidato escolhido.
Caso o número digitado não corresponda a nenhum candidato válido, o programa
deve exibir uma mensagem de erro.
 */
package Switch;

import javax.swing.JOptionPane;

public class exercise03 {

	public static void main(String[] args) {

		int cadidato = Integer.parseInt(JOptionPane.showInputDialog("Candidatos:"
				+ "\n1-felipe \n2-boleia \n3-Rafael \n4-Tigas \n5-alishow" + "\nDigite o número do candidato"));

		while (cadidato > 5 || cadidato < 1) {
			cadidato = Integer
					.parseInt(JOptionPane.showInputDialog("Por favor digite somente o número de um dos candidatos"));
		}

		switch (cadidato) {
		case 1:
			JOptionPane.showMessageDialog(null, "Você votou no Felipe e seu partido é tupiniqui", null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case 2:
			JOptionPane.showMessageDialog(null, "Você votou no Lucas e seu partido é Peugeot_207_1.4_16V", null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case 3:
			JOptionPane.showMessageDialog(null,
					"Você votou no Rafael e seu partido é time Clube de Regatas do Flamengo", null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case 4:
			JOptionPane.showMessageDialog(null, "Você votou no Tigas e seu partido é senai", null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case 5:
			JOptionPane.showMessageDialog(null, "Você votou no alishow e seu partido é vacilassaço", null,
					JOptionPane.INFORMATION_MESSAGE);
			break;

		default:
			JOptionPane.showInputDialog("erro");
			break;

		}

	}
}
