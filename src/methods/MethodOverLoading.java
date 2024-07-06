package methods;

public class MethodOverLoading {
	
	public static void test() {
		System.out.println("test");
	}
	public  void test(int a) {		//non static method
		System.out.println("test-int");
	}
	public static void test(int a, int b) {
		System.out.println("test-int-int");
	}
	public static void test(String nira, double d) {
		System.out.println("test");
	}
	public static void test(double d,String nira) {
		System.out.println("test");
	}
	public static void test(byte b) {
		System.out.println("test");
	}
	public static void test(float f, boolean flag,String nira) {
		System.out.println("test");
	}
	 static final int b=12;
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		final int a=10;
		obj.test(10);
		System.out.println(a);
		//int a=120;  //error due to final keyword
		//obj.b=10;		//error due to final keyword

	}

}
