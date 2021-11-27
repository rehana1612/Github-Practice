package com.kotak.loans.homeloans;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> a=new LinkedList<String>();
		a.add("aaru");
		a.add("afsa");
		a.add("ashu");
		a.add("ayyu");
		a.add("ashu");
        a.addFirst("immu");
        a.addLast("rena");
        System.out.println(a);
        Iterator<String> arr=a.descendingIterator();
        while(arr.hasNext()) {
        	System.out.println(arr.next());
        }
        a.push("reshu");
        a.pop();
        System.out.println(a);;
        
        ListIterator<String> li=a.listIterator();
		/*
		 * while(li.hasNext()) { li.next()="ayyu"; }
		 */

	}

}
