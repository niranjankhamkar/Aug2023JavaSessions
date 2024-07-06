package stringConcept;

public class StringReverse {
	
	//WAF(Write a function): name :reverseString
	//input parameter : String : str
	//return String : reversed string
	//0th position-->Selenium<-- 7th position  then length=8 (L-1)-->0
			//String is collection of type of charter
	public static String reverseString(String str) {
		
		//null check
		if(str == null) {
			System.out.println("String is null can not reverese, right valuepass ");
			//return null;
			return "String is null";
		}
		
		//string is space
		if(str.isBlank()) {
			System.out.println("String contains only space");
			return "only space";
		}
		
		int len = str.length();//8
		//length check
		if(len==1 || len==0) {
			return str;
		}
		
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			 rev = rev+ str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		String str = "Selenium";
//		
//		StringBuilder sb = new StringBuilder(str);
//		System.out.println(sb.reverse());
		
		System.out.println(reverseString("Selenium"));
//		System.out.println(reverseString("123"));
//		System.out.println(reverseString("Niranjan"));
//		System.out.println(reverseString("T"));
//		System.out.println();
//		System.out.println(reverseString(null));
//		System.out.println(reverseString(""));
	//	System.out.println(reverseString("    "));
		
	
	}
	//Assignment I am the Best --> Best the am I 
}
