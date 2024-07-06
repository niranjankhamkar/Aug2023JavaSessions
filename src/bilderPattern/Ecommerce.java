package bilderPattern;

public class Ecommerce {
	public Ecommerce login() {		//return is type class name(Ecommerce) so we return this 
		System.out.println("user is logged in");
		return this;//new Ecommerce
	}
	public Ecommerce login(String un, String pw) {
		System.out.println("user login un : "+un+" "+pw);
		return this;
	}
	public Ecommerce search(String productName) {
		System.out.println("searching Product : "+productName);
		return this;
	}
	public Ecommerce search(String productName, String colour) {
		System.out.println("Searching Product : "+productName+" "+colour);
		return this;
	}
	public Ecommerce selectProduct(String productName) {
		System.out.println("selecting product : "+ productName);
		return this;
	}
	public Ecommerce addToCart(String productName) {
		System.out.println("adding product in the cart : "+ productName);
		return this;
	}
	public Ecommerce doPayment(String cc, int cvv) {
		System.out.println("making payment using card : "+cc+" "+cvv);
		return this;
	}
	public Ecommerce generaterOrderId() {
		System.out.println("order id : "+12345);
		return this;
	}
	
	public Ecommerce logOut() {
		System.out.println("logout");
		return this;
	}
	
	
	
	
	
	
	
}
