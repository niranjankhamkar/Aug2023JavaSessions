package DataCoversion;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WrapperClassConcept {

	public static void main(String[] args) {
		 
		String x ="100";
		System.out.println(x+20);
		System.out.println("-------------");
		//String to int ---> Integer
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		System.out.println("-------------");
		//String to double 
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		System.out.println("-------------");
		//String to Byte
		String sb = "96";
		byte b = Byte.parseByte(sb);
		System.out.println(b+1);
		System.out.println("----------------");
		//String to long
		String sl = "9545250550";
		long l = Long.parseLong(sl);
		System.out.println(l+1);
		System.out.println("----------------");
		//String to short
		String ss = "601";
		short s = Short.parseShort(ss);
		System.out.println(s+1);
		System.out.println("-------------");
		//String to float
		String sf = "55.66";
		float f = Float.parseFloat(sf);
		System.out.println(f+1);
		System.out.println("-------------");
		//String to boolean
		String remoteExecution = "true";
		boolean flag = Boolean.parseBoolean(remoteExecution);
		
		if(flag) {
			System.out.println("run tcs on AWS cloud");
		}
		else {
			System.out.println("run tcs i local");
		}
		System.out.println("-------------");
		
		//int to String
		int age =30;
		String ageVal = String.valueOf(age);	//"30"
		System.out.println(ageVal+20); 	//3020
		System.out.println("-------------");
		
		//byte to String
		byte bs = -128;
		String bbs = String.valueOf(bs);
		System.out.println(bbs+1000);
		System.out.println("-------------");
		//short to String
		short ss1 = 2023;
		String sss = String.valueOf(ss1);
		System.out.println(sss);
		System.out.println("-------------");
		//long to String
		long l1 = 9475;
		String l2 = String.valueOf(l1);
		System.out.println(l2);
		System.out.println("-------------");
		//flot to string
		float f1 = 638.8f;
		String f2 = String.valueOf(f1);
		System.out.println(f2);
		System.out.println("-------------");
		//double to String
		double sal = 12.33;
		String salValue = String.valueOf(sal);	//"12.33"
		System.out.println(salValue.length());	//5
		System.out.println(salValue);
		System.out.println("-------------");
		//chat to String
		char ch = 'a';
		String ch1 = String.valueOf(ch);
		System.out.println(ch1);
		System.out.println("-------------");
		//boolean to string
		boolean flag1 = true;
		String boo = String.valueOf(flag1);
		System.out.println(boo);
		System.out.println(boo.length());
		System.out.println("-------------");
		
		//Assignment String to Integer
		String a = "100A";
//		int b = Integer.parseInt(a);	//Number format exception
//		System.out.println(b+20);
		String str22 = a.substring(0, a.length()-1);
		System.out.println(str22);
		int i1 = Integer.parseInt(str22);
		System.out.println(i+1);
		System.out.println("-------------");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		
			
	}

}
