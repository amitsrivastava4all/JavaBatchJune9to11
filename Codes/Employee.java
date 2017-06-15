/**
 * this Employee class represent an Employee
 * It has employee characters/features
 * the print method is used to print the details about employee
 * the take input method is used to take the value from the end user
 * @author amit
 * @since 14th June 2017
 * @version 1.0
 * 
 *
 */
// Encapsulation = Binding of Member Variable and Member Methods 
// into Single Unit, e.g class
// Gud Encapsulation = Data Hiding + public methods
// POJO 
public class Employee{
	private int id ;  // Member Variables of a class
	private String name;
	private double salary;
	/**
	 * this represent email field to take emp email address 
	 */
	private String email;
	private String phone;
	private String deptNo;
	private String deptName;
	private String managerName;
	private String city;
	private String designation;
	private String branch;
	
	/*
	 * Constructor - I will call when u create object of a class
	 * I am a Default Constructor , so every class by default has
	 * default constructor
	 * Constructor name is same as class name
	 * Constructor doesn't return anything
	 * If u create any param constructor so by default the default
	 * construtor is kill
	 */
	
	public String getBranchFromDB(){
		return "Delhi";
	}
	
	public Employee(){
		branch = getBranchFromDB();
		
	}
	public Employee(int id , String name , double salary){
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// Setter and Getter
	
	
	
	
	/**
	 * this method take id for emp id and name and salary
	 * @param id
	 * @param name
	 * @param salary
	 */
	public void takeInput(int id , String name , double salary){
		if(id>0 && salary>0){
		this.id = id;
		
		this.name = name;
		this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Id or Salary So Can't Accept the Value of "+name);
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	public int getId() {
		return id;
	}
	
	public double getHRA(){
		return salary * 0.30;
	}
	
	public double getTA(){
		return salary *.20;
	}
	
	public double getNetSalary(){
		return salary + getHRA() + getTA();
	}

	public String printReport(){
		CommonUtil cu = new CommonUtil();
		return " Id "+id+"\n"+" Name "+cu.getProperName(name)+"\n Salary  "+salary+"\n Net Salary "+getNetSalary();
	}
}