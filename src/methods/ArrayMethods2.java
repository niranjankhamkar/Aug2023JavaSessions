package methods;

import java.util.Arrays;

public class ArrayMethods2 {
	
	public int[] number() {
		System.out.println("number method is call");
		int ar[]= {1,2,3,4,54,6};
		return ar;
		}
	
		public String[] arrayString() {
			System.out.println("String Array method is call");
			String ar1[]= {"Niranjan","Rohan","Mayur"};
			return ar1;
		}
	public static void main(String args[]) {
		
		ArrayMethods2 numList =new ArrayMethods2();
		int arr[] = numList.number();
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------");
		
		String sr[] = numList.arrayString();
		System.out.println(Arrays.toString(sr));
	}
}
