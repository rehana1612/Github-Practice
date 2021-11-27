package com.kotak.loans.personalloans;

public class Icici implements Rbi
{

	@Override
	public void deposit() {
		System.out.println("deposit from icici");
		
	}

	@Override
	public void withdrawl() {
		System.out.println("withdrawl from icici");
		
	}
	
}
