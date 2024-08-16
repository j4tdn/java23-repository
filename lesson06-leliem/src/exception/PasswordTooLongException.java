package exception;

public class PasswordTooLongException extends Exception {
	public PasswordTooLongException(String message) {
        super(message);
    }
}

