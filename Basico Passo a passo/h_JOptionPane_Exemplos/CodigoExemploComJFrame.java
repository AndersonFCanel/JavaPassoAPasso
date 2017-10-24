package h_JOptionPane_Exemplos;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CodigoExemploComJFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton button;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodigoExemploComJFrame frame = new CodigoExemploComJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public CodigoExemploComJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		this.button = new JButton("New button");
		this.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action();
			}
		});
		this.button.setBounds(163, 116, 89, 23);
		this.contentPane.add(this.button);
	}
	private void action() {
		// Aparece no centro do monitor.
		JOptionPane.showMessageDialog(null, "Titulo", "Mensagem1", JOptionPane.ERROR_MESSAGE);
		// Aparece no centro da Janela.
		JOptionPane.showMessageDialog(this, "Titulo", "Mensagem2", JOptionPane.INFORMATION_MESSAGE);
	}
}