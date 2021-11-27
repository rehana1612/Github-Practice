package com.practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		System.out.println("enter the number upto which u want fibonacci series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			System.out.print(fibonacci(i)+" ");
			
		}
		

	}
	public static int fibonacci(int num)
	{
		if(num==1 || num==2)
			return 1;
		return fibonacci(num-1)+fibonacci(num-2);
	}

}
