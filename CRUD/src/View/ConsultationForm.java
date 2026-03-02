package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultationForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Id;
	private JTextField IdP;
	private JTextField Idmed;
	private JTextField Mo;
	private JTextField Obj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultationForm frame = new ConsultationForm();
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
	public ConsultationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("identifiant");
		lblNewLabel.setBounds(10, 44, 55, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Objet");
		lblNewLabel_1.setBounds(10, 66, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Montant");
		lblNewLabel_2.setBounds(10, 91, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Idpatient ");
		lblNewLabel_3.setBounds(10, 131, 55, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Idmedecin");
		lblNewLabel_4.setBounds(10, 156, 55, 14);
		contentPane.add(lblNewLabel_4);
		
		Id = new JTextField();
		Id.setBounds(75, 41, 86, 20);
		contentPane.add(Id);
		Id.setColumns(10);
		
		IdP = new JTextField();
		IdP.setBounds(75, 122, 86, 20);
		contentPane.add(IdP);
		IdP.setColumns(10);
		
		Idmed = new JTextField();
		Idmed.setBounds(75, 153, 86, 20);
		contentPane.add(Idmed);
		Idmed.setColumns(10);
		
		Mo = new JTextField();
		Mo.setBounds(75, 88, 86, 20);
		contentPane.add(Mo);
		Mo.setColumns(10);
		
		Obj = new JTextField();
		Obj.setBounds(75, 63, 86, 20);
		contentPane.add(Obj);
		Obj.setColumns(10);
		
		JButton btnNewButton = new JButton("Enregistre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(255, 107, 89, 23);
		contentPane.add(btnNewButton);

	}
}
