package com.Abstract;

public class Account implements Bankinterface {

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("1200 cedited");
		
	}
	
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("200 debited");
	}
	public void loan() {
		System.out.println("10000 amount is due on your loan account");
	}
		
		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Account a1=new Account();
		a1.credit();
		a1.debit();
		a1.loan();

		
		
		
	}

}
