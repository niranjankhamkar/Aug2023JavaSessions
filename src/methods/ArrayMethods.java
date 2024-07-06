package methods;


import java.util.Arrays;

public class ArrayMethods {
	
	public int[] arr() {
		System.out.println("Array method call");
		int ar[]= {1,2,3,4,5};
		return ar;
		
	}
	
	public static void main(String[] args) {
		ArrayMethods obj = new ArrayMethods();
		//System.out.println(obj.arr());
		int[] array = obj.arr();
		System.out.println(Arrays.toString(array));
	}
}
