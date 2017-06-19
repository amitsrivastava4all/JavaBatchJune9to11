import java.util.Date;

//IS -A 
/*
 * Code Reuse
 * polymorphism
 * 
 */
class Account
{
	int accountNo;
	double balance;
	String accountHolderName;
	Date opening;
	boolean status;
	
	void openAccount(){
		Date date = new Date();
		System.out.println("Open Account "+date);
	}
	void deposit(){
		System.out.println("Account Deposit..");
	}
	void withDraw(){
		System.out.println("Account Money WithDraw..");
	}
}
class SavingAccount extends Account{
	double minBalance;
	void computeROI(){
		System.out.println("SA ROI is 4%");
	}
	@Override
	void withDraw(){
		System.out.println("WithDraw Limit is 50K");
	}
}
class CurrentAccount extends Account{
	double odLimit;
	@Override
	void deposit(){
		System.out.println("CA Deposit Call..");
	}
	void computeOD(){
		System.out.println("OD Limit is 1Lakh");
	}
}

public class ISAAndHasA {
	//Upcasting
	void caller(Account account){
		account.withDraw();
		account.deposit();
		if(account instanceof SavingAccount){
			SavingAccount sa = (SavingAccount) account ; // Downcasting
			sa.computeROI();
		}
		else
		if(account instanceof CurrentAccount){
			CurrentAccount ca = (CurrentAccount) account;
			ca.computeOD();
		}
		System.out.println("*******************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int ee = 90.20;
		ISAAndHasA obj = new ISAAndHasA();
		obj.caller(new SavingAccount());
		obj.caller(new CurrentAccount());
//		Account account = new SavingAccount();
//		//SavingAccount sa = new SavingAccount();
//	
//		account.withDraw();
//		account.deposit();
//		account.computeROI();
//		
//		System.out.println("******************************");
//		//CurrentAccount ca = new CurrentAccount();
//		account = new CurrentAccount();
//		account.withDraw();
//		account.deposit();
//		account.computeOD();

	}

}
