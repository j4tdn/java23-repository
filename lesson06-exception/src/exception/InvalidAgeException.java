package exception;

public class InvalidAgeException extends Exception /* extends RuntimeException (neu la exception runtime)*/{
	
	public InvalidAgeException() {
		super("Invalid age exception !");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
	
}
