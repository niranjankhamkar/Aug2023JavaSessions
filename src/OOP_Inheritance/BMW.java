package OOP_Inheritance;

public class BMW extends Car{
	int maxSpeed=200;
	
	final int price = 10000;	//there is no concept of variable overriding,hiding.
	
	static String colour = "Red";
	
	@Override
	public void start() {
		System.out.println("BMW-Start");
	}
	@Override
	public void engine() {
		System.out.println("BMW-engine");
	}
	public void autoParking() {
		System.out.println("BMW-AutoParking");
	}
	public static void billing() {
		System.out.println("BMW-billing");
	}
	@Override
	protected void selling() {
		System.out.println("car-selling");
	}
//	public final static  void testing() {
//	
//	}			
	
}
