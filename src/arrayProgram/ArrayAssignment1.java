package arrayProgram;

import java.util.ArrayList;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		ArrayList<String> colours = new ArrayList<String>();
		colours.add("Green");
		colours.add("Red");
		colours.add("White");
		colours.add("Orange");
		colours.add("Pink");
		colours.add("Black");
		colours.add("Blue");
		System.out.println(colours);
		System.out.println("-----------------");
		for (String colour : colours) {
			System.out.println(colour);
		}
		System.out.println("-----------------");
		for (int i = 0; i < colours.size(); i++) {
			System.out.println(i + " = " + colours.get(i));
		}
		System.out.println("-----------------");
		System.out.println(colours.get(2));
		System.out.println("-----------------");
		colours.set(0, "Yellow");
		System.out.println(colours);
		System.out.println("-----------------");
		colours.remove(2);
		System.out.println(colours);
		
		System.out.println("-----------------");
		String searchColour = "Pink";
//		for(int j=0;j<colours.size();j++) {
//			System.out.println(colours.get(j));

		for (String colour : colours) {
			System.out.println(colour);
			if (colour.equals(searchColour)) {
				System.out.println("colour is pink break");
				break;
			}
		}
		System.out.println("Program Ends");
		
	}
}
