package view;

public class Ex01 {
	
	public static boolean isPowerOf (int base, int exponent) {
		if (base == 1) return exponent == 1;
		if (exponent == 1) return base == 1;
		if (base <= 0 || exponent <= 0)
			return false;
		while (base % exponent == 0) {
			base /= exponent;
		}
		return base == 1;
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}
}
