package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	/*
	 * Câu 5: Switch Case ---- Bài toán ngày trong tuần, cuối tuần Số ngày mỗi tháng
	 * trong năm
	 */

	public static void main(String[] args) {

		Random rd = new Random();
		// int a = rd.nextInt(1, 10); // [1, 10)

		int a = 2;

		System.out.println("Giá trị a = " + a);

		// Giá trị trong mệnh đề case bắt buộc phải khác nhau
		// Khi s.case đúng giá trị -> khong kiểm tra các case bên dưới nữa
		// Thoát ra khi gặp từ khóa break gấn nhất hoặc hết switch/case/default

		// Câu 1: In ra từ tương ứng với số
		switch (a) {
		case 1:
			System.out.println("Số Một");
			// break; // trong mệnh đề switch case nếu gặp break -> thoát khởi switch case
		case 2:
			System.out.println("Số Hai");
			// break;
		case 3:
			System.out.println("Số Ba");
			// break;
		case 4:
			System.out.println("Số Bốn");
			break;

		default:
			System.out.println("Số không nằm trong phạm vi [1, 4]");

		}
		System.out.println("\n===========================\n");
		// Random 1 số nguyên ngẫu nhiên từ [2,8]
		// In ra số đó là ngày trong tuấn hay cuối tuần
		// Nếu giá trị từ 2-6 -> week day
		//                7-8 -> weekend day
		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("wdAsNumber = " + wdAsNumber);

		// khi block code bên trong các case trùng nhau
		String wdAsString = "";
		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			System.out.println("Week Day");
			break;
		case 7, 8:
			System.out.println("Weekend Day");
			break;
		}
		System.out.println("WdAsString1 --> " + wdAsString);

		System.out.println("\n===================\n");

		// switch/case/default return data
		wdAsString = switch (wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "Week Day";
		case 7, 8 -> "Weekend Day";
		default -> "Invalid Day";

		};
		System.out.println("WdAssStrings --> " + wdAsString);

	}

}
