package org.basicProgram;

public class DataType {
		DataType obj = new DataType();
		
		public static int x=10;
		
		
	public static void main(String[] args) {
		String a = "Hellow";		//1
		String b = " Naveen k";
		System.out.println("YY = "+a+b);
		
		int c=74, d=36;		//2
		System.out.println("c+b = "+(c+d));
		
		byte e=50,f=3;		//3
		int k=e/f;
		System.out.println("k = "+k);
		
		double g=25.5,h=3.5,i=40.5,j=4.5;		//4
		double l = ((g*h-h*h))/((i-j));
		System.out.println("l = "+l);
		
		//5
		
		int m=100,n=200,o=3400;		//6
		int sum=m+n+o;
		System.out.println(sum);
		
		System.out.println(DataType.x);
		
	}
	public static void  test1() {
		char ch = 'h';		//7
		System.out.println("ASCII value of h is "+(int)ch);
		
		char ah = 'd';		//8
		int p =3+ (int)ah;
		System.out.println(p);
		
		float q=3.9f;		//9
		System.out.println("square of 3.9 is "+(q*q));
	}

}
