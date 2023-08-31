package Library_exercise;

import java.util.List;

import javax.swing.JOptionPane;

public class AprincipalLibrary {

	public static void main(String[] args) {
		Library library = new Library();
	}

	String menu = "1 - Cadastrar livro\n" + "2 - Listar livros\n" + "3 - Cancelar/sair";

	int opcao = 0;

	do
	{
		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

		if (opcao == 1) {

			JOptionPane.showInputDialog(null, "Digite o título do livro: ");
			JOptionPane.showInputDialog(null, "Digite o preço do livro: ");

			Book livro = new Book(titulo, preco);

			JOptionPane.showInputDialog(null, "Quantos autores têm o livro? ");

			for (int i = 0; i < numAutores; i++) {
				JOptionPane.showInputDialog(null, "Digite o nome do autor: ");
				
				JOptionPane.showInputDialog(null, "Digite o sexo do autor: ");
				
				JOptionPane.showInputDialog(null, "Digite a idade do autor: ");
				

				Autor autor = new Autor(nomeAutor, sexoAutor, idadeAutor);
				livro.addAutor(autor);
			}
		}

		if (opcao == 2) {

			List<Book> livrosCadastrados = Library.listarLivros();
			JOptionPane.showMessageDialog(null, "Livros cadastrados:\n");
			for (Book l : livrosCadastrados) {
				JOptionPane.showMessageDialog(null, "Título: " + l.titulo + ", Preço: R$" + l.preco);
				JOptionPane.showMessageDialog(null, "Autores: ");
				for (Autor autor : l.autores) {
					JOptionPane.showMessageDialog(null, autor.nome + " ");
				}
			}
		}

	}while(opcao!=5);
}}
