package validate_trycatch_throwthrows;

public class Ex04Throw {

	public static void main(String[] args) {

		// Nếu 2 hàm sys ở trên đã validate nên khi sử dụng try/catch vào sẽ bị dư thừa

//	validate b!=0;

		System.out.println("test01 -->" + divide(6, 2));

//		validate b!=0;
		System.out.println("test02 -->" + divide(14, 7));

		try {

			System.out.println("test03 -->" + divide(5, 0));

		} catch (ArithmeticException e) {
			System.out.println("errors -->" + e.getMessage());

//		Từ khóa throw(ném ngoại lệ)thường dùng trong các hầm

//			Khi hàm xảy ra ngoại lệ do tham số truyền vào thì mình sẽ kiểm tra nếu tham số dó k hợp lệ
//	-->throw ra exception -> chỗ gọi hàm gây ra exception phải bắt lỗi đó

		}
	}

//	Bị exception khi mẫu số b = 0
	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("The denominator should not be hero !");
//			chô gọi hàm nào b có thể lầ 0 bắt lỗi này
		}
		return a / b;
	}

}
