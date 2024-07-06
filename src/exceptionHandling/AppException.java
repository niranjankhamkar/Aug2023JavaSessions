package exceptionHandling;

public class AppException extends RuntimeException {	// { Exception
	
	public AppException(String mesg) {
		super(mesg);
	}
}
