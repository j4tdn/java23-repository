package view;

public class Ex09NthPrime {
	 public static void main(String[] args) {
	        int limit = 200;  // Tìm số nguyên tố thứ 200
	        int count = 0;  // Đếm số nguyên tố đã tìm được
	        int number = 2;  // Số để kiểm tra tính nguyên tố

	        while (count < limit) {
	            if (isPrime(number)) {
	                count++;
	                if (count == limit) {
	                    System.out.println("Số nguyên tố thứ " + limit + " là: " + number);
	                }
	            }
	            number++;
	        }
	    }

	    // Phương thức kiểm tra một số có phải là số nguyên tố
	    private static boolean isPrime(int n) {
	        if (n <= 1) return false;  // 1 không phải số nguyên tố
	        if (n <= 3) return true;  // 2 và 3 là số nguyên tố
	        if (n % 2 == 0 || n % 3 == 0) return false;  // Loại bỏ sớm các số chia hết cho 2 và 3
	        for (int i = 5; i * i <= n; i += 6) {
	            if (n % i == 0 || n % (i + 2) == 0) return false;
	        }
	        return true;
	    }
	}

