package org.basicProgram;

import java.util.ArrayList;

public class ArrayListConcept3 {
	public static void main(String[] args) {
		System.out.println("****Program Start*******");
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		System.out.println(ar);
		ar.add(1, null);
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar);
		System.out.println(ar.get(4));
		System.out.println(ar.contains(100));
		System.out.println(ar.indexOf(300));
		System.out.println(ar.isEmpty());
		
		if(!ar.isEmpty()) {
			System.out.println("ar has value");
		}else {
			System.out.println("ar has no value");
		}
		
		System.out.println("****Program Ends*******");
	}
}
	
	

