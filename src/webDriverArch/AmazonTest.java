package webDriverArch;

public class AmazonTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		//FireFoxDriver driver = new FireFoxDriver();
		//EdgeDriver driver = new EdgeDriver();
	
		//Top casting : cross browser logic
		String browser = "firefox";
		
		switch (browser.toLowerCase().trim()) {
		case"chrome":
			 driver = new ChromeDriver();
			break;
		
		case"firefox":
			driver = new FireFoxDriver();
			break;
		
		case"edge":
			driver = new EdgeDriver();
			break;
		
		default:
			System.out.println("please send the correct browser name..."+browser);
			break;
		}
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle()	;
		System.out.println(title);
		
		driver.findElement("emailId");
		driver.findElement("password");
		driver.sendKeys("emailId", "admin@gmail.com");
		driver.sendKeys("password", "admin@123");
		driver.click("login button");
		
		driver.close();
	}
		//Testing obj = new Testing();
		//System obj = new System();
}
