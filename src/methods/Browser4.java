package methods;

public class Browser4 {
	public int studentMarks(String studentName) {
		System.out.println("student Name "+studentName);
		
		int marks=-1;
		
		if(studentName.trim().toLowerCase().equals("sarika")) {
			marks = 90;
		}else if(studentName.trim().toLowerCase().equals("rahul")) {
			marks = 95;
		}else if(studentName.trim().toLowerCase().equals("shubhra")) {
			marks = 100;
		}else if(studentName.trim().toLowerCase().equals("naveen")) {
			marks = 0;
		}else {
			System.out.println("pls pass the right student name");
			
		}
		return marks;
	}
	
	public static void main(String[] args) {
		Browser4 student = new Browser4();
		int sMark = student.studentMarks("  Naveen  ");
		System.out.println(sMark);
		if(sMark>=0) {
			System.out.println("print the marksheet");
		}
		
	}
}
