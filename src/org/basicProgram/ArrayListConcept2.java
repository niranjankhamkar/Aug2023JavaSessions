package org.basicProgram;

import java.util.ArrayList;

public class ArrayListConcept2 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);
		
		//System.out.println(numList);
		
		//iterate the ArrayList AL : using for loop:
		for(int i=0;i<numList.size();i++) {
			System.out.println(numList.get(i));
			//break;
		}
		System.out.println("-------------");
		for(Integer e : numList) {
			System.out.println(e);
		}
		System.out.println("-------------");
		
		ArrayList<String> empName = new ArrayList<String>();
		empName.add("Niranjan");
		empName.add("Shweta");
		empName.add("Ansh");
		empName.add("khamkar");
		empName.add(null);
		empName.add(null);
		
		System.out.println(empName);
		
		for(int i=0;i<empName.size();i++) {
			System.out.println(empName.get(i));
		}
		System.out.println("-------------");
		for(String e : empName) {
			System.out.println(e);
		}
		System.out.println("-------------");
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Nir");
		studentList.add("Shw");
		studentList.add("Ans");
		studentList.add("Kham");
		
		studentList.add(2, "Naveen");
		
		System.out.println(studentList.get(4));
		
		System.out.println("-------------");
		System.out.println(studentList);
		
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
		
		
		
		
		
		
		
	}
}
	
	

