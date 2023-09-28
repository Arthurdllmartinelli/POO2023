package Disciplina_exercise;

import java.awt.JobAttributes;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util {

	public static Aluno selecionaAluno (ArrayList<Aluno> lista) {
		String menuAluno = "";
		int cont = 1;
		for (Aluno a : lista) {
			menuA1 = cont + " - " + a.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escola um aluno: "));
		return lista.get(escolha-1);
	}
	
}
