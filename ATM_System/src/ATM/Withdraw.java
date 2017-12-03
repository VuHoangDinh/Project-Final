package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Withdraw extends JFrame {

	private JPanel contentPane;
	private JTextField txtAmount;
	private JTextField textField_1;
	private Withdraw withdraw;
	private JLabel alert;
	
	private JButton btnWithdraw;
	private JButton btnDeposit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw frame = new Withdraw();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public class Deposit {
	public Deposit(String text) {
		// TODO Auto-generated constructor stub
	}

	private Deposit deposit;
}
	/**
	 * Create the frame.
	 */
	public Withdraw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWithdrawal = new JLabel("Withdrawal & Deposit");
		lblWithdrawal.setBounds(144, 23, 125, 14);
		contentPane.add(lblWithdrawal);
		
		txtAmount = new JTextField("");
		txtAmount.setBounds(144, 76, 119, 35);
		getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		JLabel lblEnterTheAmount = new JLabel("Enter the amount:");
		lblEnterTheAmount.setBounds(25, 77, 103, 32);
		contentPane.add(lblEnterTheAmount);
		
		JLabel alert = new JLabel("");
		alert.setBounds(25, 149, 399, 33);
		getContentPane().add(alert);
		
	
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withdraw = new Withdraw(txtAmount.getText());
				{alert.setText( txtAmount.getText() + " has been withdrawn.");}
				
				
	/* how to disable other buttons after click?			
				btnDeposit.setEnabled(false);*/
				
			}
		});
		btnWithdraw.setBounds(289, 65, 135, 23);
		contentPane.add(btnWithdraw);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deposit deposit = new Deposit(txtAmount.getText());
				alert.setText( txtAmount.getText() + " has been deposited.");
			}
		});
		btnDeposit.setBounds(289, 99, 135, 23);
		contentPane.add(btnDeposit);
		
		JLabel lblAccountBalance = new JLabel("Account Balance");
		lblAccountBalance.setBounds(25, 193, 103, 35);
		contentPane.add(lblAccountBalance);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 193, 118, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("Exit");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(374, 521, 89, 23);
		contentPane.add(button);
		
		JButton btnPrintOut = new JButton("Latest transactions");
		btnPrintOut.setBounds(10, 239, 158, 23);
		contentPane.add(btnPrintOut);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 273, 453, 226);
		contentPane.add(textArea);
		
		
	}

	public Withdraw(String text) {
		// TODO Auto-generated constructor stub
	}

}
