package my.custom.exception;

public class InValidAgeException extends RuntimeException {

	public InValidAgeException() {
		super();
	}
	
	public InValidAgeException(String errorMessage) {
		
		super(errorMessage);
	}
}
