package org.basicProgram;

import java.util.ArrayList;

public class ArrayListConcept {
	public static void main(String[] args) {
		//Dynamic Array
		//ArrayList -- Default class of java
		//methods
		//internal implementation of AL(ArrayList)
		//VC(Virtual Capacity),LF(LoadFactor)
		ArrayList ar = new ArrayList();	//empty size 
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		
		ar.add(12.33);
		ar.add("nir");
		ar.add('a');
		System.out.println(ar.size());
		//System.out.println(ar.get(10));		//IOB
		System.out.println(ar);
		
		//numbers in the list
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(100);
		System.out.println(numberList);
		ArrayList<Double> li = new ArrayList<Double>();
		li.add(12.00);
		li.add(10.00);
		System.out.println(li);
		
		ArrayList<Character> ch =new ArrayList<Character>();
		ch.add('b');
			
		ArrayList<String> str = new ArrayList<String>();
		str.add("Niranjan");
		
		ArrayList<Object> obj = new ArrayList<Object>(5);
		obj.add(2);
		obj.add(str);
		obj.add(ch);
		obj.add(li);
		obj.add(ar);
		System.out.println(obj);
		
		
		
		
	}
}
	
	

