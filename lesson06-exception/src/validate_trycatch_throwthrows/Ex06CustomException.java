package validate_trycatch_throwthrows;

import exception.InvalidAgeException;

public class Ex06CustomException {
 
	public static void main(String[] args) {
		try {
			validateAge(12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age is invalid(required >=18)");
		}
		System.out.println("passed Age validation");
	}
}
