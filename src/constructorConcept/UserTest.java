package constructorConcept;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
	User u1 = new User("Niranjan");
	String NiranjanDetails[] = u1.getUserOrderDetails("Niranjan");
	System.out.println(Arrays.toString(NiranjanDetails));
	
	
	User u = new User("Ansh");
	String AnshDetails[] = u1.getUserOrderDetails("Ansh");
	System.out.println(Arrays.toString(AnshDetails));
	
		//System.out.println(u1.name);
		//System.out.println(u1.email);
		System.out.println("---------");
 	User u2 = new User("Raj","nk@gmail");
	 	//System.out.println(u2.name);
	 //	System.out.println(u2.email);
 	System.out.println("---------");
 	User u3 = new User("Ram","rk@gmail","NVK");
	System.out.println("---------");
	User u4 = new User("Rani","rr@gmail",10,"NVK");
	System.out.println("---------");
	Customer c = new Customer("NIranjan",1,true);
	System.out.println(c.name);
	System.out.println("---------");
	//User u = new User("Niranjan","shweta","Ansh");
	
	
	
	}
}
