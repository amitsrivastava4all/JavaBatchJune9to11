import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	
	public Board(){
		setSize(GWIDTH,GHEIGHT);
		setBackground(Color.CYAN);
		setFocusable(true);
		gameLoop();
	}
	Timer timer;
	private void gameLoop(){
		
		timer = new Timer(GAME_SPEED, (e)->{
		repaint();
		moveBall();
		});
		timer.start();
		//repaint call paintComponent
	}
	int x = 10;
	int speed = 10;
	int ySpeed = 10;
	int y = 100;
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		//g.fillRect(100, 100, 150, 150);
		g.fillOval(x, y, 50, 50);
		
	}
	
	private void moveBall(){
		x = x + speed;
		y = y + ySpeed;
		ballDirection();
	}
	
	private void ballDirection(){
		if(x>=(GWIDTH-50))
		{
			speed = -10;
		}
		else
		if(x<=0){	
			speed = 10;
		}
		if(y>=(GHEIGHT-50)){
			ySpeed=-10;
		}
		else
		if(y<=0){	
			ySpeed = 10;
		}
	}

}
