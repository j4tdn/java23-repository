package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	/*
	 * cau 5 switch case ---- Bài toán ngày trong tuần, cuối tuần Số ngày mỗi tháng
	 * trong năm
	 * 
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(1, 10);
		// Giá trị mệnh đề case bắt buộc khác nhau
		// Lưu ý : Nếu không có break, khi switch case đúng giá tri -> không kiểm tra
		// các case bên dưới
		// thoát ra khi gặp từ khóa break gần nhất hoặc hết sswitch /case/default
		// ----------------------------------------
		switch (a) {
		case 1:
			System.out.println("So Một");
			break; // trong mệnh đề switch case nếu gặp break -> thoát khỏi switch case
		case 2:
			System.out.println("So Hai");
			break;
		case 3:
			System.out.println("So Ba");
			break;
		case 4:
			System.out.println("So Bốn");
			break;
		default:
			System.out.println("số không nằm trong phạm vi[1,4]");

		}
		System.out.println("\n=======================\n");

		// Random 1 số nguyên ngẫu nhiên từ [2,8]
		// In ra số đó là ngày trong tuần hay cuối tuần
		// nếu giá trị từ 2-> 6 week day
		// 7-8 -> weekend day
		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("WdAsNumber = " + wdAsNumber);
		String wdAsString = "";
		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			wdAsString = "Week Day";
			break;

		case 7, 8:
			wdAsString = "Weekend Day";
			break;

		}
		System.out.println("WdAsString --> " + wdAsString);

		System.out.println("\n=======================\n");

		// switch/case/default return data
		wdAsString = switch (wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "Week Day";
		case 7, 8 -> "Weekend Day";
		default -> "Invalid Day";
		};
		System.out.println("WdAsString --> " + wdAsString);
	}
}
