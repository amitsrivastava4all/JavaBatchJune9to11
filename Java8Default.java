interface K1
{
	void show();
	default void print(){
		System.out.println("K1 Print Call....");
	}
}
interface K2
{
	default void print(){
		System.out.println("K2 Print Call....");
	}
}
interface K3 extends K1, K2{
	@Override
	default void print(){
		K1.super.print();
		K2.super.print();
		System.out.println("K3 Print....");
	}
}
class KK implements K3
{
	public void show(){
		System.out.println("KK Show...");
	}
}
public class Java8Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KK obj = new KK();
		obj.print();
	}

}
