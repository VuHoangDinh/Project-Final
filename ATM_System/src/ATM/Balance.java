package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Balance extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Balance frame = new Balance();
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
	public Balance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYourAccountBallance = new JLabel("Ballance:");
		lblYourAccountBallance.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblYourAccountBallance.setBackground(new Color(0, 0, 255));
		lblYourAccountBallance.setForeground(new Color(255, 153, 0));
		lblYourAccountBallance.setBounds(10, 11, 148, 67);
		contentPane.add(lblYourAccountBallance);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_1.setBounds(83, 89, 99, 44);
		contentPane.add(button_1);
		
		JLabel lblEu = new JLabel("500 eu");
		lblEu.setForeground(new Color(0, 204, 255));
		lblEu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblEu.setBounds(162, 29, 99, 30);
		contentPane.add(lblEu);
	}

}
