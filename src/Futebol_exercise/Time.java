package Futebol_exercise;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {

	private String nome;
	private ArrayList<Time> times = new ArrayList<Time>();
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Informe o nome do time: "));
		String continua = "";
		do {
			Jogador j = new Jogador();
			j.cadastrar();
			jogadores.add(j);
			continua = JOptionPane.showInputDialog("Mais jogadores? S/N");

		} while (continua.equalsIgnoreCase("S"));
	}

	public String exibir() {
		String dados = "*** " + getNome() + "***\n";
		for (Jogador j : jogadores) {
			dados += j.exibir();

		}
		return dados;
	}

	public Jogador artilheiroTime() {
		Jogador art = jogadores.get(0);
		for (Jogador j : jogadores) {
			if (j.getGols() > art.getGols()) {
				art = j;
			}
		}
		return art;
	}

	public int getGolsTime() {
		int gols = 0;
		for (Jogador j : jogadores) {
			gols += j.getGols();
		}
		return gols;
	}

	public static Time timeMaiorQtdGols(ArrayList<Time> times) {
		Time timeMaiorQtd = null;
		int maiorQtd = 0;

		for (Time time : times) {
			int qtd = time.getGolsTime();
			if (qtd > maiorQtd) {
				maiorQtd = qtd;
				timeMaiorQtd = time;
			}
		}
		return timeMaiorQtd;
	}

	public Jogador artilheiroCamp() {
		Jogador artilheiro = jogadores.get(0);
		for (Jogador j : jogadores) {
			if (j.getGols() > artilheiro.getGols()) {
				artilheiro = j;
			}
		}
		return artilheiro;
	}

	public String exibeJogadores() {
		String info = " Jogadores do Time " + getNome() + "\n";
		for (Jogador j : jogadores) {
			info += j.exibir();
		}
		return info;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public ArrayList<Time> getTimes() {
		return times;
	}

	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}

}
