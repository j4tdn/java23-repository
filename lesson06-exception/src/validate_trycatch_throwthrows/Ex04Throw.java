package validate_trycatch_throwthrows;

public class Ex04Throw {
	public static void main(String[] args) {
		System.out.println("test01 --> " + divide(6, 2));
		
		System.out.println("test02 --> " + divide(14, 7));
		
		//System.out.println("test03 --> " + divide(5, 0));
		try {
			System.out.println("test03 --> " + divide(5, 0));
		} catch(ArithmeticException e) {
			System.out.println("error >>> " + e.getMessage());
		}
	}
	/*
	 * Bị exception khi mẫu số b = 0
	 */
	private static int divide (int a, int b) {
		if (b == 0) {
			throw new ArithmeticException ("denominator should not be zero !");
			// chỗ gọi hàm nào b có thể = 0 --> bắt lỗi này
		}
		return a / b;
	}
	/*
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at validate_trycatch_throwthrows.Ex04Throw.divide(Ex04Throw.java:11)
	at validate_trycatch_throwthrows.Ex04Throw.main(Ex04Throw.java:7)
	 */
}
