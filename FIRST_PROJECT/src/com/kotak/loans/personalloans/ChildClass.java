package com.kotak.loans.personalloans;

public class ChildClass extends FirstAbstract
{

	@Override
	public void m2() {
		System.out.println("i am m2");
		
	}
	public void m1()
	{
		System.out.println("i am m1 from childclass");
	}
	public static void main(String[] args) 
	{
		ChildClass obj1 =new ChildClass();
		obj1.m1();
		obj1.m2();
		FirstAbstract obj=new ChildClass();
		obj.m1();
		obj.m2();
	
	}

}
 