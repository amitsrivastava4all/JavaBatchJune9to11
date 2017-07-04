package com.bmpl.dave;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
	Image bg;
	Player player ;
	Enemy enemies[] = new Enemy[MAX_ENEMY];
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		bg = new ImageIcon(Board.class.getResource(BACKGROUND)).getImage();
		player = new Player();
		prepareEnemy();
		gameLoop();
		
	}
	
	private void prepareEnemy(){
		Image enemy;
		int speed = 0;
		int x = 350;
		for(int  i= 0; i<MAX_ENEMY; i++){
			if(i%2==0){
				enemy = new ImageIcon(Board.class.getResource("spider.png")).getImage();
				
			}
			else
			{
					enemy = new ImageIcon(Board.class.getResource("fire.gif")).getImage();
				
			}
			speed = speed + 5;
			enemies[i] = new Enemy(x, enemy, speed);
			x += 350;
		}
	}
	
	Timer timer;
	private void gameLoop(){
		timer  = new Timer(DELAY,(e)->{
			repaint();
		});
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
			super.paintComponent(g);
			drawBackGround(g);
			player.drawPlayer(g);
			drawEnemy(g);
	}
	
	private void drawBackGround(Graphics g){
		g.drawImage(bg, 0, 0, GAME_WIDTH, GAME_HEIGHT, null);
	}
	
	private void drawEnemy(Graphics g){
		for(Enemy enemy : enemies){
			enemy.drawEnemy(g);
		}
	}
}
