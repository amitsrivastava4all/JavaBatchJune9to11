package com.bmpl.dave;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstants {
	private boolean isJump ;
	private int acc;
	public Player(){
		x = 122;
		w = 100;
		h = 100;
		y = FLOOR - (h-10);
		
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	public void drawPlayer(Graphics g){
		g.drawImage(img, x, y, w, h, null);
	}
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
