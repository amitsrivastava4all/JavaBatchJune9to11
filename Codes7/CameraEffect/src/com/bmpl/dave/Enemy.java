package com.bmpl.dave;

import java.awt.Graphics;
import java.awt.Image;

public class Enemy extends Sprite implements GameConstants {
	 boolean isVisible ;
	public Enemy(int x , Image image, int speed){
		this.x = x;
		this.img = image;
		this.y = 30;
		this.speed = speed;
		h = w = 100;
		isVisible = true;
	}
	public void drawEnemy(Graphics g){
		g.drawImage(img, x, y, w, h, null);
		move();
		changeDirection();
	}
	public void move(){
		y +=speed;
	}
	public void changeDirection(){
		if(y>=(FLOOR-h)){
			speed = speed * -1;
		}
		else
		if(y<=0)
		{
			speed = speed * -1;
		}
	}
}
