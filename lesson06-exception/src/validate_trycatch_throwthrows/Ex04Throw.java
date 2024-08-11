package validate_trycatch_throwthrows;

public class Ex04Throw {

	public static void main(String[] args) {
		// validate b!=0 --> mới gọi hàm
		System.out.println("Test01 --> " + divide(6, 2));

		// validate b!=0 --> mới gọi hàm
		System.out.println("Test02 --> " + divide(14, 7));
		
		// gọi hàm
		try {
			System.out.println("Test03 --> " + divide(5, 0));
		} catch (ArithmeticException e) {
			System.out.println("Error >>> " + e.getMessage());
		}
	}
	
	/*
	Bị exception khi mấu số b = 0
	
	--> try catch --> 100% lúc nào cũng phải test xem bị exception không
	--> dưa thừa khi chỗ gọi hàm đã validate cho biến b
	
	Hàm divide có bị exception hay không là do chỗ gọi hàm truyền vào a,b ntn?
	
	==========================================================================
	
	Từ khóa throw (ném ngoại lệ) thường dùng trong các hàm
	
	Khi hàm xảy ra ngoại lệ do tham số truyền vao thì mình sẽ kiểm tra nếu tham số đó không hợp lệ
	--> throw ra exception --> chỗ gọi hàm gây ra exception phải bắt lỗi đó
	
	Nếu ném mà chỗ gọi không bắt --> vẫn dừng chương trình
	
	Tại thời điểm compile, hàm divide ném ra ArithmeticException
	Chỗ gọi hàm divide không bắt buộc xử lý (ném đi chỗ khác, try/catch)
	
	ArithmeticException: 
	IOException
	
	throws Unchecked Exception --> vô nghĩa
	throws Check Exception --> chỗ gọi nó bắt buộc phải xử lý
	--> throws tại chỗ khai báo hàm
	
	throw khi biết chính xác nguyên nhân exception do đâu
	--> throw ra một objecr: throw new E...
	E Checked Exception   --> throws ở phần khai báo hàm
	  Unchecked Exception --> không cần
	  
	 */
	private static int divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("denominator should not be zero!");
			// Chỗ gọi hàm nào b có thể = 0 --> bắt lỗi này
		}
		return a / b;
	}
	
	/*
	
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at validate_trycatch_throwthrows.Ex04Throw.divide(Ex04Throw.java:15)
		at validate_trycatch_throwthrows.Ex04Throw.main(Ex04Throw.java:10)
	
	 */
	
}
