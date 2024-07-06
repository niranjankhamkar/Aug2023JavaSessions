package trialNaveen;

public class AssignmentString {

	public static String revCap(String str) {
		System.out.println(str);
		System.out.println("--------");
		
		String sr[] =str.split(" ");
		System.out.println(sr[0]);
		System.out.println(sr[1]);
		System.out.println(sr[2]);
		System.out.println("------");
		
		String sr1=sr[0];
		System.out.println(sr1);
		String rev1="";
		for(int i=sr1.length()-1;i>=0;i--) {
			 rev1 = rev1+ str.charAt(i);
		}
		System.out.println(rev1);
		System.out.println("-------");
		
		String sr2=sr[1];
		System.out.println(sr2);
		String rev2="";
		for(int i=sr2.length()-1;i>=0;i--) {
			rev2=rev2+str.charAt(i);
		}
		System.out.println(rev2);
		System.out.println("-------");
		
		String sr3 = sr[2];
		System.out.println(sr3);
		String rev3="";
		for(int j=sr3.length()-1;j>=0;j--) {
			rev3=rev3+str.charAt(j);
		}
		System.out.println(rev3);
		
		
		System.out.println("-------");
		return rev1+" "+rev2+" "+rev3;
	}
	
	public static void main(String[] args) {
		System.out.println(revCap("Selenium is good"));
		//System.out.println(revCap("There was garden"));
	}

}
