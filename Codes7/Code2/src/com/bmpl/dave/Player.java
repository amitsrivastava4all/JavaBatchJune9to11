package com.bmpl.dave;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstants,PlayerState {
	ArrayList<Bullet> bulletList = new ArrayList<>();
	private boolean isJump ;
	private int acc;
	SpriteLoader sl = new SpriteLoader();
	BufferedImage moves[];
	BufferedImage fireAttack[];
	int currentState ;
	
	public void drawPlayer(Graphics g){
		if(currentState==PlayerState.MOVE){
			drawStandingMoves(g);
			}
			else
			if(currentState == PlayerState.FIRE_ATTACK){
				drawFireAttack(g);
			}
	}
	
	public Player(){
		currentState = PlayerState.MOVE;
		sl.loadImage();
		 moves  = sl.standingMoves();
		 fireAttack = sl.fireAttack();
		x = 122;
		w = 100;
		h = 100;
		y = FLOOR - (h-10);
		
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	public void setFireAttack(){
		currentState = FIRE_ATTACK;
		moveCount =0;
		fireCount = 0;
	}
	int fireCount;
	public void drawFireAttack(Graphics g){
		speed = 10;
		g.drawImage(fireAttack[fireCount], x, y, w, h, null);
		fireCount++;
		move();
		if(fireCount>4){
			fireCount=0;
			speed = 0;
			currentState = MOVE;
		}
	}
	
	int moveCount;
	public void drawStandingMoves(Graphics g){
		currentState = PlayerState.MOVE;
		fireCount = 0;
		g.drawImage(moves[moveCount], x, y, w, h, null);
		moveCount++;
		if(moveCount>3){
			moveCount=0;
		}
	}
	
	public void fire(){
		Bullet bullet = new Bullet(x + w/2, y + h /2);
		bulletList.add(bullet);
	}
	
//	public void drawPlayer(Graphics g){
//		g.drawImage(img, x, y, w, h, null);
//	}
	public void move(){
		x += speed;
	}
	
	public void jump(){
		if(!isJump){
		acc = -20;
		 y = y + acc;
		isJump = true;
		}
	}
	public void fall(){
		if(y<(FLOOR - (h-22))){
			acc = acc + GRAVITY;
			y = y + acc;
		}
		if(y>=(FLOOR - (h-22))){
			isJump = false;
		}
	}
}
