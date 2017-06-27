/*
 * static variable
 * static block
 * static method - utility class
 * static method - Utility interface
 * import static
 */
import static java.lang.System.out;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

//final class MathOperations{
interface MathOperations{
	//private MathOperations(){}
	static void fact(int num){
		
	}
	static void sqrt(int num){
		
	}
}


class Customer
{
	static int counter;   // Class Variable
	int id;  // Instance Variable
	String name;
	double balance;
	static
	{
		counter = 1000;
		System.out.println("I Will Call Only ONce when Class is Loaded.."+counter);
	}
	Customer ( String name, double balance){
		counter++;
		this.id = counter;
		this.name = name;
		this.balance = balance;
		System.out.println("I Will Call When U Create an Object....");
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		//MathOperations m = new MathOperations();
		//Math m = new Math();
		out.println(abs(-99));
		out.println(pow(2, 3));
		MathOperations.fact(5);
		MathOperations.sqrt(2);
		// TODO Auto-generated method stub
		Customer ram = new Customer("Ram",9999);
		out.println(ram.id);
		Customer shyam =new Customer("Shyam",7777);
		out.println(shyam.id);
		out.println(ram.id);

	}

}
