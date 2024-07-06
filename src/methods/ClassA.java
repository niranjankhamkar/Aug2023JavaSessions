package methods;

public class ClassA {
	public static void test1(ClassA a) {
		System.out.println("class A = static test1");
		a.test2();
	}
	public void test2() {
		System.out.println("class A = non static test2");
	}
	public static void main(String[] args) {
		System.out.println("Class A = static main method");
		
	}

}
