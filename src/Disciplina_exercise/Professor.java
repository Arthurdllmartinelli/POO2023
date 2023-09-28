package Disciplina_exercise;

import javax.swing.JOptionPane;

public class Professor {
	
	private String nome;
	private String formacao;
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do professor: "));
		setFormacao(JOptionPane.showInputDialog("Informe Formação: "));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	
	
}
