class P1
{
	int x = 100;
	void show(){
		System.out.println("P1 Show...");
	}
}
class C1 extends P1
{
	int x = 200;
	@Override
	void show(){
		System.out.println("C1 Show... "+x);
	}
	void print(){
		
	}
}
public class OverrideMethodVsOverrideVar {

	public static void main(String[] args) {
		P1 obj = new C1();
		obj.show();
		System.out.println(obj.x);
		//obj.print();

	}

}
