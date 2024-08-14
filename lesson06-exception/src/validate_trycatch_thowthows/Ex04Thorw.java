package validate_trycatch_thowthows;

public class Ex04Thorw {

	public static void main(String[] args) {
		System.out.println("text 01 --> " + divvide(21, 3));
		
		System.out.println("text 02 --> " + divvide(6, 2));

		//System.out.println("text 03 --> " + divvide(4, 0));

		try {
			System.out.println("text 03 --> " + divvide(4, 0));
		} catch (ArithmeticException e) {
			System.out.println("error >>> " + e.getMessage());
		}
	}
	
	/* Bị exception khi mẫu số = 0
	 * 
	 * --> try catch --> 100% khi nào cũng phair text xem có bị exception hay không 
	 * --> dư thừa khi mà chỗ gọi hàm đã validate cho biến b
	 * 
	 * Hàm diviede có bị exception hay không là do chỗ gọi hàm 
	 
	 */
	private static int divvide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("denominator should not be zero !");
			
		}
		return a/b;
	}
}
