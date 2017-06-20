// S O L I D
// S - SRP
// D - DRY
// O - Open Close 
// Class is Open for Extension and Close for Modification 
//final class Parent
class Parent
{
	private int x;
	private final void show(){
		System.out.println("Show....");
	}
}
class Child extends Parent
{
//	@Override
	void show(){
		System.out.println("My Show...");
	}
}
public class FinalUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi2=3.14;
		pi2=90;
		int x = 0;
		final double PI = 3.14; 
		final int WIDTH = 1500;
		if(x<WIDTH){
			x++;
		}
		
		//PI++;
	}

}
