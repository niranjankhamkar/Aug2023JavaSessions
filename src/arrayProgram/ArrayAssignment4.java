package arrayProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayAssignment4 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		ArrayList<String> colours = new ArrayList<String>();
		colours.add("Red");
		colours.add("Blue");
		colours.add("Orange");
		colours.add("White");
		colours.add("Black");
		colours.add("Brown");
		colours.add("Pink");
		colours.add("Indigo");
		colours.add("Gary");
		colours.add("Yellow");
		
		System.out.println(colours);
		
		//colours.trimToSize();
		int counter = 0;
		for(String cl : colours) {
			
			
		if( counter%2==0) {
			
			//System.out.println("even"+"  "+counter+" "+cl);
			}else {
			
			System.out.println("odd"+"  "+counter+" "+cl);
			}
		counter++;
		}
		
		
		System.out.println("Program Ends");
	}
}
