@FunctionalInterface
interface Calc{
	int compute(int x, int y);
	
}
class MyCalc implements Calc
{
	@Override
	public int compute(int x, int y){
		return x + y;
	}
}
public class InterfaceUseWays {
	void caller(){
		MyCalc obj2 = new MyCalc();
		int result = obj2.compute(10, 200);
		System.out.println("result is "+result);
	}
	public static void main(String[] args) {
		//Calc obj = new MyCalc();
		//MyCalc obj = new MyCalc();
		//System.out.println(obj.compute(10,20));
		int stage = 3;
		if(stage == 3){
		Calc calc = new Calc(){  //class _______ implements Calc
			@Override
			public int compute(int x , int y){
				//int z = this.add(10, 20);
				//System.out.println("Z is "+z);
				return x * y;
			}
			/*int add(int x, int y){
				return x + y;
			}*/
		};
		System.out.println(calc.compute(100, 200));
		// Lambda Expression (Java 8 )
		//Calc c = (a,b)->a*b;
		Calc c = (a,b)->{
			System.out.println("A is "+a+" and B is "+b);
			int d = a * b;
			return d;
		};
		System.out.println(c.compute(1000, 2000));
		
		
		//System.out.println(calc.add(100,200));
		}
		

	}

}
