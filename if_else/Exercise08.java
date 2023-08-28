/*
 * Você foi contratado para desenvolver um simulador de sistema de recomendação de
filmes. O sistema deve solicitar ao usuário informações sobre um filme, como nome,
duração em minutos e classificação indicativa. Com base nessas informações, o
sistema deve classificar o filme em uma categoria específica, levando em
consideração a duração e a classificação indicativa. As categorias são:

● Infantil: Filmes com duração menor que 60 minutos e classificação indicativa
livre;

● Adolescente: Filmes com duração entre 60 e 120 minutos e classificação
indicativa de 10, 12 ou 14 anos;

● Adulto: Filmes com duração maior que 120 minutos e classificação indicativa
de 16 ou 18 anos;

● Não recomendado: Filmes com duração maior que 60 minutos e classificação
indicativa livre.

Seu programa deve solicitar as informações do filme ao usuário, fazer as verificações
necessárias e exibir a categoria do filme de acordo com as regras acima. Caso o filme
não se enquadre em nenhuma categoria, o programa deve exibir uma mensagem
adequada.
 */
package if_else;

import javax.swing.JOptionPane;

public class Exercise08 {

	public static void main(String[] args) {
		JOptionPane.showInputDialog("qual o nome do filme? ");
		
		int duracaoFilme = Integer
				.parseInt(JOptionPane.showInputDialog("Qual a duração (em minutos) do filme desejado? "));
		
		while (duracaoFilme < 0) {
			duracaoFilme = Integer.parseInt(
					JOptionPane.showInputDialog("Digite novamente a duração (em minutos) do filme desejado? "));
		}
		
		int classificacao = Integer.parseInt(JOptionPane
				.showInputDialog("Qual a classificação indicativa desejada? (digite 0 para classificação livre.) "));
		
		while (classificacao < 0) {
			classificacao = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite novamente a classificação indicativa desejada? (digite 0 para classificação livre.) "));
		}
		
		if (duracaoFilme < 60 && classificacao == 0) {
			JOptionPane.showMessageDialog(null, "Categoria de filme infantil.", "Recomendação",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (duracaoFilme >= 60 && duracaoFilme <= 120 && classificacao >= 10 && classificacao <= 14) {
			JOptionPane.showMessageDialog(null, "Categoria de filme adolescente.", "Recomendação",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (duracaoFilme > 120 && classificacao >= 16 && classificacao <= 18) {
			JOptionPane.showMessageDialog(null, "Categoria de filme adulto.", "Recomendação",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (duracaoFilme < 60 && classificacao == 0) {
			JOptionPane.showMessageDialog(null, "Não recomendado.", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Não se enquadra em nenhuma categoria.", null,
					JOptionPane.WARNING_MESSAGE);
		}

	}

}
