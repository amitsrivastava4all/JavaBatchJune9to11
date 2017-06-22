abstract class Loan
{
	void applyForLoan(){
		System.out.println("Apply For Loan Form");
	}
	abstract void emi();
	
}
class HomeLoan extends Loan
{
	@Override
	void emi(){
		System.out.println("HomeLoan EMI ");
	}
}
class AutoLoan extends Loan{
	@Override
	void emi(){
		System.out.println("Auto Loan EMI");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeLoan loan = new HomeLoan();
		AutoLoan loan1 = new AutoLoan();
		

	}

}
