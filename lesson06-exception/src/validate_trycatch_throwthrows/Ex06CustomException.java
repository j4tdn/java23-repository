package validate_trycatch_throwthrows;

import exception.InvalidAgeException;

public class Ex06CustomException {
	
	public static void main(String[] args) {
		try {
			validateAge(12);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
	
	private static void validateAge(int age) throws InvalidAgeException {
		if (age < 19) {
			throw new InvalidAgeException("Age is invalid(required >=18) ");
		}
		System.out.println("Passed Age validation ... ");
		
	}
	
	// Có thể tạo ra các custom exception
	// Code more readable 
	// Custom default message của exception
	
}
