interface H1
{
	int X = 10;
void show();	
void print();
}
interface H2
{
	int X = 20;
	void show();
}
interface H3 extends H1, H2{
	
}
class H4 implements H3{

	@Override
	public void show() {
		System.out.println(H1.X + H2.X);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
