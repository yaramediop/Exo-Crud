package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PatientForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField IdP;
	private JTextField n;
	private JTextField p;
	private JTextField s;
	private JTextField age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientForm frame = new PatientForm();
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
	public PatientForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Identifiant ");
		lblNewLabel.setBounds(10, 24, 59, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(10, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prenom");
		lblNewLabel_2.setBounds(10, 90, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sexe");
		lblNewLabel_3.setBounds(10, 122, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Age");
		lblNewLabel_4.setBounds(10, 157, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		IdP = new JTextField();
		IdP.setBounds(102, 21, 86, 20);
		contentPane.add(IdP);
		IdP.setColumns(10);
		
		n = new JTextField();
		n.setBounds(102, 51, 86, 20);
		contentPane.add(n);
		n.setColumns(10);
		
		p = new JTextField();
		p.setBounds(102, 87, 86, 20);
		contentPane.add(p);
		p.setColumns(10);
		
		s = new JTextField();
		s.setBounds(102, 119, 86, 20);
		contentPane.add(s);
		s.setColumns(10);
		
		age = new JTextField();
		age.setBounds(102, 154, 86, 20);
		contentPane.add(age);
		age.setColumns(10);
		
		JButton btnNewButton = new JButton("Enregistre ");
		btnNewButton.setBounds(277, 102, 89, 23);
		contentPane.add(btnNewButton);

	}

}
