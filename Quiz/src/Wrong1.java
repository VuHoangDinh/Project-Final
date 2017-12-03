import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Wrong1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wrong1 frame = new Wrong1();
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
	public Wrong1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Good Game Well Play! :(");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(109, 11, 289, 99);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(Color.RED);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Opening window = new Opening();
				window.getFrame().setVisible(true);
				dispose();
				
			}
		});
		btnHome.setBounds(45, 287, 89, 53);
		contentPane.add(btnHome);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.RED);
		btnExit.setBounds(355, 287, 89, 53);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton btnRestart = new JButton("Restart!");
		btnRestart.setForeground(Color.RED);
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question1 q = new Question1();
				q.setVisible(true);
				dispose();	
			}
		});
		btnRestart.setBounds(206, 287, 89, 53);
		contentPane.add(btnRestart);
		
		JLabel lblTheRightAnswer = new JLabel("The right answer is : LIQUID");
		lblTheRightAnswer.setForeground(Color.BLUE);
		lblTheRightAnswer.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblTheRightAnswer.setBounds(18, 140, 276, 79);
		contentPane.add(lblTheRightAnswer);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\team-liquid-logo-AC6053E709-seeklogo.com.gif.jpg"));
		lblNewLabel_1.setBounds(264, 86, 195, 191);
		contentPane.add(lblNewLabel_1);
	}

}
