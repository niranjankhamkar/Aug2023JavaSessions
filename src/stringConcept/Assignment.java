package stringConcept;

public class Assignment {

	public static void main(String[] args) {
		//Selenium is Good
		//output = muineleS si dooG
		
		String str = "Selenium is Good";
		String[] ar = str.split(" ");		
			System.out.println(ar[0]);
			System.out.println(ar[1]);
			System.out.println(ar[2]);
		System.out.println("-----------------");	
		String firstWord = ar[0];
		System.out.println(firstWord);
		int fistWordLength = firstWord.length();
		System.out.println(fistWordLength);
		String firstRev="";
		for(int i=fistWordLength-1;i>=0;i--) {
			firstRev=firstRev+firstWord.charAt(i);
		}
		System.out.println(firstRev);
		System.out.println("-----------------");
		
		String secondWord = ar[1];
		System.out.println(secondWord);
		int secondWordLength = secondWord.length();
		System.out.println(secondWordLength);
		String secondRev = "";
		for(int i=secondWordLength-1;i>=0;i--) {
			secondRev = secondRev+secondWord.charAt(i);
		}
		System.out.println(secondRev);
		System.out.println("-----------------");
		
		String thirdWord = ar[2]; 
		System.out.println(thirdWord);
		int thirdWordLength = thirdWord.length();
		System.out.println(thirdWordLength);
		String thirdRev="";
		for(int i=thirdWordLength-1;i>=0;i--) {
			thirdRev=thirdRev+thirdWord.charAt(i);
		}
		System.out.println(thirdRev);
		System.out.println("-----------------");
		
		
		String revSentence = firstRev+" "+secondRev+" "+thirdRev;
		System.out.println(revSentence);
	
	}

}
