package OOP_Inheritance;

public class Car extends Vehical {
	//final method: can not be overridden : to prevent method overriding
	//final class : can not be a parent class : to prevent inheritance
	
	int maxSpeed=100;
	
	final int price = 5000;
	
	static String colour = "Black";
	
	public void start() {
		System.out.println("Car-Start");
	}
	public void stop() {
		System.out.println("Car-Stop");
	}
	public void refule() {
		System.out.println("Car-Refule");
	}
	public static void billing() {
		System.out.println("car-billing");
	}
	protected void selling() {
		System.out.println("car-selling");
	}
	public final static void testing() {
		
	}
}
