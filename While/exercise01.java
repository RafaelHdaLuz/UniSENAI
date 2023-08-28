/*
 * Criar um programa que solicita ao usuário dois números e, em seguida, pergunta qual
é o resultado da multiplicação desses dois números. Enquanto o usuário não acertar
a resposta, o programa deve informar que ele está errado e pedir para tentar
novamente. Quando o usuário acertar, o programa deve informar que o número está
correto e mostrar quantas vezes o usuário tentou até acertar.
 */
package While;

import javax.swing.JOptionPane;

public class exercise01 {

	public static void main(String[] args) {
		int nro1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int nro2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

		int qtd = 0;
		int result1 = nro1 * nro2;
		boolean resultFinal;

		do {
			int result2 = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o resultado da multiplicação desses números"));
			if (result2 == result1) {
				resultFinal = true;
			} else {
				JOptionPane.showMessageDialog(null, "Não foi dessa vez!", null, JOptionPane.INFORMATION_MESSAGE);
				qtd++;
				resultFinal = false;
			}
		} while (resultFinal == false);
		JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ ACERTOU!", null, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Quantidade de tentativas: " + qtd, null, JOptionPane.INFORMATION_MESSAGE);

	}

}
