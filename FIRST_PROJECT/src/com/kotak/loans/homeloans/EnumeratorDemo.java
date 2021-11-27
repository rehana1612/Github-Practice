package com.kotak.loans.homeloans;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())
		{
			int n=e.nextElement();
			System.out.println(n);
		}
		
		

	}

}
