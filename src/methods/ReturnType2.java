package methods;

import java.util.ArrayList;

public class ReturnType2 {
	
	public String getName() {
		String name = "Niranjan";
		return name;
	}
	public ArrayList<String> getEmpName(){
		System.out.println("getEmpName");
		String emp1="Naveen";
		String emp2="Khamkar";
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add(emp1);
		empList.add(emp2);
		return empList;
	}
	
	
	public static void main(String args[]) {
		ReturnType2 rr = new ReturnType2();
		String name = rr.getName();	
		System.out.println(name);
		
		ArrayList<String> eList = rr.getEmpName();
		System.out.println(eList);
	}


}
