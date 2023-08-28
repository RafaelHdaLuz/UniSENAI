//Construa um código capaz de solicitar ao usuário uma nota de 0 a 10. Se ele tirou: a
//partir 7 está aprovado, entre 5 e 6 está em recuperação, abaixo de 5 está reprovado.

package Methods;

import javax.swing.JOptionPane;

public class exercise01 {

	public static void main(String[] args) {
		// Declara uma variável double chamada nota e atribui a ela o valor retornado pelo método solicitarNota1().
		double nota = solicitarNota1();
		verificarAprovacao1(nota);
	}
	
	// Aqui começa a definição do método solicitarNota(), que retorna um valor do tipo double.
	public static double solicitarNota1() {
		String notaStr = JOptionPane.showInputDialog("Digite a nota do aluno (0 a 10):");
		// Converte a string notaStr para um valor numérico do tipo double usando o método Double.parseDouble(). 
		double nota = Double.parseDouble(notaStr);
		// Retorna o valor da nota como resultado do método solicitarNota().
		return nota;
	}

	public static void verificarAprovacao1(double nota) {
		if (nota >= 7.0) {
			JOptionPane.showMessageDialog(null, "Aluno aprovado!");
		} else if (nota >= 5.0 && nota < 7.0) {
			JOptionPane.showMessageDialog(null, "Aluno em recuperação.");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado.");
		}
	}

}
