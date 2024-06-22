package view;

public class Ex09The200thPrimeNumber {
	
	public static void main(String[] args) {
		int prime = findPrime(200);
		System.out.println("Số nguyên tố thứ 200 là: " + prime);
	}

	// Hàm tìm số nguyên tố thứ n
	public static int findPrime(int n) {
		int count = 0; // Đếm số lượng số nguyên tố đã tìm thấy
		int num = 2; // Bắt đầu kiểm tra từ số 2, vì số 1 và 0 không phải số nguyên tố rồi
		while (true) {
			if (isPrime(num)) {
				count++;
				if (count == n) {
					return num;
				}
			}
			num++;
		}
	}
	
	// Hàm kiểm tra số nguyên tố
		public static boolean isPrime(int n) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
}
