package ATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;


public class ATm_Sys {

	JFrame frame;
	private JTextField jlblDisplay;
	
	
	
	
	private JButton jbtnBalance;
	private JButton jbtnLoan ;
	private JButton jbtnWithdrawal ;
	private JButton jbtnDeposit ;
	
	private JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5,jbtn6,jbtn7,jbtn8,jbtn9,jbtn0 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATm_Sys window = new ATm_Sys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATm_Sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 495, 686);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 109, 111, 174);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtnBalance = new JButton(">");
		jbtnBalance.setEnabled(false);
		jbtnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Balance b = new Balance();
				b.setVisible(true);
			}
		});
		jbtnBalance.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnBalance.setBounds(10, 11, 97, 61);
		panel.add(jbtnBalance);
		
		JButton jbtnWithdrawal = new JButton(">");
		jbtnWithdrawal.setEnabled(false);
		jbtnWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Withdraw w = new Withdraw();
				w.setVisible(true);
			}
		});
		jbtnWithdrawal.setBounds(10, 102, 97, 61);
		panel.add(jbtnWithdrawal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(131, 109, 214, 174);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel jlblBalance = new JLabel("Balance");
		jlblBalance.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlblBalance.setBounds(10, 26, 73, 31);
		panel_1.add(jlblBalance);
		
		JLabel jlblLoan = new JLabel("Loan");
		jlblLoan.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlblLoan.setBounds(131, 26, 73, 31);
		panel_1.add(jlblLoan);
		
		JLabel jlblWithdrawal = new JLabel("Withdrawal");
		jlblWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlblWithdrawal.setBounds(10, 113, 87, 31);
		panel_1.add(jlblWithdrawal);
		
		JLabel jlblDeposit = new JLabel("Deposit");
		jlblDeposit.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlblDeposit.setBounds(131, 113, 73, 31);
		panel_1.add(jlblDeposit);
		
		jlblDisplay = new JTextField();
		jlblDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblDisplay.setBounds(10, 68, 194, 34);
		panel_1.add(jlblDisplay);
		jlblDisplay.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(355, 109, 111, 174);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton jbtnLoan = new JButton("<");
		jbtnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loan l = new Loan();
				l.setVisible(true);
				frame.dispose();
			}
		});
		jbtnLoan.setEnabled(false);
		jbtnLoan.setFont(new Font("Tahoma", Font.BOLD, 29));
		jbtnLoan.setBounds(10, 11, 97, 61);
		panel_2.add(jbtnLoan);
		
		JButton jbtnDeposit = new JButton("<");
		jbtnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Withdraw w = new Withdraw();
				w.setVisible(true);
			}
		});
		jbtnDeposit.setEnabled(false);
		jbtnDeposit.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnDeposit.setBounds(10, 102, 97, 61);
		panel_2.add(jbtnDeposit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 317, 456, 321);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		//number buttons
		JButton jbtn1 = new JButton("");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "1";
				jlblDisplay.setText(Enternunber);
			}
		});
		jbtn1.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/1.png")));
		jbtn1.setBounds(10, 22, 97, 61);
		panel_3.add(jbtn1);
		
		JButton jbtn2 = new JButton("");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "2";
				jlblDisplay.setText(Enternunber);
			
			}
		});
		jbtn2.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/2.png")));
		jbtn2.setBounds(117, 22, 97, 61);
		panel_3.add(jbtn2);
		
		JButton jbtn3 = new JButton("");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "3";
				jlblDisplay.setText(Enternunber);
			}
		});
		jbtn3.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/3.png")));
		jbtn3.setBounds(224, 22, 97, 61);
		panel_3.add(jbtn3);
		
		
		JButton jbtn4 = new JButton("");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "4";
				jlblDisplay.setText(Enternunber);
			}
		});
		jbtn4.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/4.png")));
		jbtn4.setBounds(10, 94, 97, 61);
		panel_3.add(jbtn4);
		
		JButton jbtn5 = new JButton("");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "5";
				jlblDisplay.setText(Enternunber);
			}
		});
		jbtn5.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/5.png")));
		jbtn5.setBounds(117, 94, 97, 61);
		panel_3.add(jbtn5);
		
		JButton jbtn6 = new JButton("");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "6";
				jlblDisplay.setText(Enternunber);
			}
		});
		jbtn6.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/6.png")));
		jbtn6.setBounds(224, 94, 97, 61);
		panel_3.add(jbtn6);
		
		JButton jbtnClear = new JButton("");
		jbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblDisplay.setText("");
			}
		});
		jbtnClear.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/clear.png")));
		jbtnClear.setBounds(349, 94, 97, 61);
		panel_3.add(jbtnClear);
		
		JButton jbtn7 = new JButton("");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "7";
				jlblDisplay.setText(Enternunber);
			}
		});
		jbtn7.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/7.png")));
		jbtn7.setBounds(10, 166, 97, 61);
		panel_3.add(jbtn7);
		
		JButton jbtn8 = new JButton("");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "8";
				jlblDisplay.setText(Enternunber);
			}
		});
		jbtn8.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/8.png")));
		jbtn8.setBounds(117, 166, 97, 61);
		panel_3.add(jbtn8);
		
		JButton jbtn9 = new JButton("");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "9";
				jlblDisplay.setText(Enternunber);
			}
		});
		jbtn9.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/9.png")));
		jbtn9.setBounds(224, 166, 97, 61);
		panel_3.add(jbtn9);
		
		JButton jbtn0 = new JButton("");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternunber = jlblDisplay.getText() + "0";
				jlblDisplay.setText(Enternunber);
			}
		});
		jbtn0.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/0.png")));
		jbtn0.setBounds(117, 238, 97, 61);
		panel_3.add(jbtn0);
		
		//function buttons 1
		
		JButton jbtnCancel = new JButton("");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jbtnCancel.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/cancel.png")));
		jbtnCancel.setBounds(349, 22, 97, 61);
		panel_3.add(jbtnCancel);
		
		JButton jbtnEnter = new JButton("");
		jbtnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pin1 = Integer.parseInt(jlblDisplay.getText());
				int pin2 = Integer.parseInt(jlblDisplay.getText());
				int pin3 = Integer.parseInt(jlblDisplay.getText());
				
				if (pin1 == 1234) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblLoan.setVisible(true);
					jlblBalance.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
				}
				
				else if (pin2 == 9631) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblLoan.setVisible(true);
					jlblBalance.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
				}
				
				else if (pin3 == 2256) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblLoan.setVisible(true);
					jlblBalance.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
				}
				else
				{
					jlblDisplay.setText("Invalid Pin");
				}
			}
		});
		jbtnEnter.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/enter.png")));
		jbtnEnter.setBounds(349, 166, 97, 61);
		panel_3.add(jbtnEnter);
		
		JButton button_11 = new JButton("");
		button_11.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/null.png")));
		button_11.setBounds(10, 238, 97, 61);
		panel_3.add(button_11);
		
		JButton button_13 = new JButton("");
		button_13.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/null.png")));
		button_13.setBounds(224, 238, 97, 61);
		panel_3.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setIcon(new ImageIcon(ATm_Sys.class.getResource("/ATM/null.png")));
		button_14.setBounds(349, 238, 97, 61);
		panel_3.add(button_14);
		
		JLabel lblOtto = new JLabel("Otto Machine");
		lblOtto.setForeground(Color.ORANGE);
		lblOtto.setFont(new Font("Verdana", Font.BOLD, 30));
		lblOtto.setBounds(125, 17, 238, 81);
		frame.getContentPane().add(lblOtto);
	}
}
