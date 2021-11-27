package com.kotak.loans.homeloans;

import java.util.Scanner;

public class UserDefinedException extends Exception{
	

	public UserDefinedException(String string) {
		super(string);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 5 character string ");
		String s=sc.next();
			
		try {
			if(s.length()!=5) {
				throw new UserDefinedException("enter 5 character string....");
			}
			else {
				System.out.println("string is "+s);
			}
		} catch (UserDefinedException e) {
			
			e.printStackTrace();
		}

	}

}
