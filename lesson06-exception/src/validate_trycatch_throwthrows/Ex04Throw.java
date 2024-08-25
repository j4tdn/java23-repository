package validate_trycatch_throwthrows;

public class Ex04Throw {
	public static void main(String[] args) {
		// validate b != 0 --> gọi hàm
		System.out.println("test01 --> "  + divide(6, 2));
		// validate b != 0 --> gọi hàm
		System.out.println("test02 --> " + divide(14, 7));
		try {

			System.out.println("test03 --> " + divide(5, 0));

		} catch (ArithmeticException e) {
			System.out.println("error >> " + e.getMessage());
		}
	}
	/*
	  Bị exception khi mẫu số b = 0 
	  
	  --> try/catch : 100% khi nào cũng phải test xem có exception không 
	  --> dư thừa khi lệnh gọi hàm đã validate cho biến b
	  
	  Hàm divide có bị exception hay k là do chỗ gọi hàm truyền vào a, b ?
	  ==================================
	  
	  Từ khoá throw(ném ngoại lệ) thường dùng trong cách àm
	  
	  Khi hàm xảy ra ngoại lệ do tham số truyền vào thì mình sẽ kiểm tra
	  nếu tham số đó k hợp lệ --> throw ra exception --> chỗ gọi hàm gây ra exception phải bắt lỗi đó
	  
	  Nếu ném mà chỗ gọi k bắt -> dừng chương trình
	  ====================================
	  
	  Tại thời điểm compile, hàm divide ném ra ArithmeticException
	  chỗ gọi hàm divde k bắt buộc phải xử lý (ném đi chỗ khác, try/catch)
	  
	  ArithmeticException
	  IOException
	  
	  throws Unchecked Exception --> vô nghĩa
	  throws Checked Exception --> nơi gọi phải bắt buộc xử lý
	  --> throws tại chỗ khai báo hàm
	  
	  throw khi biết chính xác nguyên nhân exception do đâu
	  --> throw new E...
	  E  Checked Exception  --> throws ở phần khai báo hàm
	  	 Unchecked Exception --> không cần
	  
	 */
	private static int divide(int a, int b) {
		if (b== 0) {
			throw new ArithmeticException("denominator should not be zero !");
			// chỗ gọi hàm nào b có thể = 0 --> bắt lỗi này
		}
		return a/b;
	}
}
