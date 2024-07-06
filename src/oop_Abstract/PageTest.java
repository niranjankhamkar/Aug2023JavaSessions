package oop_Abstract;

public class PageTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.url();	//Overridden
		lp.title();//Overridden
		lp.pageLoadTime();//Overridden
		lp.doLogin("Admin", "Admin123");//individual 
		lp.logo();//inheritance
		
		//top casting: child class object can be referred by parent class ref variable
		Page p = new LoginPage();
		p.url();
		p.title();
		p.pageLoadTime();
		p.logo();
		//p.doLogin(); ==> not allowed
		
		
	}

}

