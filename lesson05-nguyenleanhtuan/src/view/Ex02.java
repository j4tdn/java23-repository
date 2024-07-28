package view;

public class Ex02 {
	public static void main(String[] args) {
		int a1[] = { 3, 2, 1, 6, 5 };
		System.out.println(getMissingNumber(6, a1));
		int a2[] = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println(getMissingNumber(10, a2));

	}

	public static int getMissingNumber(int n, int a[]) {
		int sum = n * (n + 1) / 2;

		int arraySum = 0;
		for (int num : a) {
			sum -= num;
		}
		
		return sum;
	}
}
