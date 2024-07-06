package stringConcept;

public class User {

	public static void main(String[] args) {
		//String is a class
		
		//1.using literals
		String s2 = "Selenium";	//1 copy created inside heap
	
		//2.using new keyword
		String s1 = new String("Hello"); //2 copy created 1st in Heap & 2nd in SCP
		
		String s3 = "Hello";//0 copy created Bcoz one copy already creates by s1 inside SCP
		
		String s4 = new String("Hello"); // only one copy created in heap and other already created by s1 in SCP
		
		System.out.println(s1==s2);	// false--compare memory location -->compare primitive date
		System.out.println(s1.equals(s2));//false-- compare data -->always compare data 
		System.out.println(s1==s4);	//false compare memory location--> primitive data
		System.out.println(s1.equals(s4));	//true -- compare data --> .equals always compare data
		
		String s5 = "Hello";	//0 no create copy already created by s1
		System.out.println(s3==s5);//true Bcoz memory location is same
		System.out.println(s3.equals(s5)); //true
		
		String s6 = "hello";	// one copy created in side heap
		
		String s7 = new String("Naveen");//2 copy 1 is in heap & 2nd is in SCP
		String s8 = s7.intern();	// s8 have allocate separate memory //intern method use to call from SCP 
		System.out.println(s7==s8);//false
		System.out.println(s7.equals(s8));//true
		
		
		String str = "Hello";
		//str = str+"Selenium";
		//System.out.println(str);
		
		System.out.println(str+100);//Hello
		System.out.println("----");
		
		
		StringBuilder sb = new StringBuilder("Testing");
		System.out.println(sb.append("NIranjan"));
		System.out.println(sb.append("Automation"));
		System.out.println(sb);
		
	}

}
