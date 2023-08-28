//Construa um programa que solicite ao usuário apenas os números de seu telefone.
//(ex.: 47987654321). Em seguida, por meio de um método, você construirá uma
//máscara para esse número (ex.: (47) 98765-4321).
package Methods;

import javax.swing.JOptionPane;

public class exercise02 {

	public static void main(String[] args) {
		String numero = solicitarNumeroTelefone();
		String numeroMascarado = aplicarMascara(numero);
		JOptionPane.showMessageDialog(null, "Número de telefone mascarado: " + numeroMascarado);
	}

	public static String solicitarNumeroTelefone() {
		String numero = JOptionPane.showInputDialog("Digite o número de telefone (apenas dígitos):");
		return numero;
	}

	public static String aplicarMascara(String numero) {
		// Verifica se o número tem pelo menos 10 dígitos (incluindo o DDD)
		if (numero.length() >= 10) {
			// Divide a string numero em três partes:
			// os dois primeiros dígitos correspondem ao DDD,
			// os próximos cinco dígitos compõem a primeira parte do número, e o restante
			// forma a segunda parte do número.
			String ddd = numero.substring(0, 2);
			String parte1 = numero.substring(2, 7);
			String parte2 = numero.substring(7);
			// Retorna uma string formatada com a máscara desejada: "(DD) XXXXX-XXXX".
			return "(" + ddd + ") " + parte1 + "-" + parte2;
		} else {
			JOptionPane.showMessageDialog(null, "Número de telefone inválido.");
			return "";
		}
	}
}
