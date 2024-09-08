import java.util.Arrays;

public class Ex04 {

	/*
	 Số nguyên tố tương đương
	Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước
	số nguyên tố.
	Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là
	3 và 5.
	Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các
	số này có là nguyên tố tương đương với nhau hay không?
	Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
	Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO.
	 */
	
	
	public static void main(String[] args) {
	System.out.println(equivalentPrime(75,15));
	}
	private static  boolean equivalentPrime(long a, long b) {
		return Arrays.equals(getDividedPrimeNumber(a), getDividedPrimeNumber(b));
	}
	private static long [] getDividedPrimeNumber(long number) {
		long [] divisible = new long[(int)number];
		int count = 0;
		for(int i = 2; i<= number/2;i++) {
			if(number%i==0&&isPrime(number)) {
				divisible[count++] = i;
			}
		}
		return Arrays.copyOfRange(divisible, 0, count);
	}
	
	private static boolean isPrime(long a) {
		if(a < 2) {
			return false;
		}
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
