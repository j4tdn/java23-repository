package validate_trycatch_throwthrows;

import exception.InvalidAgeException;

public class Ex06CustomException {

	
	public static void main(String[] args) throws InvalidAgeException {
		validateAge(13);
		
		
	}
	
	private static void validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age is invalid(required >= 18");
//		Đang là ở runtime nên khi dùng throw đang ở trạng thái exception bên ngoài thì phải thêm throws
		}
		System.out.println("Passed Age validation ...");
		
		
	}
}
