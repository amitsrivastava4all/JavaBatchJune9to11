package com.tcs.banking.loans.users;

import com.tcs.banking.insurance.LifeInsurance;

public class Customer {
	protected int id;
	protected String name;
	
	public static void main(String[] args) {
		LifeInsurance lf = new LifeInsurance();
		//System.out.println(lf.x);
		lf.printInsuranceDetails();
	}

}
