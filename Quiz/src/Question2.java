import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Question2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question2 frame = new Question2();
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
	public Question2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhichItemHave = new JLabel("Which item have unique attack?");
		lblWhichItemHave.setForeground(Color.BLUE);
		lblWhichItemHave.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblWhichItemHave.setBounds(20, 48, 354, 53);
		contentPane.add(lblWhichItemHave);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Desolator");
		rdbtnNewRadioButton.setForeground(new Color(0, 102, 204));
		rdbtnNewRadioButton.setBounds(33, 126, 89, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNothing = new JRadioButton("Nothing!");
		rdbtnNothing.setForeground(new Color(0, 102, 204));
		rdbtnNothing.setBounds(239, 203, 109, 23);
		contentPane.add(rdbtnNothing);
		
		JRadioButton rdbtnEyeOfSkadi = new JRadioButton("Eye of Skadi");
		rdbtnEyeOfSkadi.setForeground(new Color(0, 102, 204));
		rdbtnEyeOfSkadi.setBounds(33, 203, 89, 23);
		contentPane.add(rdbtnEyeOfSkadi);
		
		JRadioButton rdbtnSangeAndYasha = new JRadioButton("Sange and Yasha");
		rdbtnSangeAndYasha.setForeground(new Color(0, 102, 204));
		rdbtnSangeAndYasha.setBounds(239, 126, 109, 23);
		contentPane.add(rdbtnSangeAndYasha);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			}
		);
		btnExit.setForeground(Color.RED);
		btnExit.setBounds(192, 278, 90, 43);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Desolator_icon.png"));
		lblNewLabel.setBounds(128, 112, 89, 51);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Eye_of_Skadi_icon.png"));
		label.setBounds(128, 189, 89, 51);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Sange_and_Yasha_icon.png"));
		label_1.setBounds(354, 112, 89, 51);
		contentPane.add(label_1);
		
		JLabel lblQuestion = new JLabel("Question 2:");
		lblQuestion.setForeground(Color.BLUE);
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuestion.setBounds(20, 11, 126, 35);
		contentPane.add(lblQuestion);
	}
}
