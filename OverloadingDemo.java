import java.util.LinkedList;

/*
 * No of Arguments Can be Change
 * Type of Arguments Can be Change
 * Order Of Arguments Can be Change
 */

class TypePromotion{
	void show(byte x){
		System.out.println("Byte ...");
	}
//	void show(int x){
//		System.out.println("int ...");
//	}
//	void show(float x){
//		System.out.println("float ...");
//	}
//	void show(double x){
//		System.out.println("double ...");
//	}
//	void show(long x){
//		System.out.println("long ...");
//	}
	void show(short x){
		System.out.println("short ...");
	}
//	void show(Integer x){
//		System.out.println("Integer ...");
//	}
	void show(int ...x){
		int sum = 0;
		for(int i : x){
			sum = sum + i;
		}
		System.out.println(sum);
		//System.out.println("int var args ...");
	}
//	void show(long ...x){
//		System.out.println("long var args..");
//	}
}

class OnlineShop
{
	public int search(double price){
		return 0;
	}
	protected double search(String brand){
		return 0.0;
	}
	private String search(String brand, double price){
		return "";
	}
	public void search(double price, String brand){
		
	}
}
class ChildShop extends OnlineShop
{
	public void search(double price, String brand, String feedBack){
		
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int pp = 130;  // Value Variable 
//		int vv  = pp;
//		byte j = (byte)pp;
//		System.out.println(j);
//		long t = pp;
//		Integer bb = new Integer(99); // Ref Variable
//		byte d = bb.byteValue(); //xxxValue
//		double rr = bb.doubleValue();
//		LinkedList<Integer> l = new LinkedList<>();
//		l.add(bb);
//		l.add(1000);
//		l.add(pp);
//		l.add(l.get(0)+1);
//		//Integer y1 = (Integer)l.get(0);
//		//int y2 = y1.intValue();
//		//y2++;
//		//y1 = new Integer(y2);
//		Integer cc = 100;  // Boxing
//		Integer y = new Integer(pp);  // Old Style of Boxing
//		int y11 = y.intValue();  // Old Style UnBoxing
//		Integer v1 = pp;  // Boxing
//		int v2 = v1;  // UnBoxing
//		System.out.println(bb.compareTo(cc));
		TypePromotion obj = new TypePromotion();
		obj.show();
		obj.show(10);
		obj.show(10,20);
		obj.show(10,20,30);
		//obj.show(10.20F);
		//obj.show(100L);
		//obj.show((byte)1);

	}

}
