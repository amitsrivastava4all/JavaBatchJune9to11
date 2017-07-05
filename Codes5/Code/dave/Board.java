package com.bmpl.dave;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
		setFocusable(true);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					player.setSpeed(25);
					player.move();
				}
				
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					//System.out.println("Left...");
					player.setSpeed(-25);
					player.move();
				}
				if(e.getKeyCode() == KeyEvent.VK_UP){
					player.jump();
				}
				
			}
		});
		
		gameLoop();
		
		
	}
	public boolean isCollision(Player player , Enemy enemy){
		int xDistance = Math.abs(player.getX() - enemy.getX());
		int yDistance = Math.abs(player.getY() - enemy.getY());
		return xDistance<=(player.getW()-30) && yDistance<=(player.getH()-20);
	}
	boolean isGameOver = false;
	public void checkCollision(){
		for(Enemy enemy: enemies){
			if(isCollision(player, enemy)){
				isGameOver = true;
				repaint();
				timer.stop();
			}
		}
	}
	
	public void gameOver(Graphics g){
		g.setColor(Color.RED);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("Game Over", GAME_WIDTH/2, GAME_HEIGHT/2);
	}
	
	private void prepareEnemy(){
		Image enemy;
		int speed = 0;
		int x = 350;
		for(int  i= 0; i<MAX_ENEMY; i++){
			if(i%2==0){
				enemy = new ImageIcon(Board.class.getResource("spider.gif")).getImage();
				
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
			
			player.fall();
			checkCollision();
		});
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
			super.paintComponent(g);
			drawBackGround(g);
			if(isGameOver){
				gameOver(g);
			}
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
