package com.bmpl.dave;

import java.awt.Graphics;
import java.awt.Image;

public class Enemy extends Sprite implements GameConstants {
	public Enemy(int x , Image image, int speed){
		this.x = x;
		this.img = image;
		this.y = 30;
		this.speed = speed;
		h = w = 200;
	}
	public void drawEnemy(Graphics g){
		g.drawImage(img, x, y, w, h, null);
	}
}
