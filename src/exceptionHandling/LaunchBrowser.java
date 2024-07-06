package exceptionHandling;

public class LaunchBrowser {

	public static void main(String[] args) throws AppException {
		
		String browser = "Opera";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome is launch");
			break;
		case "opera":
			System.out.println("Opera is launch");
			break;
		
		case "edge":
			System.out.println("Edge is launch");
			break;
			
		default:
			System.out.println("Send correct browser name : "+browser);
			throw new AppException("INVALID APP EXCEPTION");
			
		}
		System.out.println("enter the url");
		System.out.println("click on signup button");
		
	}

}
