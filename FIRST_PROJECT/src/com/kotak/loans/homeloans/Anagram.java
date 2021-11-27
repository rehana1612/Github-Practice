package com.kotak.loans.homeloans;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String str1 = "meat";
		String str2 = "team";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		
		if(str1.length()!=str2.length())
		{
			System.out.println("not a anagram");
		}	
		else
		{
		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(s1,s2)==true)
			System.out.println("both strings are anagrams");
		else
			System.out.println("not a anagram");
	
		}
	
		
	}

}
