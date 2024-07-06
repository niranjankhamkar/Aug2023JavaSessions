package org.basicProgram;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
//		byte bz[] = new byte[3];  //length=3,index 0-1-2
//		short sh[] = new short[4]; //lenght=4, index 0-1-2-3
//		boolean bh[] = new boolean[5];
//		double d[]=new double[3];	//length=3,index 0-1-2
//		
//		float marks[] = new float[3]; //length=3;index 0-1-2
//		marks[0] = 12.33f;
//		marks[1]=23.44f;
//		marks[2]=23;
//		System.out.println(marks.length);
//		System.out.println(marks.toString());
//		System.out.println(Arrays.toString(marks));
//		for(int i=0;i<=marks.length-1;i++) {
//			System.out.println(marks[i]);
//		}
		
//		String empName[] = new String[3];
//		empName[0]="Niranjan";
//		empName[1]="Khamkar";
//		empName[2]="Vitthal";
////		System.out.println(empName.length);
////		System.out.println(Arrays.toString(empName));
//		
//		for(byte b=0; b<empName.length; b++) {
//			System.out.println(empName[b]);
//			if(empName[b].equals("Khamkar")) {
//			System.out.println("promote this emp to SDET 2");
//			break;
//			}
//		}
//		System.out.println("---------------");
//		
//		//for each loop/Enhanced for loop
//		for(String e:empName) {
//			System.out.println(e);
//			if(e.equals("Khamkar")) {
//				System.out.println("promote this emp to SDET 2");
//				break;
//			}
//		}
		
//		
//		int i[] =new int[4];
//		i[0]=10;
//		i[1]=20;
//		i[2]=30;
//		i[3]=40;
//		for(int e:i) {
//			System.out.println(e);
//		}
		
		
//		float numbers[] = new float[3];// 0-2
//		numbers[0] = 12.33f;
//		numbers[1] = 23.44f;
//		numbers[2] = 100.22f;
//		
//		
//		for(float e : numbers) {
//			System.out.println(e);
//		}
		
		
//		char ch[] = new char[4];//0-3
//		//System.out.println((byte)ch[0]); //'\u0000' (or 0)
//		ch[0] = 'a';
//		ch[1] = 'A';
//		ch[2] = '9';
//		ch[3] = '$';
//		
//		System.out.println(ch);//no garbage value: concatenabed values of char array
//		System.out.println(Arrays.toString(ch));
//		
//		for(int e : ch) {
//			System.out.println(e);
//		}

		//Emp info: name(string), age(int), salary(double), dob(String), isActive(boolean), gender(char)
				//Object Array:
				Object empInfo[] = new Object[6];//0-5
				System.out.println(Arrays.toString(empInfo));
				
				empInfo[0] = "Karishma";
				empInfo[1] = 30;
				empInfo[2] = 35.55;
				empInfo[3] = "01-01-1990";
				empInfo[4] = true;
				empInfo[5] = 'f';
				
				System.out.println(Arrays.toString(empInfo));
				
				//index loop:
				for(int e=0; e<empInfo.length; e++) {
					System.out.println( e + " = " + empInfo[e]);
				}
//				0 = Karishma
//				1 = 30
//				2 = 35.55
//				3 = 01-01-1990
//				4 = true
//				5 = f
				
				System.out.println("--------");
				
				//for each:
				int count = 0;
				for(Object e : empInfo) {
					System.out.println(count + " = "+ e);
					count++;
				}
		
		
		
		
	}

}
