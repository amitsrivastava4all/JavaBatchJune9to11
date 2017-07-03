import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	//Ball ball = new Ball(10,100);
	Ball balls [] = new Ball[MAX_BALL];
	
	
	public void prepareBalls(){
		for(int i = 0 ; i<MAX_BALL; i++){
			balls[i] = new Ball(CommonUtils.getRandomX(),CommonUtils.getRandomY());
		}
	}
	
	
	public Board(){
		prepareBalls();
		setSize(GWIDTH,GHEIGHT);
		setBackground(Color.BLACK);
		setFocusable(true);
		gameLoop();
	}
	Timer timer;
	private void gameLoop(){
//		timer = new Timer(GAME_SPEED,new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent e){
//				repaint();
//				moveBall();
//			}
//		});
		
		timer = new Timer(GAME_SPEED, (e)->{
		repaint();
		
		});
		timer.start();
		//repaint call paintComponent
	}
	
	private void displayBalls(Graphics g){
		for(Ball ball : balls){
			ball.moveBall();
			ball.drawBall(g);
		}
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		displayBalls(g);
		
	}
	
	

}
