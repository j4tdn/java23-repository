package exception;

public class InvalidAgeExcpetion extends Exception {
	
	public static void main(String[] args) {
		
	}
	
	
	public InvalidAgeExcpetion() {
		super("Invalid age exception");
	}
	public InvalidAgeExcpetion(String message) {
		super(message);
	}
}
