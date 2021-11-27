package com.kotak.loans.homeloans;

import java.util.Scanner;

public class Multiplication {
	
	
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
        int n = sc.nextInt();
         for(int i=1;i<=10;i++)
         {
        	 System.out.println(n+"*"+i+"="+n*i);
         }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
