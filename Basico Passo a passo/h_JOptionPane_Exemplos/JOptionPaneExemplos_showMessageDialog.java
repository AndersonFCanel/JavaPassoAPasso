package h_JOptionPane_Exemplos;

import javax.swing.JOptionPane;
public class JOptionPaneExemplos_showMessageDialog {
	public static void main(String[] args) {		
		JOptionPane.showMessageDialog(null, "Mensagem de informa��o!", "T�TULO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem de aten��o!", "T�TULO", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem de erro!", "T�TULO", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem simples!", "T�TULO", JOptionPane.PLAIN_MESSAGE);
	}
}