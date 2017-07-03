import java.awt.Color;

import javax.swing.JFrame;

public class BallGame extends JFrame implements GameConstants {
	
	public BallGame(){
		setTitle(TITLE);
		setSize(GWIDTH,GHEIGHT);
		setVisible(true);
		//setLocation(100, 100);
		setLocationRelativeTo(null);
		Board board = new Board();
		add(board);
		setResizable(false);
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BallGame obj = new BallGame();

	}

}
