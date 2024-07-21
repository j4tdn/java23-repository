package view;

public class Ex05Symetric {

	/* Viết chương trình kiểm tra N có phải là số đối xứng hay ko
	 * số đối xứng
	 * chuỗi đối xứng
	 * mảng, danh sách đối xứng
	 
	 --> 567   -> false
	 --> 89123 -> true
	 --> 23432 -> true
	 
	 567 -> tìm số ngược lại -> 765 nếu bằng nhau thì là số đối xứng
	 --> Cách 1: +-* / tìm số ngược lại
	 --> Cách 2: chuyển sang chuỗi, mảng -> duyệt ngược lại
	 --> Cách 3: kiểm tra từng cặp kí tự, số đối xứng
	 
	 Biết rằng N đc nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
	 */
	
	public static void main(String[] args) {
		
	}
	
	// int initial = n;
	// n = 123 --> 32
	
	// int reversed = 0  --> 3
	
	// int mod = n % 10; --> 2
	// reversed = reversed*10 + mod
	// n = n / 10 --> 0
	
	private static boolean isSymetric(int n) {
		return n == MathUtils.reverse(n);	
	}
}
