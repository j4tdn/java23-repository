package review;

import utils.IoUtils;
import utils.MathUtils;

public class Ex08Prime {
	
	// Kiểm tra 1 số có phải là số nguyên tố
	// Số nguyên tố là số chỉ chia hết cho 1 và chính nó
	
	// Công thức 
	// Nhập vào n
	// Duyệt từ 2 < n --> [2,sqrt(n)]
	// Nếu n chia hết cho số nào trong phạm vi [2,n)
	// Ko phải là SNT
	// Ngược lại thì là SNT

	public static void main(String[] args) {
		int n = IoUtils.input(5);
		System.out.println("Is Prime --> " + MathUtils.isPrime(n));
	}
	
}
