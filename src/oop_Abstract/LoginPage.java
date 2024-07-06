package oop_Abstract;

public class LoginPage extends Page {
	public LoginPage() {
		System.out.println("Login Page Constructor");
	}
	public LoginPage(int a) {
		System.out.println("Login Page Para Constructor "+a);
	}
	@Override
	public void title() {
		System.out.println("LP_title");
	}
	@Override
	public void url() {
		System.out.println("LP_url");
	}
	public void pageLoadTime() {
		System.out.println("Page load time out = 10 sec");
	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("Lodin user with : "+un+" pwd : "+pwd);
	}
	
}
