package arrayProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<String> langList = new ArrayList<String>(Arrays.asList("java","c#","Python"));
		System.out.println(langList);
		System.out.println(langList.size());
		langList.add("C++");
		System.out.println(langList.size());
		System.out.println("------");
	
		// Footer section: Contact us, Privacy policy, NewsLetter
		//Actual list = Contact us, Privacy policy, NewsLetter
		//Expected list=
		ArrayList<String> footerList = new ArrayList<String>(Arrays.asList("Contact us", "Privacy policy", "NewsLetter"));
		//if(Actual list is equal to Expected list){
		//		Pass or Fail
		//}
		System.out.println(footerList);
		System.out.println("------");
		ArrayList<String> list = new ArrayList<String>() {{
			add("Niranjan");
			add("Khamkar");
		}};
		System.out.println(list);
	}

}
