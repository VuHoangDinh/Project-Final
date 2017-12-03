package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loan extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField jtxtReceipt;

	private JButton btnExit ;
	private JButton btnReset ;
	private JButton btnLoan ;
	private JButton btnReceipt ;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loan frame = new Loan();
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
	public Loan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(24, 60, 529, 534);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Interest rate");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBounds(10, 11, 200, 44);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(235, 25, 86, 28);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("Number of years");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_1.setBounds(10, 68, 213, 44);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(235, 82, 86, 28);
		panel.add(textField_1);
		
		JLabel label_2 = new JLabel("Amount of loan");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_2.setBounds(10, 123, 200, 44);
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(235, 137, 86, 28);
		panel.add(textField_2);
		
		JLabel label_3 = new JLabel("Monthly payment");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_3.setBounds(10, 178, 225, 44);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(235, 192, 86, 28);
		panel.add(textField_3);
		
		JLabel label_4 = new JLabel("Interest rate");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_4.setBounds(10, 233, 200, 44);
		panel.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(235, 247, 86, 28);
		panel.add(textField_4);
		
		JButton btnloan = new JButton("Loan");
		btnloan.setForeground(Color.BLUE);
		btnloan.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnloan.setBounds(345, 11, 163, 44);
		panel.add(btnloan);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReceipt.setForeground(Color.BLUE);
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReceipt.setBounds(345, 85, 163, 44);
		panel.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setForeground(Color.BLUE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBounds(345, 157, 163, 44);
		panel.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(345, 233, 163, 44);
		panel.add(btnExit);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 288, 509, 284);
		panel.add(textArea);
		
		JLabel lblLoan = new JLabel("Loan ");
		lblLoan.setForeground(new Color(255, 153, 51));
		lblLoan.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblLoan.setBounds(248, 11, 95, 38);
		contentPane.add(lblLoan);
	}

}
