import java.util.Date;
import java.util.Scanner;
class Message
{
	private String message;
	private Date date;
	private String userid;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
class User{
	private String userid;
	private String pwd;
	private String userName;
	private int age;
	private String city;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
class View
{
	void login(){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String pwd = scanner.next();
		System.out.println("Enter the UserName");
		String userName = scanner.next();
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the City");
		String city = scanner.next();
		User user = new User();
		user.setAge(age);
		user.setUserName(userName);
		user.setUserid(userid);
		user.setPwd(pwd);
		user.setCity(city);
		DB db = new DB();
		Message message = db.checkLogin(user);
		System.out.println(message.getMessage());
		System.out.println(message.getUserid());
		System.out.println(message.getDate());
		//db.checkLogin(userid,pwd,userName, age, city);
	}
}
class DB
{
	Message checkLogin(User user){
		Date date = null;
		Message message = new Message();
		if(user.getUserid().equals(user.getPwd())){
			message.setMessage("Welcome User");
			
		}
		else
		{
			message.setMessage("Invalid Userid or Password");
			
		}
		message.setDate(new Date());
		message.setUserid(user.getUserid());
		return message;
		
	}
}
public class PassingObjectAndReturnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		view.login();

	}

}
