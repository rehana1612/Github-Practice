package com.practice;

public class WordsCount {

	public static void main(String[] args) 
	{
		String s="this is my book  english ";
		int n=s.length();
		
		int count=1;
		for(int i=0;i<n-1;i++) 
		{
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
