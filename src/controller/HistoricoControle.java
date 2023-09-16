package controller;

import javax.swing.JOptionPane;

import model.PilhaString;

public class HistoricoControle {

	public HistoricoControle() {
		super();
	}
	
	public void adiconarHistorico (PilhaString p, String endereco) {
		if (!endereco.contains("https://www")&&(!endereco.contains(".co")||!endereco.contains(".com"))) {
			do {
			JOptionPane.showMessageDialog(null, "Endereço inválido");
			endereco = JOptionPane.showInputDialog("Insira novamente o endereço: ");
			} while (!endereco.contains("https://www")&&(!endereco.contains(".co")||!endereco.contains(".com")));
		}
		p.push(endereco);
		System.out.println(endereco + " adicionado ao histórico");
		
		
	}
	
	public void removeHistorico (PilhaString p) {
		try {
			String removido = p.pop();
			System.out.println(removido+ " removido do histórico");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	

	public String consultaHistorico (PilhaString p) {
		String endereco = null;
		try {
			endereco = p.top();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			return endereco;
		}
	}

}
