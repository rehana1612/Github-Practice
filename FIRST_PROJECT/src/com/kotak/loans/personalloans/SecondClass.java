package com.kotak.loans.personalloans;

public class SecondClass {
	
	int x=10,y=40, result;
	
	void add()
	{
		result = x+y;
		System.out.println("result for addition is " +(x+y));

	}
	void sub()
	{
		result =x-y;
		System.out.println("result for substraction is " );
	}
	
	public static void main(String[] args) {
		SecondClass obj= new SecondClass();
		obj.add();
		obj.sub();
	}

}
