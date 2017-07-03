import java.util.Random;

public class CommonUtils implements GameConstants {
	static Random r = new Random();
	static int getRandomX(){
//		int x =  r.nextInt(GWIDTH);
//		System.out.println("X is "+x);
		return r.nextInt(GWIDTH); 
	}
	static int getRandomY(){
//		int y = r.nextInt(GHEIGHT);
//		System.out.println("Y is "+y);
		return r.nextInt(GHEIGHT);
	}
	static int getSpeed(){
		return r.nextInt(MAX_BALL_SPEED);
	}
	static int getRandomTen(){
		return r.nextInt(10);
	}
	static int getRandom(int range){
		return r.nextInt(range);
	}
	public static void main(String[] args) {
		

	}

}
