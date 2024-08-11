package validate_trycatch_throwthrows;

import exception.InvalidAgeException;

public class Ex06CustomException {
	
	public static void main(String[] args) {
		try {
			validateAge(20);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
	
	private static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age is invavlid(required >= 18)");
		}
		System.out.println("Passed Age validation ...");
	}
	
	// Có thể tạo ra các custom exception
	// Code more readable
	// Custom default message của 
	
}