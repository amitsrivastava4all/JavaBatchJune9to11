class X{
	int a,b,c;
}
class XPlus extends X
{
	int d,e;
}
class Parent1{
	protected X show(){
		System.out.println("Parent1 Show");
		X obj = new X();
		return obj;
	}
}
class Child1 extends Parent1
{
	@Override
	 public XPlus show(){
		System.out.println("Child1 Show...");
		XPlus obj = new XPlus();
		return obj;
	}
}
public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
