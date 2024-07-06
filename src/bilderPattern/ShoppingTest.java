package bilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		Ecommerce e = new Ecommerce();
		e.login()
			.login("niranjank@gmail", "Abcd@1234")
				.search("Mobile")
					.search("Mobile", "Blue")
						.selectProduct("iPhone")
							.addToCart("iPhone 15")
								.doPayment("1234 5677 1111 2222", 321)
										.generaterOrderId()
											.logOut();
		
		
	}

}
