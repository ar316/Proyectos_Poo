import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Label;

public class App extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	private JPanel panel_1;
	private Label label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAadirEvento = new JButton("añadir evento");
		contentPane.add(btnAadirEvento);

        btnAadirEvento.addActionListener(null);
		
		label = new Label("New label");
		contentPane.add(label);
		
		panel = new JPanel();
		contentPane.add(panel);
	}
}