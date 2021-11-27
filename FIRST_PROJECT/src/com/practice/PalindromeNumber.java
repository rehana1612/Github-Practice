package com.practice;

import java.util.Scanner;

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
		int number,reverse=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		int palindrome=number;
		while(palindrome!=0)
		{
			int remainder=palindrome%10;
			reverse=reverse*10+remainder;
			palindrome=palindrome/10;
		}
		if(number==reverse)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}

	}

}
