package validate_trycatch_throwthrows;

public class Ex04Throw {
	public static void main(String[] args) {
		System.out.println("test01 --> " + divide(6, 2));

		System.out.println("test02 --> " + divide(5, 0));

		System.out.println("Finish");
	}

	/*
	 * Bị exception khi mẫu số b = 0;
	 * 
	 * --> try catch -> 100% khi nào cũng phải test --> dư thừa khi có chỗ đã
	 * validate
	 * 
	 * hàm divide có bị exception hay không là do chỗ gọi hàm
	 * 
	 * --> từ khoá throw thường dùng cho các hàm
	 * 
	 * khi hàm xảy ra ngoại lệ do tham số truyền vào thì mình sẽ kiểm tra tham số
	 * hợp lệ -> throw ra exception -> chỗ gọi hàm gây ra exception phải bắt lỗi đó
	 * 
	 * Nếu ném mà chỗ gọi không bắt -> dừng chương trình
	 * 
	 * ==============
	 * 
	 * tại thời điểm compile, divide ném Arith --> chỗ gọi hàm divide không bắt buộc
	 * phải xử lý (ném đi chỗ khác)
	 * 
	 * ArithmeticException IOException
	 * 
	 * throws Unchecked Exception -> vô nghĩa throws Checked Exception --> chỗ gọi
	 * nó bắt buộc phải catch!! --> throws tại chỗ khai báo hàm.
	 * 
	 */

	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("denominator should not be 0");
			// chỗ gọi hàm nào b có thể = 0 -> bắt lỗi này
		}
		return a / b;
	}
}
