package com.bmpl.dave;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstants {
	
	public Player(){
		x = 122;
		w = 189;
		h = 174;
		y = FLOOR - (h-22);
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	public void drawPlayer(Graphics g){
		g.drawImage(img, x, y, w, h, null);
	}
}
