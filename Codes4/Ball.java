import java.awt.Color;
import java.awt.Graphics;

public class Ball implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	private Color color;
	private int xSpeed;
	private int ySpeed;
	private final int FIX_SPEED;
	private  int xFixSpeed;
	private int yFixSpeed;
	public Ball(int x, int y){
		this.x = x;
		this.y = y;
		this.h = this.w = 50;
		//this.color = Color.RED;
		FIX_SPEED = 10;
		//ySpeed = xSpeed = FIX_SPEED;
		xFixSpeed = CommonUtils.getSpeed();
		xFixSpeed = xFixSpeed==0?1:xFixSpeed;
		yFixSpeed= CommonUtils.getSpeed();
		yFixSpeed = yFixSpeed==0?1:yFixSpeed;
		ySpeed = yFixSpeed;
		xSpeed = xFixSpeed;
		//this.color = getColor(CommonUtils.getRandomTen());
		this.color = new Color(CommonUtils.getRandom(255), CommonUtils.getRandom(255), CommonUtils.getRandom(255));
	}
	
	public void drawBall(Graphics g){
		this.color = new Color(CommonUtils.getRandom(255), CommonUtils.getRandom(255), CommonUtils.getRandom(255));
		g.setColor(this.color);
		
		g.fillOval(x, y, w, h);
	}
	
	public void moveBall(){
		x = x + xSpeed;
		y = y + ySpeed;
		ballDirection();
	}
	
	public void ballDirection(){
		if(x>=(GWIDTH-50))
		{
			xSpeed = -xFixSpeed;
		}
		else
		if(x<=0){	
			xSpeed = xFixSpeed;
		}
		if(y>=(GHEIGHT-50)){
			ySpeed=-yFixSpeed;
		}
		else
		if(y<=0){	
			ySpeed = yFixSpeed;
		}
	}
	
	private Color getColor(int colorNo){
		if(colorNo == 0){
			return Color.RED;
		}
		if(colorNo == 1){
			return Color.YELLOW;
		}
		if(colorNo == 2){
			return Color.ORANGE;
		}
		if(colorNo == 3){
			return Color.GREEN;
		}
		if(colorNo == 4){
			return Color.RED;
		}
		if(colorNo == 5){
			return Color.CYAN;
		}
		if(colorNo == 6){
			return Color.BLUE;
		}
		if(colorNo == 7){
			return Color.MAGENTA;
		}
		if(colorNo == 8){
			return Color.MAGENTA;
		}
		if(colorNo == 9){
			return Color.PINK;
		}
		if(colorNo == 10){
			return Color.DARK_GRAY;
		}
		return Color.WHITE;
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	

}
