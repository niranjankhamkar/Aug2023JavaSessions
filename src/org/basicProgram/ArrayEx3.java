package org.basicProgram;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
	String empNames[] = new String[3];// 0-2
	System.out.println(Arrays.toString(empNames));

	empNames[0] = "Mahesh";
	empNames[1] = "Rahul";
	empNames[2] = "Kiran";

	System.out.println(Arrays.toString(empNames));

	System.out.println(empNames.length);// 3

	// index based loop:
	for (int i = 0; i < empNames.length; i++) {
		System.out.println(empNames[i]);
			if(empNames[i].equals("Rahul")) {
				System.out.println("promote this emp to SDET 2");
				break;
			}
	}

	System.out.println("---------------");

	// for each loop: enhanced for loop:
	for (String e : empNames) {
		System.out.println(e);
		if (e.equals("Rahul")) {
			System.out.println("promote this emp to SDET 2");
			break;
		}
	}
	System.out.println("---------------");
	//with new keyword:
			//when you are not sure about the values
			int i[] = new int[10]; //0-9

			
			//array literals: when you are already having the values
			//int array:
			int num[] = {1,2,3,4,5,6};//0-5
			System.out.println(num[2]);
			System.out.println(num[5]);
			//System.out.println(num[6]);//AIOB
			System.out.println(num.length);
			
			System.out.println(num);
			System.out.println(Arrays.toString(num));
			for(int e : num) {
				System.out.println(e);
			}
			
			String stNames[] = {"Sudheer", "RAvi", "Naveen", "Tom"};
			
			Object empInfo[] = {"Neha", 25, 34.55, true, 'f'};
			
			//
			int number[] = {1,2,3,4,5,6,7,8,9,10};//0-9==>10
			for(int r = number.length-1;  r>=0 ; r--) {
				System.out.println(number[r]);//10
	
	}
}
}
	
	

