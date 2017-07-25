import java.awt.event.ActionListener;

class Timer extends Thread{  //implements Runnable{
	int delay  ;
	ActionListener l;
	Timer(int delay, ActionListener l){
		this.delay = delay;
		this.l = l;
	}
	
	public void run(){
		while(true){
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l.actionPerformed(null);
		}
	}
}
public class MyTimer {
	
	public static void main(String[] args) {
		Timer timer = new Timer(3000,(e)->System.out.println(("MyLogic")));
		timer.start();
		//Thread worker = new Thread(timer);
		//worker.start();
		
		
	}

}
