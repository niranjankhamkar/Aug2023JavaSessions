package methods;

public class Browser {

	public boolean launchBrowser(String browserName) {
		System.out.println("browser name is "+browserName);
		boolean flag = true;
		
		switch(browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("chrome is launch");
			break;
		case "ff":	
			System.out.println("FireFox is launch");
			break;
		case "safari":
			System.out.println("safari is launch");
			break;
		case"edge":
			System.out.println("edge is launch");
			break;
			
		default :
			System.out.println("send correct browser name");
			flag = false;
			break;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		Browser br = new Browser();
		boolean flag = br.launchBrowser("safari   ");
		
		if(flag) {
			System.out.println("enter url");
		}else {
			System.out.println("error-- no browser is there");
		}
	}

}
