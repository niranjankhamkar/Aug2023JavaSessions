package org.basicProgram;

import java.util.Arrays;

public class ArrayEx4 {
	public static void main(String[] args) {
		int i[]=new int[4];
		i[0]=12;
		i[1]=13;
		i[2]=14;
		i[3]=15;
		System.out.println(i[1]);
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
			
		}
		System.out.println("*-------*");
		for(int e:i) {
			System.out.println(e);
		}

	}
}
	
	

