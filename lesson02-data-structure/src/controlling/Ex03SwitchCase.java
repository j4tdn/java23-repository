package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		Random rd = new Random();

		int a = rd.nextInt(1, 5);

		System.out.println("Giá trị a = " + a);

		// Giá trị trong mệnh đề case bắt buộc phải khác nhau
		// Khi switch case đúng giá trị -> ko kiểm tra các case bên dưới nữa
		// Thoát ra khi gặp từ khóa break gần nhất hoặc hết switch/case/default
		switch (a) {
		case 1:
			System.out.println("Số một");
			// break;//Trong mệnh đề switch case nếu gặp break -> thoát khỏi switch case
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
			System.out.println("Số không nằm trong giá trị [1, 4]");
		}
		// Random 1 số nguyên ngẫu nhiên từ [2, 8]
		// In ra số đó là ngày trong tuần hay cuối tuần
		// Nếu ra giá trị từ 2-6 -> Week day
		// Nếu ra giá trị từ 7-8 -> Weekend day
		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("wdAsNumber = " + wdAsNumber);
		String wdAsString = "";
		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			wdAsString = "Week Day";
			break;
		case 7, 8:
			wdAsString = "Weekend Day";
			break;
		}
		System.out.println("wdAsString1 -->" + wdAsString);

		System.out.println("\n--------------------------\n");

		// Switch/case/default return data
		wdAsString = switch (wdAsNumber) {
			case 2, 3, 4, 5, 6 -> "Week Day";
			case 7, 8 -> "Weekend Day";
			default -> "Invalid Day";

		};
		System.out.println("wdAsStrings -->" + wdAsString);
	}

}
