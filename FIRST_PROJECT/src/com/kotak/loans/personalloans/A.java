package com.kotak.loans.personalloans;


import com.kotak.loans.homeloans.B;

public class A extends B
{
	 public void m1()
	{
		System.out.println("from A" +x);
	}
	public static void main(String[] args) {
		B a=new B();
		a.m1();
		a.m2();
		
	}

}
