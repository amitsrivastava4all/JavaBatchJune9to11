import java.io.IOException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scanner.next();
		//String name = scanner.nextLine();
		System.out.println("Name is "+name);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Age is "+age);
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Salary "+salary);
		scanner.close();
		//int charRead= System.in.read();
		//System.out.println((char)charRead);
	}

}
