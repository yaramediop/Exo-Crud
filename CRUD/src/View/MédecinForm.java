package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MédecinForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField IdM;
	private JTextField n;
	private JTextField p;
	private JTextField spe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MédecinForm frame = new MédecinForm();
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
	public MédecinForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Identifiant");
		lblNewLabel.setBounds(10, 41, 57, 14);
		contentPane.add(lblNewLabel);
		
		IdM = new JTextField();
		IdM.setBounds(101, 38, 86, 20);
		contentPane.add(IdM);
		IdM.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(10, 66, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		n = new JTextField();
		n.setBounds(101, 69, 86, 20);
		contentPane.add(n);
		n.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Prenom");
		lblNewLabel_2.setBounds(10, 109, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		p = new JTextField();
		p.setBounds(101, 106, 86, 20);
		contentPane.add(p);
		p.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("specialite");
		lblNewLabel_3.setBounds(10, 153, 70, 14);
		contentPane.add(lblNewLabel_3);
		
		spe = new JTextField();
		spe.setBounds(101, 150, 86, 20);
		contentPane.add(spe);
		spe.setColumns(10);
		
		JButton btnNewButton = new JButton("Enregistre ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(293, 149, 89, 23);
		contentPane.add(btnNewButton);

	}
}
