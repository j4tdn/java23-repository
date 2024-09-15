package view;

public class Ex05 {

	public static void main(String[] args) {
		int number = 44; // Kiểm tra số 44 có phải là số hạnh phúc không

		if (isHappyNumber(number)) {
			System.out.println(number + " là số hạnh phúc.");
		} else {
			System.out.println(number + " là số FA.");
		}
	}

	public static boolean isHappyNumber(int number) {
		int[] seenNumbers = new int[1000]; // Mảng lưu các số đã gặp, giới hạn là 1000 số
		int count = 0; // Đếm số phần tử trong mảng

		while (number != 1) {
			if (isInArray(seenNumbers, number, count)) {
				// Nếu số đã gặp trước đó, tức là rơi vào chu kỳ
				return false;
			}

			// Thêm số vào mảng và tăng chỉ số
			seenNumbers[count] = number;
			count++;

			// Tính tổng bình phương các chữ số
			number = getSumOfSquares(number);
		}

		return true; // Nếu kết thúc với số 1, là số hạnh phúc
	}

	// Hàm kiểm tra số đã có trong mảng hay chưa
	public static boolean isInArray(int[] array, int number, int size) {
		for (int i = 0; i < size; i++) {
			if (array[i] == number) {
				return true; // Nếu tìm thấy số trong mảng
			}
		}
		return false;
	}

	// Hàm tính tổng bình phương các chữ số của số
	public static int getSumOfSquares(int number) {
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum += digit * digit;
			number /= 10;
		}
		return sum;
	}
}
