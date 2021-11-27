package com.kotak.loans.personalloans;

public interface Rbi {
	void deposit();
	void withdrawl() ;
	

	public static void main(String[] args) {
		Rbi i;
	 i=new Icici();
		i.deposit();
		i.withdrawl();
		
	}
}
