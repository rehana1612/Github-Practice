package com.practice;

public class ArmStrongNumber 
{

	public static void main(String[] args)
	{
		int number=370,total=0,remainder;
		int n=number;
		while(n!=0)
		{
			remainder=n%10;
			total=total+remainder*remainder*remainder;
			n=n/10;
		}
		if(total==number) 
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}

	}

}
