package stringConcept;

public class StringReversePractise {
	
	public static String Reverse(String str) {
		//Niranjan = N is  0 & last n is 7 position so length is 8
		
		if(str==null) {
			System.out.println("null parameter send");
			return null;
		}
		if(str.isBlank()) {
			System.out.println("only spaces send");
			return "Only spaces";
		}
		
		int l = str.length();//--> step 1 capture length
		//System.out.println(l);
		if(l==1 || l==0 ) {
			System.out.println("only single charater");
			return str;
		}
		String result = "";
		for(int i = l-1; i>=0 ;i--) {	//---> use string length to reverse
			result =result+str.charAt(i);//---> charAt is imporatnt use in str
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		//System.out.println(Reverse("Niranjan"));
		//System.out.println(Reverse(""));
		//System.out.println(Reverse(null));
		System.out.println(Reverse("      "));
	}

}
