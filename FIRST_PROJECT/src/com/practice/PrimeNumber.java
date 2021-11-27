package com.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=20;
		int count;
		for(int i=1;i<=n;i++)
		{
			count=0;
			for(int j=2;j<n/2;j++) 
			{
				if(i%j==0 &&i!=j)
				{
					//System.out.println(i%j);
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(i);
		}

	}

}
