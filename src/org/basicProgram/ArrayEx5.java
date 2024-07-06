package org.basicProgram;

public class ArrayEx5 {
	public static void main(String[] args) {
		int ar[][]=new int[2][2];
		ar[0][0]=1;
		ar[0][1]=2;
		//ar[0][3]=3;
		System.out.println(ar[0][0]);
		
		System.out.println("-------------");
		int ar1[][]= {
				{1,2,3,0},
				{4,5,6,0},
				{7,8,9,0},
				{0,0,0,0}
		};
		//System.out.println(ar1[0][0]);
		
		for(int i=0;i<ar1.length;) {
			for(int j=0;j<ar1[0].length;j++) {
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
			break;
		}
		System.out.println("-------------");
		
		Object empInfo[][] = {
				{"Nira",33,"SDTE1",true},
				{"Arun",32,"SDTE1",false},
				{"Varun",22,"SDTE3",false},
		};
		for(int i=0;i<empInfo.length;i++) {
			for(int j=0;j<empInfo[0].length;j++) {
				System.out.print(empInfo[i][j]+"  ");
			}
			System.out.println();
	
		}

	}
}
	
	

