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

public class Question1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question1 frame = new Question1();
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
	public Question1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question 1:");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuestion.setForeground(Color.BLUE);
		lblQuestion.setBounds(10, 11, 126, 35);
		contentPane.add(lblQuestion);
		
		JLabel lblNewLabel = new JLabel("Who win The International 2017?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBounds(37, 44, 307, 37);
		contentPane.add(lblNewLabel);
		
		// answer buttons
		JButton btnNewButton = new JButton("Newbee");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wrong1 w = new Wrong1();
				w.setVisible(true);
				dispose();
			
			}
		});
		btnNewButton.setBounds(77, 105, 111, 60);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("EG");
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wrong1 w = new Wrong1();
				w.setVisible(true);
				dispose();
			}
		});
		button.setBounds(282, 105, 111, 60);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Liquid");
		button_1.setForeground(Color.BLUE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Right1 r = new Right1();
				r.setVisible(true);
				dispose();
			}
			
		});
		button_1.setBounds(77, 191, 111, 60);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Navie");
		button_2.setForeground(Color.BLUE);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Wrong1 w = new Wrong1();
				w.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(282, 191, 111, 60);
		contentPane.add(button_2);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
			;
		});
		btnExit.setBounds(191, 289, 89, 23);
		contentPane.add(btnExit);
		
		
	}
}

/*		
// wrong answer buttons
JButton btnNewButton = new JButton("Newbee");
btnNewButton.addActionListener(new Action()) ;	
btnNewButton.setBounds(77, 105, 111, 60);
contentPane.add(btnNewButton);


JButton button = new JButton("EG");
button.addActionListener(new Action());
button.setBounds(249, 105, 111, 60);
contentPane.add(button);


JButton button_2 = new JButton("Navie");
button_2.addActionListener(new Action());
button_2.setBounds(249, 191, 111, 60);
contentPane.add(button_2);

// right answer button
JButton button_1 = new JButton("Liquid");
button_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Right1 r = new Right1();
		r.setVisible(true);
		dispose();
	}	
});
button_1.setBounds(77, 191, 111, 60);
contentPane.add(button_1);


// Other buttons
JButton btnExit = new JButton("Exit");
btnExit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	System.exit(0);
	}
	;
});
btnExit.setBounds(162, 290, 89, 23);
contentPane.add(btnExit);}
}

class Action implements ActionListener{
public void actionPerformed(ActionEvent e) {
Wrong1 w = new Wrong1();
w.setVisible(true);	

}

}

*/
