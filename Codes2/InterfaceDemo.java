import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface IPlayer{  // abstract interface IPlayer
	void jump(); //public abstract void jump();
	void run();
	int MAX_SPEED = 100;
	int DEFAULT_SPEED = 10;
	void walk();
	void attack();
	int DEFAULT_JUMP = 10;
	int MAX_JUMP = 100; //public static final int MAX_JUMP = 100;
	void dead();
	void entry();
}
interface IStarPlayer{
	void hide();
	void show();
}
abstract class CommonPlayer implements IPlayer{
	@Override
	public void entry(){
		System.out.println("Common Entry for All Players");
	}
	@Override
	public void dead(){
		System.out.println("Common Way Dead Logic...");
	}
}
class YellowPlayer extends CommonPlayer implements IPlayer{
	int currentJump = DEFAULT_JUMP;
	@Override
	public void jump(){
		if(currentJump<MAX_JUMP){
			currentJump+=2;
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
}
class RedPlayer extends CommonPlayer implements IPlayer, IStarPlayer{
	int currentJump = DEFAULT_JUMP;
	@Override
	public void jump(){
		if(currentJump<MAX_JUMP){
			currentJump+=10;
		}
		System.out.println("Red Player Jump High");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WindowListener l ;
		//WindowAdapter w;
		

	}

}
