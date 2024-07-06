package arrayProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayAssignment3 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		ArrayList<String> colours = new ArrayList<String>();
		colours.add("Red");
		colours.add("Orange");
		colours.add("Blue");
		colours.add("Green");
		colours.add("White");
		System.out.println(colours); 
		System.out.println("-------");
		ArrayList<String> portion = new ArrayList<String>(colours.subList(1, 4));
		System.out.println(portion);
		
		System.out.println(colours);
		
		for(String cl : colours) {
			System.out.println(cl);
			
		}
		colours.clear();
		System.out.println(colours);
		System.out.println("Program Ends");
	}
}
