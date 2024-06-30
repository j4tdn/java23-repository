package utils;

public class MathUtils {
	
	private MathUtils() {
	}
	
	public static long getFact(int n) {
		long fact = n;
		long running = n - 1;
		while(running > 1) {
			fact *=running--;
		}
		return fact;
	}	
}
