package a_Class_Object;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalImc2 {
	
	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		String menu = "1 - Cadastrar\n"
				+ "2 - Listar\n"
				+ "3 - Sair";
		
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if( opcao == 1) {
					Pessoa p = new Pessoa();
					p.cadastra();
					pessoas.add(p);
			}
			
			if( opcao == 2 ) {
				String result = "Pessoas cadastradas\n\n";
				for(Pessoa p: pessoas) {
					result += p.exibirDados();
				}
				JOptionPane.showMessageDialog(null, result);
			}
		}while(opcao == 1 || opcao == 2);
		}
	}
