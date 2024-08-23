package validate_trycatch_throwthrows;

public class Ex06CustomException {
	public static void main(String[] args) {
		validateAge(19);
	}
	
	private static void validateAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Age is invavlide(required >=18");
			
		}
		System.out.println("Passed Age validation ...");
	}
	//Co the tao ra cac custom exception
	//Code more readable
	//Custom default message cua exception
}
