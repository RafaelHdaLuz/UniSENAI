package DesafioFinal;

import javax.swing.JOptionPane;

public class DesafioFinal {

	public static void main(String[] args) {

		String nomePet[] = new String[6];
		String comportamentoPet[] = new String[6];
		String finalizar = "";
		String msgFinal;
		String sexoPet[] = new String[6];
		int idadePet[] = new int[6];
		int adocao[] = new int[6];
		int racaPet = 0;
		int contagemAdotado = 0;

		do {
			racaPet = Integer.parseInt(JOptionPane.showInputDialog("Escolha a raça do seu pet?" + "\n1 - Rotweiller "
					+ "\n2 - Poodle " + "\n3 - Golden " + "\n4 - Shitzu" + "\n5 - Bulldogue" + "\n6 - Pastor alemão"));
			while (racaPet < 1 || racaPet > 6) {
				racaPet = Integer.parseInt(JOptionPane.showInputDialog(
						"Raça não cadastrada, por favor escolha somente as raças abaixo. \nEscolha a raça do seu pet?"
								+ "\n1 - Rotweiller " + "\n2 - Poodle " + "\n3 - Golden " + "\n4 - Shitzu"
								+ "\n5 - Bulldogue" + "\n6 - Pastor alemão"));
			}

			switch (racaPet) {

			// Rottweiler
			case 1:
				nomePet[0] = JOptionPane.showInputDialog("Qual o nome do seu pet?");
				comportamentoPet[0] = JOptionPane
						.showInputDialog("Qual o comportamento do seu pet (Ex: Calmo ou bravo)?");
				while (!comportamentoPet[0].equalsIgnoreCase("calmo") && !comportamentoPet[0].equalsIgnoreCase("bravo")) {
					comportamentoPet[0] = JOptionPane.showInputDialog(
							"Comportamento inválido \nQual o comportamento do seu pet (Ex: Calmo ou bravo)?");
				}
				idadePet[0] = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu pet?"));
				while (idadePet[0] <= 0) {
					idadePet[0] = Integer
							.parseInt(JOptionPane.showInputDialog("Idade inválida! \nDigite a idade do seu pet?"));
				}
				adocao[0] = Integer
						.parseInt(JOptionPane.showInputDialog("Seu pet foi adotado? \nUtilize: \n1 - Sim \n2 - Não"));
				while (adocao[0] < 1 || adocao[0] > 2) {
					adocao[0] = Integer.parseInt(JOptionPane
							.showInputDialog("Número inválido! \nSeu pet foi adotado? \nUtilize: \n1 - Sim \n2 - Não"));
				}
				if (adocao[0] == 1) {
					contagemAdotado++;
				}
				sexoPet[0] = JOptionPane.showInputDialog("Qual o gênero do seu pet? (Digite macho ou fêmea)");
				while (!sexoPet[0].equalsIgnoreCase("macho") && !sexoPet[0].equalsIgnoreCase("fêmea")) {
					sexoPet[0] = JOptionPane.showInputDialog("Gênero inválido! \nQual o gênero do seu pet?");
				}
				break;

			// Poodle
			case 2:
				nomePet[1] = JOptionPane.showInputDialog("Qual o nome do seu pet?");
				comportamentoPet[1] = JOptionPane.showInputDialog("Qual o comportamento do seu pet?");
				while (!comportamentoPet[1].equalsIgnoreCase("calmo") && !comportamentoPet[1].equalsIgnoreCase("bravo")) {
					comportamentoPet[1] = JOptionPane.showInputDialog(
							"Comportamento inválido \nQual o comportamento do seu pet (Ex: Calmo ou bravo)?");
				}
				idadePet[1] = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu pet?"));
				while (idadePet[1] <= 0) {
					idadePet[1] = Integer
							.parseInt(JOptionPane.showInputDialog("Idade inválida! \nDigite a idade do seu pet?"));
				}
				adocao[1] = Integer
						.parseInt(JOptionPane.showInputDialog("Seu pet foi adotado? \nUtilize: \n1 - Sim \n2 - Não"));
				if (adocao[1] == 1) {
					contagemAdotado++;
				}
				sexoPet[1] = JOptionPane.showInputDialog("Qual o gênero do seu pet?");
				while (!sexoPet[1].equalsIgnoreCase("macho") && !sexoPet[1].equalsIgnoreCase("fêmea")) {
					sexoPet[1] = JOptionPane.showInputDialog("Gênero inválido! \nQual o gênero do seu pet?");
				}
				break;

			// Golden
			case 3:
				nomePet[2] = JOptionPane.showInputDialog("Qual o nome do seu pet?");
				comportamentoPet[2] = JOptionPane.showInputDialog("Qual o comportamento do seu pet?");
				while (!comportamentoPet[2].equalsIgnoreCase("calmo") && !comportamentoPet[2].equalsIgnoreCase("bravo")) {
					comportamentoPet[2] = JOptionPane.showInputDialog(
							"Comportamento inválido \nQual o comportamento do seu pet (Ex: Calmo ou bravo)?");
				}
				idadePet[2] = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu pet?"));
				while (idadePet[2] <= 0) {
					idadePet[2] = Integer
							.parseInt(JOptionPane.showInputDialog("Idade inválida! \nDigite a idade do seu pet?"));
				}
				adocao[2] = Integer
						.parseInt(JOptionPane.showInputDialog("Seu pet foi adotado? \nUtilize: \n1 - Sim \n2 - Não"));
				if (adocao[2] == 1) {
					contagemAdotado++;
				}
				sexoPet[2] = JOptionPane.showInputDialog("Qual o gênero do seu pet?");
				while (!sexoPet[2].equalsIgnoreCase("macho") && !sexoPet[2].equalsIgnoreCase("fêmea")) {
					sexoPet[2] = JOptionPane.showInputDialog("Gênero inválido! \nQual o gênero do seu pet?");
				}
				break;

			// Shitzu
			case 4:
				nomePet[3] = JOptionPane.showInputDialog("Qual o nome do seu pet?");
				comportamentoPet[3] = JOptionPane.showInputDialog("Qual o comportamento do seu pet?");
				while (!comportamentoPet[3].equalsIgnoreCase("calmo") && !comportamentoPet[3].equalsIgnoreCase("bravo")) {
					comportamentoPet[3] = JOptionPane.showInputDialog(
							"Comportamento inválido \nQual o comportamento do seu pet (Ex: Calmo ou bravo)?");
				}
				idadePet[3] = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu pet?"));
				while (idadePet[3] <= 0) {
					idadePet[3] = Integer
							.parseInt(JOptionPane.showInputDialog("Idade inválida! \nDigite a idade do seu pet?"));
				}
				adocao[3] = Integer
						.parseInt(JOptionPane.showInputDialog("Seu pet foi adotado? \nUtilize: \n1 - Sim \n2 - Não"));
				if (adocao[3] == 1) {
					contagemAdotado++;
				}
				sexoPet[3] = JOptionPane.showInputDialog("Qual o gênero do seu pet?");
				while (!sexoPet[3].equalsIgnoreCase("macho") && !sexoPet[3].equalsIgnoreCase("fêmea")) {
					sexoPet[3] = JOptionPane.showInputDialog("Gênero inválido! \nQual o gênero do seu pet?");
				}
				break;

			// Bulldogue
			case 5:
				nomePet[4] = JOptionPane.showInputDialog("Qual o nome do seu pet?");
				comportamentoPet[4] = JOptionPane.showInputDialog("Qual o comportamento do seu pet?");
				while (!comportamentoPet[4].equalsIgnoreCase("calmo") && !comportamentoPet[4].equalsIgnoreCase("bravo")) {
					comportamentoPet[4] = JOptionPane.showInputDialog(
							"Comportamento inválido \nQual o comportamento do seu pet (Ex: Calmo ou bravo)?");
				}
				idadePet[4] = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu pet?"));
				while (idadePet[4] <= 0) {
					idadePet[4] = Integer
							.parseInt(JOptionPane.showInputDialog("Idade inválida! \nDigite a idade do seu pet?"));
				}
				adocao[4] = Integer
						.parseInt(JOptionPane.showInputDialog("Seu pet foi adotado? \nUtilize: \n1 - Sim \n2 - Não"));
				if (adocao[4] == 1) {
					contagemAdotado++;
				}
				sexoPet[4] = JOptionPane.showInputDialog("Qual o gênero do seu pet?");
				while (!sexoPet[4].equalsIgnoreCase("macho") && !sexoPet[4].equalsIgnoreCase("fêmea")) {
					sexoPet[4] = JOptionPane.showInputDialog("Gênero inválido! \nQual o gênero do seu pet?");
				}

				break;
			// Partor alemão
			case 6:
				nomePet[5] = JOptionPane.showInputDialog("Qual o nome do seu pet?");
				comportamentoPet[5] = JOptionPane.showInputDialog("Qual o comportamento do seu pet?");
				while (!comportamentoPet[5].equalsIgnoreCase("calmo") && !comportamentoPet[5].equalsIgnoreCase("bravo")) {
					comportamentoPet[5] = JOptionPane.showInputDialog(
							"Comportamento inválido \nQual o comportamento do seu pet (Ex: Calmo ou bravo)?");
				}
				idadePet[5] = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu pet?"));
				while (idadePet[5] <= 0) {
					idadePet[5] = Integer
							.parseInt(JOptionPane.showInputDialog("Idade inválida! \nDigite a idade do seu pet?"));
				}
				adocao[5] = Integer
						.parseInt(JOptionPane.showInputDialog("Seu pet foi adotado? \nUtilize: \n1 - Sim \n2 - Não"));
				if (adocao[5] == 1) {
					contagemAdotado++;
				}
				sexoPet[5] = JOptionPane.showInputDialog("Qual o gênero do seu pet?");
				while (!sexoPet[5].equalsIgnoreCase("macho") && !sexoPet[5].equalsIgnoreCase("fêmea")) {
					sexoPet[5] = JOptionPane.showInputDialog("Gênero inválido! \nQual o gênero do seu pet?");
				}
				break;

			default:
				JOptionPane.showMessageDialog(null, "Raça invalída, por favor tente novamente", null,
						JOptionPane.INFORMATION_MESSAGE);
				break;

			}
			finalizar = JOptionPane.showInputDialog("Deseja finalizar? (s/n)");
		} while (finalizar.equalsIgnoreCase("n"));

		// Opções para o usuário
		int lista = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo. " + "\nDigite: "
				+ "\n1 - Mostrar animais por idade " + "\n2 - Animais por gênero " + "\n3 - Animais por comportamento "
				+ "\n4 - Animais por raça " + "\n5 - Animais disponíveis para adoção " + "\n6 - Todos os animais"));
		while (lista < 1 || lista > 6) {
			lista = Integer.parseInt(JOptionPane.showInputDialog("Número inválido! Por favor digite novamente."
					+ "\nSelecione uma das opções abaixo. " + "\nDigite: " + "\n1 - Mostrar animais por idade "
					+ "\n2 - Animais por gênero " + "\n3 - Animais por comportamento " + "\n4 - Animais por raça "
					+ "\n5 - Animais disponíveis para adoção " + "\n6 - Todos os animais"));
		}

		switch (lista) {

		// Mostrar animais por idade.
		case 1:
			for (int i = 0; i < 5; i++) {

				// Validação para não mostrar mensagem sem dados ("null")
				if (nomePet[i] != null) {
					msgFinal = nomePet[i] + "\nIdade: " + idadePet[i];
					JOptionPane.showMessageDialog(null, msgFinal, null, JOptionPane.INFORMATION_MESSAGE);
				}
			}
			break;

		// Mostrar animais por sexo.
		case 2:
			for (int i = 0; i < 5; i++) {
				if (nomePet[i] != null) {
					msgFinal = nomePet[i] + "\nGênero: " + sexoPet[i];
					JOptionPane.showMessageDialog(null, msgFinal, null, JOptionPane.INFORMATION_MESSAGE);
				}
			}
			break;

		// Mostrar animais por comportamento
		case 3:
			for (int i = 0; i < 5; i++) {
				if (nomePet[i] != null) {
					msgFinal = "Nome: " + nomePet[i] + "\nComportamento:" + comportamentoPet[i];
					JOptionPane.showMessageDialog(null, msgFinal, null, JOptionPane.INFORMATION_MESSAGE);
				}
			}
			break;

		// Mostrar raças
		case 4:
			JOptionPane.showMessageDialog(null, "" + "Raças: " + "\nRotweiller" + "\nPoodle" + "\nGolden" + "\nShitzu"
					+ "\nBulldogue" + "\nPartor alemão", null, JOptionPane.INFORMATION_MESSAGE);
			break;

		// Animais disponíveis para adoção
		case 5:
			JOptionPane.showMessageDialog(null, "Quantidade de animais disponíveis para adoção: " + contagemAdotado,
					null, JOptionPane.INFORMATION_MESSAGE);
			break;

		// Mostrar todos os animais
		case 6:
			for (int i = 0; i < 5; i++) {
				if (nomePet[i] != null) {
					msgFinal = "Nome: " + nomePet[i] + "\nComportamento: " + comportamentoPet[i] + "\nIdade: "
							+ idadePet[i];
					JOptionPane.showMessageDialog(null, msgFinal, null, JOptionPane.INFORMATION_MESSAGE);
				}
			}
			break;
		}
	}
}
