import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeReport {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the EmpId ");
		int id = scanner.nextInt();
		System.out.println("Enter the Emp Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		String names[] = name.split(" "); // e.g RAM kUmAR sHarMA
		// names[0] - RAM  names[1] - kUmAR  names[2] - sHarMA
		String properName = "";
		for(String n : names){
		properName += String.valueOf(n.charAt(0)).toUpperCase()
				+ n.substring(1).toLowerCase()+" ";
		}
		/*char e = name.charAt(0);
		String firstChar = String.valueOf(e);
		firstChar = firstChar.toUpperCase();
		name = firstChar + name.substring(1).toLowerCase();*/
		System.out.println("Name is "+properName);
		System.out.println("Enter the Basic Salary");
		double salary = scanner.nextDouble();
		System.out.println(salary);
		Locale locale = new Locale("fr","FR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedSalary = nf.format(salary);
		System.out.println(formattedSalary);
		Date date = new Date();
		System.out.println(date);
		DateFormat df = 
				DateFormat.
				getDateInstance(DateFormat.FULL, locale);
		String formattedDate = df.format(date);
		System.out.println(formattedDate);

	}

}
