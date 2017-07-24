package com.bmpl.dave;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteLoader {
	BufferedImage img;
	public void loadImage(){
		try {
			img = ImageIO.read(SpriteLoader.class.getResource("player1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BufferedImage[] fireAttack(){
		BufferedImage buf [] = new BufferedImage[5];
		buf[0] = img.getSubimage(116, 212, 59, 66);
		buf[1] = img.getSubimage(0, 162, 117, 34);
		buf[2] = img.getSubimage(0, 198, 112, 37);
		buf[3] = img.getSubimage(0, 237, 115, 33);
		buf[4] = img.getSubimage(184, 435, 39, 88);
		return buf;
		
	}
	
	
	public BufferedImage[] standingMoves(){
		BufferedImage buf [] = new BufferedImage[4];
		buf[0] = img.getSubimage(70, 1, 69, 77);
		buf[1] = img.getSubimage(140, 1, 54, 81);
		buf[2] = img.getSubimage(0, 78, 86, 76);
		buf[3] = img.getSubimage(86, 83, 92, 79);
		return buf;
		
	}
	

}
