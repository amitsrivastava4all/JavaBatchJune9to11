import javax.swing.plaf.synth.SynthSeparatorUI;
// OOAD S O  L  I  D
// S - SRP 
// D - DRY 
// OOPS
// Class and Objects
// Procedural Programming - functions
// class - category (Car, Employee, Student, Customer)


public class OOPSBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ram = new Employee(1001, "rAm kUMar",9999) ;
		ram.setSalary(ram.getSalary() + 2000);
		String result = ram.printReport();
		System.out.println(result);
		//System.out.println(ram.getName()+" "+ram.getSalary());
		//ram.id = -1001;
		//ram.name = "Ram";
		//ram.salary = -9999;
		//ram.takeInput(1001, "Ram",9999);
		//ram.print();
		
		Employee shyam = new Employee(1002,"Shyam",8888);
		//shyam.takeInput(1002, "Shyam", 8888);
		//shyam.print();
		Employee sohan = ram;
//		if(ram==shyam){
//		//if(ram==sohan){
//			System.out.println("Same Ref");
//		}
//		else
//		{
//			System.out.println("Not Same Ref");
//		}
		//int x = 10;
	}

}
