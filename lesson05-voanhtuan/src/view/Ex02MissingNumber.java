package view;

public class Ex02MissingNumber {

	public static void main(String[] args) {
		int[] A1 = {3,2,1,6,5};
		int n1 = 6;
		System.out.println("1. Phần tử cần tìm có giá trị: " + getMissingNumber(A1, n1));
		
		int[] A2 = {3,7,9,2,1,6,5,4,10};
		int n2 = 10;
		System.out.println("2. Phần tử cần tìm có giá trị: " + getMissingNumber(A2, n2));

	}

	private static int getMissingNumber(int[] A, int n) {
		// tính tổng phải có của mảng 1 đến n bằng công thức 
		int sum = n * (n + 1) / 2; 
		
		// tổng các phần tử trong array
		int sumOfArray = 0;
		for (int num : A) {
			sumOfArray += num;
		}
		
		// lấy tổng phải có trừ đi tổng trong array sẽ là phần tử còn thiếu
		return sum - sumOfArray;
	}

}
