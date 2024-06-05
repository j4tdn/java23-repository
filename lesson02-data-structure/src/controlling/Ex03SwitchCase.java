package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(1, 10);

		System.out.println("Giá trị a = " + a);

		// Gía trị trong mệnh đề case bắt buộc phải khác nhau
		// khi switch case đúng giá trị -> ko kiểm tra các case bên dưới nữa
		// thoát ra khi gặp từ khóa break gần nhất hoặc hết switch/case/default

		// câu 1: In ra từ tương ứng với số
		switch (a) {
		case 1:
			System.out.println("Số một");
			break; // trong mệnh đề switch case nếu gặp break -> thoát khỏi switch case
		case 2:
			System.out.println("Số hai");
			break;
		case 3:
			System.out.println("Số ba");
			break;
		case 4:
			System.out.println("Số bốn");
			break;
		default:
			System.out.println("Số ko nằm trong phạm vi từ [1,4]");
		}

		// random 1 số nguyên ngẫu nhiên từ [2,8]
		// in ra số đó là ngày trong tuần hay cuối tuần
		// nếu giá trị từ 2-6 -> week day
		// 				  7,8 -> weeekend day

		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("\nwdAsNumber = " + wdAsNumber);

		// khi block code bên trong các case trùng nhau
		String wdAsString = "";
		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			wdAsString = "Week day";
			break;
		case 7, 8:
			wdAsString = "Weekend day";
			break;
		}

		System.out.println("\nwdAsString1 = " + wdAsString);

		wdAsString = switch (wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "Week day";
		case 7, 8 -> "Weekend day";
		default -> "Invalid Day";
		};
		System.out.println("wdAsString2 = " + wdAsString);
	}
}
