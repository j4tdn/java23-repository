package validate_trycatch_thowthows;

import exception.InvalidAgeException;

public class Ex06CustomException {

	public static void main(String[] args)  {
		try {
			validateAge(20);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
	} 
	
	private static void validateAge(int age) throws InvalidAgeException  {
		if(age < 18) {
			throw new InvalidAgeException();
		}
		System.out.println("pass age vali");
	}

}
