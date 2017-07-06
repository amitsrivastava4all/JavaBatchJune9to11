package com.bmpl.dave;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstants {
	ArrayList<Bullet> bulletList = new ArrayList<>();
	private boolean isJump ;
	private int acc;
	public Player(){
		x = 122;
		w = 100;
		h = 100;
		y = FLOOR - (h-10);
		
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	
	public void fire(){
		Bullet bullet = new Bullet(x + w/2, y + h /2);
		bulletList.add(bullet);
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
