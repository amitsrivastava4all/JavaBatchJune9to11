import java.util.Scanner;

public class InfiniteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp= "";
		Scanner scanner = new Scanner(System.in);
		while(!temp.equals("exit")){
			System.out.println("Enter the Temp Value");
			temp = scanner.next();
		}

	}

}
