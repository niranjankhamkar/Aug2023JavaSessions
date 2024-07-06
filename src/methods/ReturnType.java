package methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnType {
	//1. no input no return
	public void test() {	//no input no return
		System.out.println("test");
	}
	//2.no input but some return
	public int getInfo() {
		System.out.println("get info method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	//3 return type: String
	public String getName() {
		System.out.println("get name Method");
		String name = "Naveen";
		return name;
	}
	
	//Can we return multiple value from method
	//-->NOOOOOOOO
	public ArrayList<String> getEmpNames() {
		System.out.println("get emp names...");
		String em1 = "Ravi";
		String em2 = "Naveen";
		//return em1+em2;
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add(em1);
		empList.add(em2);
		return empList;
	}
	public int[] methodArray() {
		System.out.println("int array");
		int  ar[]= {1,2,3,4,5};
		return ar;
	}
	
	//return type:String[]
	public String[] getEmployee() {
		System.out.println("get employee method");
		String emp[]= {"Ravi","Naveen"};
		return emp;
	}
	
	public int sum(int a, int b) {
		int total =a+b;
		return total;
	}
	public float getBillAmount(int billAmount, int drinkBill, float tax) {
		System.out.println("generating bill amount");
		float bill = billAmount + drinkBill+tax;
		return bill;
	}
	public int calculateMark(int Marathi, int Hindi, int English) {
		int totalMark = Marathi+Hindi+English;
		return totalMark;
	}
	
	public static void main(String[] args) {
		ReturnType obj = new ReturnType();
		obj.test();
		
		int s = obj.getInfo();
		System.out.println(s+20-10);
		System.out.println(obj.getInfo());
		
		ArrayList<String> eList = obj.getEmpNames();
		System.out.println(eList.toString());
		
		int intArray[] = obj.methodArray();
		System.out.println(intArray.length);
		System.out.println(Arrays.toString(intArray));
		
		
		String employee[] = obj.getEmployee();
		System.out.println(employee.length);
		System.out.println(Arrays.toString(employee));
		
		int result = obj.sum(9, 9);
		System.out.println(result);
		
		int u2 = obj.sum(1,1);
		System.out.println(u2);
		
		float bill = obj.getBillAmount(100, 20, 0.2f);
		System.out.println(bill);
		
		int mark = obj.calculateMark(5, 5, 5);
		System.out.println(mark);
	}
}
