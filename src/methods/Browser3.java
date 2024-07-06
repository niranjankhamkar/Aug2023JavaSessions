package methods;

public class Browser3 {
	public boolean launchBrowser(String browserName) {
		System.out.println("Browser name is : "+browserName);
		
		boolean flag=true;
		
		switch(browserName.trim().toLowerCase()) {
		case("safari"):
			System.out.println("Safari browser is launch");
		 	break;
		case("Opera"):
			System.out.println("Opera browser is luanch");
			break;
		case("firefox"):
			System.out.println("FireFox broser is launch");
			break;
		case("chrome"):
			System.out.println("Chrome browser is launch");
			break;
		case("edge"):
			System.out.println("Edge broser is launch");
		
		default:
			System.out.println("Send correct browser name");
			flag=false;
			break;
		}
		return flag;
	}
	
	
	
	public static void main(String args[]) {
		Browser3 br = new Browser3();
		boolean flag = br.launchBrowser("Safari");
		if(flag==true) {
			System.out.println("Open URL");
		}else {
			System.out.println("Error browser not avilable");
		}
	}
}
