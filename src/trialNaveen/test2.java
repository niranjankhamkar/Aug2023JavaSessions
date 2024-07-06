package trialNaveen;

import java.util.ArrayList;
import java.util.Arrays;

import org.basicProgram.SwitchCase;

public class test2 {
	
	String empName;
	int empNo;
	
	public boolean launchBrowser(String browserName) {
		
		boolean flag = true;
		
		switch (browserName) {
		case "chrome":
				System.out.println("Chrome browser is launch");
			break;
		
		case "edge":
			System.out.println("Edge browser is launch");
		break;	
		
		
		default:
			
			System.out.println(browserName+"  Plese pass correct browser name ");
			flag = false;	
			break;
		}
		
		
		return flag;
	}
	
	public static void main(String[] args) {
		test2 obj = new test2();
		boolean flag = obj.launchBrowser("chrom");
		
	if(flag ) {
		System.out.println("enter url");
	}else {
		System.out.println("errror ---- no browser is there");
	}
	
		
	}
	


	
	
	
}
