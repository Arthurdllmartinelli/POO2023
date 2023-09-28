package Disciplina_exercise;

import java.util.ArrayList;

public class Matricula {

	private static ArrayList<Professor> professores = new Arraylist<Arofessor>();
	private static ArrayList<Disciplina> disciplinas = new Arraylist<Aisciplina>();
	private static ArrayList<Aluno> alunos = new Arraylist<Aluno>();
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				professores.add(new Professor());
				break;
			case 2:
				Disciplina d = new Disciplina();
				d.cadastrar(professores);
				disciplinas.add(d);
				break;
			case 3:
				a.cadastra();
				alunos.add(a);
				break;
			}
			
		}
	}

	public static Arraylist<Professor> getProfessores() {
		return professores;
	}

	public static void setProfessores(Arraylist<Professor> professores) {
		Matricula.professores = professores;
	}

	public static Arraylist<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public static void setDisciplinas(Arraylist<Disciplina> disciplinas) {
		Matricula.disciplinas = disciplinas;
	}

	public static Arraylist<Aluno> getAlunos() {
		return alunos;
	}

	public static void setAlunos(Arraylist<Aluno> alunos) {
		Matricula.alunos = alunos;
	}
	
}
