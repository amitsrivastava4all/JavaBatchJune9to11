class A1{
	int p;
	int z;
	A1(){
		z = 1000;
		System.out.println("A Default Cons Call");
	}
	A1(int x){
		this();
		System.out.println("A Param Cons Call");
	}
	void print(){
		System.out.println("A Print Call...");
	}
}
class B extends A1{
	int t ;
	int z;
	B(){
		super(10);
		this.z = 2000;
		t = 100;
		//super();
		System.out.println("B Default Cons Call");
	}
	B(int z){
		this();
		int n = super.z + this.z + z;
		//z = z  + t;
		//super(100); // Explicit Call
		System.out.println("B Param Cons Call "+n);
	}
	@Override
	void print(){
		super.print();
		System.out.println("B Print Call");
	}
}
public class SuperVsThis {

	public static void main(String[] args) {
		B obj = new B(10);
		obj.print();

	}

}
