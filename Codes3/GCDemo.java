class RR
{
	int x,y;
	RR(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Object Born ");
	}
	@Override
	protected void finalize(){
		System.out.println("Object Gone...");
	}
}
public class GCDemo {

	public static void main(String[] args) {
		RR obj = new RR(10,20);
		obj.x ++;
		obj = null;  //1st
		int x = 1000;
		int y = 2000;
		int z = x + y;
		
		System.gc();
		for(int i = 1; i<=10; i++){
			System.out.println(" I Is "+i);
		}
		/*RR obj2 = new RR(10,20);
		RR obj3 = new RR(100,200);
		obj3 = obj2;  //2nd 
		
		if(10>2){
			RR obj4 = new RR(1,2);  //3rd
		}
*/
	}

}
