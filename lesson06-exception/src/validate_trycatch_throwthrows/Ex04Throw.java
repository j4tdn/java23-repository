package validate_trycatch_throwthrows;

public class Ex04Throw {

	public static void main(String[] args) {
		System.out.println("test01 -->" + divide(6, 2));
		System.out.println("test02 -->" + divide(14, 7));
		try {
			System.out.println("test03 -->" + divide(5, 0));
		} catch (ArithmeticException e) {
			System.out.println("error >>>" + e.getMessage());
		}
	}

	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("denominator should not be zero !");
		}
		return a / b;
	}
}
