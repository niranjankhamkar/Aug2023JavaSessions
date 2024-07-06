package stringConcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "Hi This is my java code and i am so happy";
		
		System.out.println(str.length());
		System.out.println("LI = "+0);
		System.out.println("HI = "+(str.length()-1));
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(35));
		//System.out.println(str.charAt(36));	//SIOB
		//System.out.println(str.charAt(-01));	//SIOB
		
		System.out.println(str.indexOf("H"));
		System.out.println(str.indexOf('i'));	//1st occurrence 
		System.out.println(str.indexOf("i", str.indexOf('i')+1));//2nd occurrence 
		System.out.println(str.indexOf("i",str.indexOf("i", str.indexOf('i')+1)+1 ));//3rd occurrence 
		System.out.println(str.indexOf("i",str.indexOf("i",str.indexOf("i", str.indexOf('i')+1)+1 )+1));//4th 
		System.out.println("------");
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("Naveen"));
		
		String mesg  = "admin Welcome null";
		if(mesg.indexOf("admin")!=0) {
			System.out.println("admin is here");
		}else {
			System.out.println("FAIL");
		}
		
		//trim
		String sr = "  hello   word   ";
		System.out.println(sr.trim());
		
		//replace
		String dob = "02-08-1989";
		System.out.println(dob.replace("-", "/"));
		System.out.println(dob);
		
		String s1 =  "  hello   word   ";
		System.out.println(s1.replace("  ", ""));
		
		//toLower and toUpperCase
		String sf = "This Is Java";
		System.out.println(sf.toLowerCase());
		System.out.println(sf.toUpperCase());
		
		//Comparison 
		String l1 = "Hello Selenium";
		String l2 = "Hello selenium";
		System.out.println(l1.equals(l2));
		System.out.println(l1.equalsIgnoreCase(l2));
		
		//Contains
		String m1 = "Hello this is java lang";
		System.out.println(m1.contains("Java"));
		System.out.println(m1.contains("java"));
		
		if(m1.contains("java")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		System.out.println("-------");
		
		//sub-string
		String loop = "your order id is 1234";
		System.out.println(loop.substring(3));
		System.out.println(loop.substring(5, 10));
		
		System.out.println(loop.substring(loop.indexOf("is")+3, loop.length()));
		System.out.println("-----");
		
		//split
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String lg[]=lang.split("_");
		System.out.println(lg[0]);
		System.out.println(lg[1]);
		System.out.println(lg);//not correct
		System.out.println(Arrays.toString(lg));
		System.out.println("-----");
		
		String pop = "xXhelloSeleniumxXXTestingXxXAutomationXXxXjava";
		String p[]=pop.split("xX");
		System.out.println(p[0]);	//blank,empty,nothing
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		System.out.println("-----");
		
		String empInfo = "Ravi;Sharma;IBM;India:QA";
		System.out.println(empInfo.split(";")[0]);
		System.out.println(empInfo.split(";")[2]);
		
		System.out.println("-----");
		String domain = "test.automaion.python.jva";
		String dm[] = domain.split("\\.");
		System.out.println(dm[0]);
		
		for(int i=0;i<dm.length;i++) {
			System.out.println(dm[i]);
		}
		
		String data = "test|automaion|python|jva";
		String dm1[] = data.split("\\|");
		System.out.println(dm1[0]);
		
		String foo = "I love java coding";
		System.out.println(foo);
		
		System.out.println("I love\"java\"coding");
		
		System.out.println("I love'java'coding");
		
		System.out.println( " \"I love java coding\" ");
		System.out.println("--------------------");
		
		String x1 = getXpath("naveen");
		System.out.println(x1);
		
	}
	
	public static String getXpath(String empName) {
		
		//String xpath = "//input[@name='"+empName+"']";
		String xpath = "//input[@name=\""+empName+"\"]";
		return xpath;
		
		
		
	}
	
	
	

}
