package com.kotak.loans.homeloans;

public class DivideString {

	public static void main(String[] args) {
		String str="aaaabbbbcccc";
		int len=str.length();
		int n=3;
		int temp=0, chars=len/n;
		String[] equalstr=new String[n];
		
		/*
		 * String str3="rehana"; String str4=str3.substring(0, 2);
		 * System.out.println(str4);
		 */
		
		if(len%n!=0) {
			System.out.println("cannot divide");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				String part=str.substring(i, i+chars);
				equalstr[temp]=part;
				temp++;
			}
			System.out.println("equal strings are");
			for(int i=0; i<temp;i++) {
				System.out.println(equalstr[i]);
			}
		}
	}

}
