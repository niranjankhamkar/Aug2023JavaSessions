package javaSession;

public class Language {
	
	public static void useLang(Language lg) {
		System.out.println("use this laung");
		lg.redLang();
	}
	
	public void redLang() {
		System.out.println("read this lang");
	}
	
	public static void main(String[] args) {
		System.out.println("program start");
		Language lg = new Language();
		//lg.redLang();
		Language.useLang(lg);
		System.out.println("program Ends");
	}
	//POM - page object model/page changing model-- supply WebDriver driver

}
