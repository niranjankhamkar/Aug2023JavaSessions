package constructorConcept;

public class Customer {
	
	public String name;
	public int age;
	public boolean isActive;
	
	
	
	public Customer(String name, int age, boolean isActive) {
		System.out.println("Customer-String-int-boolean");
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}



	public void get() {
		
	}

}
