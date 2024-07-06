package methods;

import java.util.ArrayList;

public class ReturnType4 {	//return type String & ArrayList 
	public String test() {
		System.out.println("test method call");
		String name = "Niranjan";
		return name;
	}
	
	public ArrayList<String> carName(){
		System.out.println("car name method is call");
		String cr1 ="Honda";
		String cr2 = "BMW";
		String cr3 = "Audi";
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(cr1);
		arr.add(cr2);
		arr.add(cr3);
		
		return arr;
	}
	
	public static void main(String args[]) {
		ReturnType4 obj = new ReturnType4();
		String nn = obj.test();
		System.out.println(nn);
		System.out.println("-------------------");
		
		ArrayList<String> car =obj.carName();
		System.out.println(car);
		
		
	}
}
