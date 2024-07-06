package methods;

public class StaticConcept {
	
	String name;
	int price;
	String chsisNo;
	static final int wheel=4;
	
	
	public static void main(String[] args) {
		
		//StaticConcept.wheel=5;
		
		StaticConcept c1 = new StaticConcept();
		c1.name = "BMW";
		c1.price = 60;
		c1.chsisNo = "1234bmw";
		//StaticConcept.wheel = 4;
		
		
		StaticConcept c2 = new StaticConcept();
		c2.name = "TATA";
		c2.price = 30;
		c2.chsisNo = "1234tata";
		//StaticConcept.wheel = 4;
		
		
		StaticConcept c3 = new StaticConcept();
		c3.name = "Audi";
		c3.price = 50;
		c3.chsisNo = "12audi";
		//StaticConcept.wheel = 4;

		System.out.println(c1.name+" "+c1.price+" "+c1.chsisNo+" "+wheel);
		System.out.println(c2.name+" "+c2.price+" "+c2.chsisNo+" "+wheel);
		System.out.println(c3.name+" "+c3.price+" "+c3.chsisNo+" "+wheel);
	}

}
