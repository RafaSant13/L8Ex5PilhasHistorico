package view;

import javax.swing.JOptionPane;

import controller.HistoricoControle;
import model.PilhaString;

public class Principal {

	public static void main(String[] args) {
		HistoricoControle h = new HistoricoControle();
		PilhaString historico = new PilhaString();
		int X = 0;
		while(X!=9) {
			X = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Adiciona endere�o novo\n2 - Consultar �ltimo endere�o\n3 - Remover �ltimo endere�o\n9 - Fim"));
			switch (X) {
				case 1:
					String endereco = JOptionPane.showInputDialog("Insira o endereco: ");
					h.adiconarHistorico(historico, endereco);
					break;
				case 2:
					System.out.println("O �ltimo endere�o do hist�rico �: "+h.consultaHistorico(historico));
					break;
				case 3:
					h.removeHistorico(historico);
					break;
				case 9:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Valor Inv�lido");
					break;
			}

		}
		
	}
}
