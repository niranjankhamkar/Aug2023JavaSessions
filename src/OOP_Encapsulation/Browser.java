package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching Browser");
	}
	private void checkRam() {
		System.out.println("check RAM");
	}
	private void checkCPUUtilization() {
		System.out.println("check CPU Utilization");
	}
	private void checkBrowserVersion() {
		System.out.println("check Browser Version");
	}
	private void checkBrowserUpgrade() {
		System.out.println("check browser upgrade");
	}
	
	public void getBrowserData() {
		checkRam();
		checkCPUUtilization();
		checkBrowserVersion();
		checkBrowserUpgrade();
		System.out.println("browser is finally launch");
	}
	
	
}
