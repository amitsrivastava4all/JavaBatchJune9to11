import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tic extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tic frame = new Tic();
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
	public Tic() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 10, 10));
		
		JButton one = new JButton();
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(one);
			}
		});
		contentPane.add(one);
		
		JButton two = new JButton();
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(two);
			}
		});
		contentPane.add(two);
		
		JButton three = new JButton();
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(three);
			}
		});
		contentPane.add(three);
	
		JButton four = new JButton();
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(four);
			}
		});
		contentPane.add(four);
		
		JButton five = new JButton();
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(five);
			}
		});
		contentPane.add(five);
		
		JButton six = new JButton();
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(six);
			}
		});
		contentPane.add(six);
		
		JButton seven = new JButton();
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(seven);
			}
		});
		contentPane.add(seven);
		
		JButton eight = new JButton();
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(eight);
			}
		});
		contentPane.add(eight);
		
		JButton nine = new JButton();
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(nine);
			}
		});
		contentPane.add(nine);
		
		
	}
	
	private boolean isZero = true;
	private void printXorZero(JButton currentButton){
		if(currentButton.getText().trim().length()==0){
		currentButton.setText(isZero?"0":"X");
		isZero = !isZero;
		}
		
	}

}
