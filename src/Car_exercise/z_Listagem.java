package Car_exercise;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class z_Listagem {

	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<Carro>();
		String menu = "1 - Cadastrar\n" + "2 - Listar todos\n" + "3 - Filtrar por ano\n" + "4 - Filtrar por marca\n"
				+ "5 - Filtrar por cor\n" + "6 - Sair";

		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (opcao == 1) {
				Carro p = new Carro();
				p.cadastra();
				carros.add(p);
			}

			if (opcao == 2) {
				String result = "Carros cadastrados\n\n";
				for (Carro p : carros) {
					result += p.Lista();
				}
				JOptionPane.showMessageDialog(null, result);
			}

			if (opcao == 3) {
				Integer anolista = Integer.parseInt(JOptionPane.showInputDialog(null, "Filtrar por ano de fabricação"));
				String result = "Veículos com ano de fabricação " + anolista + "\n\n";
				Integer totalanolista = 0;

				for (Carro p : carros) {
					if (p.fabricacao.equals(anolista)) {
						result += p.Lista();
						totalanolista++;
					}
				}
				if (carros.size() > 0) {
					double percentual = ((double) totalanolista / carros.size()) * 100;
					result += "Percentual: " + percentual + "% dos carros com data de fabricação de " + anolista;
				}
				JOptionPane.showMessageDialog(null, result);
			}

			if (opcao == 4) {
				String marcalista = JOptionPane.showInputDialog(null, "Filtrar pela marca do veículo");
				String result = "Veículos com a marca " + marcalista + "\n\n";
				Integer totalmarcalista = 0;

				for (Carro p : carros) {
					if (p.carro.equalsIgnoreCase(marcalista)) {
						result += p.Lista();
						totalmarcalista++;
					}
				}

				if (carros.size() > 0) {
					double percentual = ((double) totalmarcalista / carros.size()) * 100;
					result += "Percentual: " + percentual + "% dos carros têm a marca: " + marcalista;
				}
				JOptionPane.showMessageDialog(null, result);
			}

			if (opcao == 5) {
				String corlista = JOptionPane.showInputDialog(null, "Informe a cor do carro: ");
				String result = "Carros de cor " + corlista + "\n\n";
				Integer totalcorlista = 0;

				for (Carro p : carros) {
					if (p.cor.equalsIgnoreCase(corlista)) {
						result += p.Lista();
						totalcorlista++;
					}
				}
				if (carros.size() > 0) {
					double percentual = ((double) totalcorlista / carros.size()) * 100;
					result += "Percentual: " + percentual + "% dos carros têm a cor " + corlista;
				}
				JOptionPane.showMessageDialog(null, result);
			}

		} while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 || opcao == 5);
	}
}
