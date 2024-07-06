package methods;

public class Browser2 {
	public boolean launchBrowser(String browserName) {
		System.out.println("Browser name is : "+browserName);
		boolean flag = true;
		
		switch(browserName.trim().toLowerCase()) {
		case("chrome"):
			System.out.println("Chrome browser is launch");
			break;
		case("edge"):
			System.out.println("Edge browser is launch");
		 	break;
		 default:
			 System.out.println("Send correct browser name");
			 flag=false;
			 break;
		}
		return flag;
	}
	
	public static void main(String args[]) {
		Browser2 br = new Browser2();
		boolean flag = br.launchBrowser(" EdGe  ");
		if(flag==true) {
			System.out.println("put URL");
		}else {
			System.out.println("ERROR browser not avilable");
		}
	}
}
