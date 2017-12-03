import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Toolkit;

public class Opening {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opening window = new Opening();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Opening() {
		initialize();
	}
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBackground(Color.WHITE);
		getFrame().setBounds(100, 100, 578, 537);
		getFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\quiz.png"));
		lblNewLabel.setBounds(132, 11, 305, 308);
		getFrame().getContentPane().add(lblNewLabel);
		
		JButton btnStart = new JButton("New game!");
		btnStart.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnStart.setForeground(Color.BLUE);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getFrame().dispose();
				Question1 q = new Question1();
				q.setVisible(true);
				
			}
		});
		btnStart.setBounds(47, 409, 157, 59);
		getFrame().getContentPane().add(btnStart);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		btnExit.setForeground(Color.BLUE);
		btnExit.setBounds(358, 408, 157, 59);
		getFrame().getContentPane().add(btnExit);
		
		JLabel lblDotaQuiz = new JLabel("Dota 2 Quiz Game!");
		lblDotaQuiz.setForeground(Color.RED);
		lblDotaQuiz.setFont(new Font("Sitka Small", Font.PLAIN, 25));
		lblDotaQuiz.setBounds(166, 330, 246, 43);
		frame.getContentPane().add(lblDotaQuiz);
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
