class Logic{
	public static void logic(){
	//public void logic(){
		for(int i= 1; i<=5; i++){
			System.out.println("I is "+i +" Name "+Thread.currentThread().getName());
		}
	}
}
class Job2 implements Runnable{
	public void run(){
		for(int i= 1001; i<=1005; i++){
			System.out.println("I:::: is "+i +" Name "+Thread.currentThread().getName());
		}
	}
}
class Job implements Runnable{
	int x;  // Instance Var
	Logic logic = new Logic();
	@Override
	//public synchronized void run(){
	public  void run(){
		System.out.println("I dont Need a Lock..."+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		synchronized(Logic.class){
		//synchronized (logic) {  // Another Class Object
			//logic.logic();
		Logic.logic();
		}
		logic.logic();
		/*synchronized(this){  // Block Level
		for(int i= 1; i<=5; i++,x++){
			System.out.println("X is "+x+"I is "+i +" Name "+Thread.currentThread().getName());
		}
		}*/
		System.out.println("I Also dont Need a Lock..."+Thread.currentThread().getName());
	}
}
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		StringBuilder sb = new StringBuilder();
		synchronized (sb) {
			sb.append("Hello");
		}
		//StringBuffer sb = new StringBuffer();
		
		Job job = new Job();
		Thread worker = new Thread(job,"ram");
		worker.start();  
		worker.join();
		//Job job2 = new Job();
		//Job2 job2 = new Job2();
		Thread worker2 = new Thread(job,"shyam");
		worker2.start();
		
		// Thread can't be start twice
		//worker2.run(); instead of start calling run directly , No Seperate Stack will be created , it is as good as normal function
		worker.stop();
		
		System.out.println("Main Thread Start "+Thread.currentThread().getName());
		for(int j= 1; j<=5; j++){
			System.out.println("J is "+j +" and Name "+Thread.currentThread().getName());
		}
	}

}
