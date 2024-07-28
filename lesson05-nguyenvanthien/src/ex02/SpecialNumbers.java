package ex02;

public class SpecialNumbers {
	/*
	  Bài 2 (20đ): Viết hàm kiểm tra một số có phải là số đặc biệt không. Biết rằng
	  nếu tổng tất cả các số nguyên từ 1 đến n bằng S thì S là số đặc biệt. Ví dụ ▪
	  1 → 1 ▪ 3 → 1 + 2 ▪ 6 → 1 + 2 + 3 ▪ 10 → 1 + 2 + 3 + 4
	 */
	public static void main(String[] args) {

		printTriangularSequence(1);
		printTriangularSequence(3);
		printTriangularSequence(6);
		printTriangularSequence(10);

	}

	public static void printTriangularSequence(int S) {
		int n = findTriangularNumber(S);
		if (n > 0) {
			System.out.print(S + " -> ");
			for (int i = 1; i <= n; i++) {
				System.out.print(i + (i == n ? "" : "+"));
			}
			System.out.println();
		} else {
			System.out.println(S + " khong phai la so dac bie");
		}
	}

	public static int findTriangularNumber(int S) {
		double n = (-1 + Math.sqrt(1 + 8 * (double) S)) / 2;
		if (n == (int) n) {
			return (int) n;
		}
		return -1;
	}
}