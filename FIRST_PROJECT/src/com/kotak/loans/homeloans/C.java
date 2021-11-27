package com.kotak.loans.homeloans;

import com.kotak.loans.personalloans.A;

public class C extends A
{
	public void m1()
	{
		
		System.out.println(" m1 from c");
	}
	static {
		System.out.println("static block");
	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
	
	void m3()
	{
		System.out.println("from c"+ x);
	}
	
public static void main(String[] args) {
	A a=new A();
	a.m1();
	B b=new B();
	b.m1();
	C c=new C();
	c.m1();
	c.m2();
	c.m3();
	
}
}
