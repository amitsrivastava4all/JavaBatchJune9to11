import javax.swing.plaf.synth.SynthSeparatorUI;
// OOAD S O  L  I  D
// S - SRP 
// D - DRY 
// OOPS
// Class and Objects
// Procedural Programming - functions
// class - category (Car, Employee, Student, Customer)
class Employee{
	int id ;  // Member Variables of a class
	String name;
	double salary;
	
	void takeInput(int id , String name , double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void print(){
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		
	}
}

public class OOPSBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ram = new Employee() ;
		
		ram.takeInput(1001, "Ram",9999);
		ram.print();
		
		Employee shyam = new Employee();
		shyam.takeInput(1002, "Shyam", 8888);
		shyam.print();
		Employee sohan = ram;
		if(ram==shyam){
		//if(ram==sohan){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		//int x = 10;
	}

}
