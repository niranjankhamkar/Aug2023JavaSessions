package methods;

import java.util.ArrayList;

public class ReturnType3 {
	public String myName() {
		System.out.println("My Name Method");
		String name = "Niranjan";
		return name;
	}
		
	public ArrayList<String> myFriendNames(){
		String fri1="Rohan";
		String fri2="Manish";
		String fri3="praveen";
		
		ArrayList<String> friends =new ArrayList<String>();
			friends.add(fri1);
			friends.add(fri2);
			friends.add(fri3);
			friends.add(null);
			
			return friends;
	}
	
	
	
	public static void main(String args[]) {
		ReturnType3 obj = new ReturnType3();
		String name = obj.myName();
		System.out.println(name);
		System.out.println("-----------");
		
		ArrayList<String> myBast=obj.myFriendNames();
		System.out.println(myBast);
	
	}
}
