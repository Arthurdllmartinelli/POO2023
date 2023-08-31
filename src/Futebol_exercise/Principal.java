package Futebol_exercise;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Time> times = new ArrayList<>();

		ArrayList<Jogador> jogadores = new ArrayList<>();

		Time time = new Time();

		String menu = "1 - Cadastro de Jogador\n" + "2 - Buscar pelo Artilheiro\n" + "3 - Buscar Time com mais gols\n"
				+ "4 - Buscar todos os jogadores de um time\n" + "5 - Cancelar/sair";

		int op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {

				time.cadastrar();
				times.add(time);
			}

			if (op == 2) {
				Jogador artilheiro = time.artilheiroCamp();

				JOptionPane.showMessageDialog(null, "O jogador com mais gols do campeonato é: " + artilheiro.getNome()
						+ " com " + artilheiro.getGols() + " gols.");
			}

			if (op == 3) {
				Time timeMaiorQtd = time.timeMaiorQtdGols(times);
				int maiorQtd = 0;

				for (Time t : times) {
					int qtd = t.getGolsTime();
					if (qtd > maiorQtd) {
						maiorQtd = qtd;
						timeMaiorQtd = t;
					}
					JOptionPane.showMessageDialog(null,
							"O time com maior qtd de gols no campeonato é: " + timeMaiorQtd.getNome());
				}
			}
			if (op == 4) {
				String result = new String();
				for (Time t : times) {
					result += t.exibeJogadores();
				}

				JOptionPane.showMessageDialog(null, result);
			}
		} while (op != 5);
	}
}
