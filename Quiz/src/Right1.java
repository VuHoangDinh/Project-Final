import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Right1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Right1 frame = new Right1();
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
	public Right1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCongratulationsYourAnswered = new JLabel("Congratulations! Your answered correctly!");
		lblCongratulationsYourAnswered.setForeground(Color.BLUE);
		lblCongratulationsYourAnswered.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCongratulationsYourAnswered.setBounds(0, 41, 434, 44);
		contentPane.add(lblCongratulationsYourAnswered);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(Color.RED);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Opening window = new Opening();
				window.getFrame().setVisible(true);
				dispose();
			}
		});
		btnHome.setBounds(83, 110, 89, 23);
		contentPane.add(btnHome);
		
		JButton btnNextQuestion = new JButton("Next question!");
		btnNextQuestion.setForeground(Color.RED);
		btnNextQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question2 q = new Question2();
				q.setVisible(true);
				dispose();
			}
		});
		btnNextQuestion.setBounds(243, 110, 103, 23);
		contentPane.add(btnNextQuestion);
	}

}
