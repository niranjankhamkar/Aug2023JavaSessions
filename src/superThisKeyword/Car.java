package superThisKeyword;

public class Car {
	
	int speed = 100;
	
	public Car() {
		super();
		System.out.println("Car default Constructor");
	}
	
	public Car(int a) {
		this();
		System.out.println("Car Para int Constructor : "+a);
	}
	public Car(int a, int b) {
		this(3);
		System.out.println("Car Para int int "+(a+b));
	}
	public void displayInfo() {
		System.out.println("Car Display Info");
	}
}
