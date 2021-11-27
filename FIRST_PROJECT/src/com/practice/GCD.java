package com.practice;

public class GCD 
{

	public static void main(String[] args) 
	{
		int number1=6,number2=24;
		int num3=findGCD(number1, number2);
		System.out.println(num3);

	}
	
	private static int findGCD(int number1, int number2)
	{ 
		if(number2 == 0)
		{ 
			return number1; 
		} 
		return findGCD(number2, number1%number2); }

		

}
