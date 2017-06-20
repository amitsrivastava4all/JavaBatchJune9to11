
class GrandFather 
{
	int x = 100;
}
class Father extends GrandFather
{
	int x = 200;
}
class Son extends Father {
	int x = 300;
	Son(int x){
		int z = ((GrandFather)this).x + super.x + this.x + x;
		System.out.println(z);
	}
}

public class MultiLevelHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son  = new Son(1);
	}

}
