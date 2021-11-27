package com.kotak.loans.homeloans;

public class StringEx 
{
	public static void main(String[] args) 
	{
		String s1="imrankhan";
		System.out.println(s1.charAt(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.endsWith("na"));
		String s2="rehana";
		System.out.println(s1.concat(s2));
	    String s3="Imrankhan";                     
	    System.out.println(s3.compareToIgnoreCase("reha"));
	    System.out.println(s3.endsWith("khan"));
	    System.out.println(s3.indexOf('r'));
	    System.out.println();
	}

}
