package com.practice;

public class PalindromeWord {

	public static void main(String[] args) {
		String s="madam";
		int n=s.length();
		
		String str="";
		
		for(int i=n-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
	
		if(s.equals(str))
			System.out.println("word is palindrome");
		else
			System.out.println("word is not a palindrome");

}

}
