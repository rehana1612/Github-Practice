package com.kotak.loans.homeloans;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		int nr,dr,result;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter the numerator");
	       nr=sc.nextInt();
	       System.out.println("enter the denominator");
	       dr=sc.nextInt();
	        try{
	        	result=nr/dr;
	        	System.out.println("result is "+result);
	        }
	        catch(NullPointerException e) {
	        	e.printStackTrace();
	        }
	        catch(ArithmeticException e) {
	        	e.printStackTrace();
	        }
	        
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	       

	}

}
