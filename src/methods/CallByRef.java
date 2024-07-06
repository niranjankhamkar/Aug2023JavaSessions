package methods;

public class CallByRef {

	public static void test1(CallByRef a) {
		System.out.println("test1 is static");
		a.test2();
		
	}
	public void test2() {
		System.out.println("test2 is non-static");
	}
	
	public static void main(String[] args) {
		CallByRef obj = new CallByRef();
		
		CallByRef.test1(obj);
	}

}
