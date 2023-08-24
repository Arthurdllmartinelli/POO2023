package Car_exercise;

import javax.naming.InitialContext;
import javax.swing.JOptionPane;

public class Carro {
	
	String carro , cor;
	Integer fabricacao;

	void cadastra() {
		carro = JOptionPane.showInputDialog("Informe a marca do seu carro: ");
		fabricacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a data de fabricação do seu carro: "));
		cor = JOptionPane.showInputDialog("Informe a cor do seu carro: ");
	}
	
	String Lista() {
		return carro+" - " + cor + " - " + fabricacao + "\n";
		
	}
	
	
	
}