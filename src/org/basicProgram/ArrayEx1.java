package org.basicProgram;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
//		int i[] = new int[3];
//			i[0] =80;
//			i[1]=90;
//			i[2]=100;
//			System.out.println(i[2]);
//			System.out.println(i.toString());
//			System.out.println(i.length);
//			System.out.println(Arrays.toString(i));
//			for(int j=0;j<i.length;j++) {
//				System.out.println(i[j]);
//			}
//			System.out.println("--------------");
//			
//			String str[]=new String[3];
//			str[0]="NIranjan";
//			str[1]="Vitthal";
//			str[2]="Khamkar";
//			for(int k=0;k<str.length;k++) {
//				System.out.println(str[k]);
//			}
		
			int i[]=new int[4];	//declare
			i[0]=10;
			i[1]=20;
			i[2]=30;
			i[3]=40;
			//i[4]=50;
			System.out.println(i.length);
			System.out.println(i.toString());
			System.out.println(i[2]);
			System.out.println(i[1]+i[2]);
			System.out.println(Arrays.toString(i));
			
		//using for loop
			for (int j=0;j<=i.length-1;j++) {
				System.out.println(i[j]);
				if(i[j]==20) {
					System.out.println("hi");
					break;
				}	
			}
			
			int pop[]=new int[5];
			pop[0]=100;
			pop[1]=200;
			pop[2]=300;
			pop[3]=400;
			
			System.out.println(Arrays.toString(pop));
			
			String lg[]=new String[3];
			System.out.println(Arrays.toString(lg));
			
					
			
			
			
			
			
	}
	

}
