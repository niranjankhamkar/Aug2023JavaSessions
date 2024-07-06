package oop_Abstract;

public abstract class Page {
	
	//JVM add one hidden default constructor internally
	
	public Page() {		//default constructor
		System.out.println("Page Constructor");
	}
	public Page(int a) {	//parameterized constructor 
		System.out.println("Page Para Constructor "+a);
	}
	
	//abstract class can not have object/ can not create or instantiate the abs class
	//Page pg = new Page();	//Error
	//but abstract class have the constructor and it will be called when you create the object of child class
	//abstract class have contain abstract and non abstract method
	
	//no abstract method:0% abstraction
	//only abstract method: 100% abstraction
	//abstract + non Abstract method : [0 to 100%]Partial Abstraction
	
	public abstract void title();
	public abstract void url();
	
	public void pageLoadTime() {
		System.out.println("Page load time out = 10 sec");
	}
	
	public  void logo() {
		System.out.println("App logo");
	}
	
	//when to use abs class
	//0 - 100% abstraction
	//100% abstraction : Interface
}


