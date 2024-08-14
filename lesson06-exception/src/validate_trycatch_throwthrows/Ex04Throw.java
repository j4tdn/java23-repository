package validate_trycatch_throwthrows;

public class Ex04Throw {
	
	public static void main(String[] args) {
		// validate b!=0 --> gọi hàm
		System.out.println("test01 --> " + divide(6, 2));
		
		// validate b!=0 --> gọi hàm
		System.out.println("test02 --> " + divide(14, 7));
		
		// gọi hàm
		try {
			System.out.println("test03 --> " +divide(5, 0));
		}catch (ArithmeticException e) {
			System.out.println("error >>> " + e.getMessage());
		}	
	}
	
	/*
	 Bị exception khi mẫu số b = 0
	 
	 --> try catch --> 100% khi nào cũng phải test xem bị exception ko
	 --> dư thừa khi mà chỗ gọi hàm đã validate cho biến b
	 	 
	 Hàm divide có bị exception hay không là do chỗ gọi hàm truyền vào a,b ?
	
	 =================
	 
	 Từ khóa throw(ném ngoại lệ) thường dùng trong các hàm
	 
	 Khi hàm xảy ra ngoại lệ do tham số truyền vào thì mình sẽ kiểm tra nếu tham
	 số đó ko hợp lệ --> throw ra exception --> chỗ gọi hàm gây ra exception phải bắt lỗi đó
	 
	 Nếu ném mà chỗ gọi không bắt --> dừng chương trình
	 
	 ==================
	 
	 Tại thời điểm compile, hàm divide ném ra ArithmeticException
	 chỗ gọi hàm divide không bắt buộc phải xử lý(ném đi chỗ khác, try/catch) 
	 
	 ArithmeticException
	 IOException
	 
	 throws Unchecked Exception --> vô nghĩa
	 throws Checked Exception --> chỗ gọi nó bắt buộc phải xử lý
	 --> throws tại chỗ khai báo hàm
	 
	 throw khi biết chính xác nguyên nhân exception do đâu
	 --> throw new E...
	 E Checked Exception --> throws ở phần khai báo hàm
	   Unchecked Exception --> ko cần
	 
	 */
	
	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("denominator should not be zero !");
			// chỗ gọi hàm nào b có thể = 0 --> bắt lỗi này
			// throw new IOException("test");
		}
		return a / b;
	}
	
	/*
	 
	 */
}
