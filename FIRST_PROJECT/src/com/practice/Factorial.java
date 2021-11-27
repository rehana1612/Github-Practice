package com.practice;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int number=4;
		int fact=factorial(number);
		System.out.println("factorial: "+fact);
	}
	public static int factorial(int number)
	{
		int n=number;
		if(n==0)
			return 1;
		return factorial(n-1)*n;
	}

}
