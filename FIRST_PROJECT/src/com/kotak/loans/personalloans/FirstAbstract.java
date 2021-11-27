package com.kotak.loans.personalloans;

public abstract class FirstAbstract 
{
	int x=100;
	public void m1()
	{
		System.out.println("i am m1");
	}
	public abstract void m2();
	
	public static void main(String[] args) {
		
		FirstAbstract obj=new ChildClass();
	    obj.m1();
		obj.m2();
		
	}
}
