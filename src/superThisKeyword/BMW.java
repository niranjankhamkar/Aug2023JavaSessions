package superThisKeyword;

public class BMW extends Car{
	
	int speed = 200;
	public BMW () {
		super(10,20);	//by default hidden
		System.out.println("BMW default car");
	}
	public BMW(int p) {
		this();
		System.out.println("BMW Para int Constructor : "+p);
	}
	@Override
	public void displayInfo() {
		System.out.println("BMW -- info");
	}
	
	public void displayBMW() {
		System.out.println("BMW System Info");
		System.out.println(speed);
		System.out.println(super.speed);
		
		displayInfo();
		super.displayInfo();
	}
	//super: pointing to the parent class object
	//1.in the child class constructor but it should be the first statement of child class constructor
	//2.when you have same properties(method overriding/same variable) in parent class constructor 
	//but you want to call/access parent class properties--use super keyword
	
	//this:pointing to the current class object
	//1.can call other constructor in the same class
	//2.either this() or super()
	//3.should be the first statement of constructor
	//4.to initiate the instance variables with the local variables in constructor and method
	//5.can return this keyword also from the method - builder pattern
}
