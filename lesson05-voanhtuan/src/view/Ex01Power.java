package view;

public class Ex01Power {

	public static void main(String[] args) {

		System.out.println("(8, 2)(" + isPowerOf(8, 2) + ")");
		System.out.println("(2, 8)(" + isPowerOf(2, 8) + ")");
		System.out.println("(6, 2)(" + isPowerOf(6, 2) + ")");
		System.out.println("(20, 4)(" + isPowerOf(20, 4) + ")");
		System.out.println("(64, 4)(" + isPowerOf(64, 4) + ")");

	}

	private static boolean isPowerOf(int a, int b) {

		int tempA = a;
		while (tempA % b == 0) {
			tempA = tempA / b;
		}
		if (tempA == 1) {
			return true;
		}

		int tempB = b;
		while (tempB % a == 0) {
			tempB = tempB / b;
		}
		return tempB == 1;
	}

}
