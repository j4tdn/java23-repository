package view;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println(isHappyNumber(44));
	}

	private static boolean isHappyNumber(Integer number) {
		// cộng từng chữ số -> kq -> cộng -> kq -> cộng -> 1
		int count = 0;
		do {
			int temp = sumSquare(number);
			number = temp;
//			System.out.println(number);
			count++;
			if(sumSquare(number) == 1)
				return true;
		} while (count < 100); // 100 lần -> vô hạn
		return false;
	}

	private static int sumSquare(Integer num) {
		int sum = 0;
		while (num > 0) {
			int n = num % 10; // 525 -> 5 -> 2 -> 5
			sum += n * n;
			num /= 10;
//			System.out.println("sum = " + sum);
		}
		return sum;
	}
}
