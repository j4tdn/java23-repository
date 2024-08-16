package exception;

public class InvaliPasswordException extends Exception {

	public InvaliPasswordException() {
		super("Invalid password exception");
	}
	public InvaliPasswordException(String message) {
		super(message);
	}

}
