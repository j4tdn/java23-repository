import java.util.Scanner;

public class Ex01IsPowerOf {

	public static boolean isPowerOf(int a, int b) {
		if (b == 1) {
			return a == 1;
		}

		if (a <= 0 || b <= 0) {
			return false;
		}

		while (a >= b) {
			if (a == b) {
				return true;
			}
			if (a % b != 0) {
				return false;
			}
			a /= b;
		}

		return a == 1;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập số a: ");
		int a = ip.nextInt();

		System.out.print("Nhập số b: ");
		int b = ip.nextInt();

		boolean result = isPowerOf(a, b);
		System.out.println("Kết quả: " + result);
	}
}
