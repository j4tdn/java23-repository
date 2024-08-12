package utils;

public class MathUtils {

		private MathUtils() {
		}
		
		public static boolean isPrime(long n) {
			if (n < 2) {
				return false;
			}
			for (long i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		// n = 5
		public static long getFact(int n) {
			long fact = n;
			long running = n -1;
			
			while(running > 1) {
				fact *= running--;
			}
			return fact;
		}
		
		public static int reversed(int n) {
			int reversed = 0;
			while(n != 0) {
				int unitPart = n % 10;
				reversed = reversed * 10 + unitPart;
				n = n / 10;
			}
			return reversed;
		}
}
