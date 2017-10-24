package h_JOptionPane_Exemplos;

import javax.swing.JOptionPane;
public class JOptionPaneExemplos_showMessageDialog {
	public static void main(String[] args) {		
		JOptionPane.showMessageDialog(null, "Mensagem de informação!", "TÍTULO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem de atenção!", "TÍTULO", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem de erro!", "TÍTULO", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem simples!", "TÍTULO", JOptionPane.PLAIN_MESSAGE);
	}
}