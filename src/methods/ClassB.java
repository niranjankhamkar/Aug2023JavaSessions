package methods;

public class ClassB {
	
	public static void test1() {
		System.out.println("class B = static test1");
	}
	public void test2() {
		System.out.println("class B = non static test2");
	}
	
	public static void main(String[] args) {
		System.out.println("Class B = static main method");
		ClassA.main(args);
		ClassA obj =new ClassA();
		obj.test2();
		ClassA.test1(obj);

	}

}
