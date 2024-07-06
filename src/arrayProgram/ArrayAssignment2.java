package arrayProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayAssignment2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		ArrayList<String> studentName = new ArrayList<String>();
		studentName.add("Niranjan");	//0
		studentName.add("Ansh");		//1
		studentName.add("Manish");		//2
		studentName.add("Rohan");		//3
		studentName.add("Pravin");		//4
		System.out.println(studentName);
		Collections.reverse(studentName);
		System.out.println(studentName);
		Collections.swap(studentName, 0, 1);
		System.out.println(studentName);
		Collections.sort(studentName);
		System.out.println(studentName);
		List<String> newList =Collections.emptyList();	//List is interface
		System.out.println(newList.size());
		
		System.out.println("-------------");
		for(String student : studentName) {		//Don't use for each loop
			System.out.println(student);		//for reverse
			
		}
		System.out.println("-------------");
		for(int st=studentName.size()-1;st>=0;st--) {	//for loop
			System.out.println(studentName.get(st));
		}
		
		
		System.out.println("Program Ends");
	}
}
