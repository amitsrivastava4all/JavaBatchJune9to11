
public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if else 
		//boolean x = true;
		String message = "";
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if(a>b){
			message = "A is Greater";
		}
		if(b<a)
		{
			message+=" B is Smaller";
		}
		System.out.println(message);
		System.out.println("Hello Java ");

	}

}
