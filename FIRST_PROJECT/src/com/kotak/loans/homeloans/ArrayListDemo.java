package com.kotak.loans.homeloans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("java");
		a.add("c");
		a.add("c++");
		a.add("python");
		System.out.println(a);
		
		a.add(2, "c#");
		System.out.println(a);
		
		System.out.println(a.contains("c"));
		System.out.println(a.get(3));
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("c++"));
		
		ArrayList<String> arr1=(ArrayList<String>)a.clone();
		System.out.println(arr1);	
		
		List<String> i=new ArrayList<String>();
		i.add("class");
		i.add("object");
		i.add("method");
		a.addAll(i);
		System.out.println(a);
		System.out.println(i);
		//i.clear();
		//System.out.println(i);
		System.out.println(a.containsAll(i));
		
		String[] str=new String[a.size()];
		a.toArray(str);
		for(String str1: str)
		{
			System.out.println(str1);
		}
		
		System.out.println(a);
		List<String> arr2=new ArrayList<String>();
        arr2= a.subList(2, 7);
        System.out.println(arr2);
        
        Collections.reverse(a);
        System.out.println(a);
        
        Collections.shuffle(a);
        System.out.println(a);
        
        Collections.shuffle(a);
        System.out.println(a);
        
	}

}
