package com.blackbook.learning;

import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("Apple");
		ar1.add("Orange");
		ar1.add("Mango");
		ar1.add("Grapes");
		
		System.out.println("Contents:"+ar1);
		ar1.add(4, "Cashew");
		System.out.println("Contents :"+ar1);
		System.out.println("Removed :"+ar1.remove(4));
		System.out.println("Remove :"+ar1.remove("Apple"));
		System.out.println(ar1.contains("Mango"));
		System.out.println(ar1.get(0));
		System.out.println(ar1.size());
		System.out.println(ar1.add(null));
		System.out.println(ar1.size());
		System.out.println(ar1.get(3));
		ar1.clear();
		System.out.println(ar1);
	}

}
