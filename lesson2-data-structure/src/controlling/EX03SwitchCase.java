package controlling;

import java.util.Random;

public class EX03SwitchCase {

	public static void main(String[] args) {

		Random rd = new Random();
		int a = rd.nextInt(1, 10);

		a = 2;

		System.out.println("gia tri a" + a);

		// khi switch case đúng giá trị -> ko kiểm tra các cáe bên dưới nữa
		// giá trị cáe bắt buộc phải khác nhau
		// thoát ra khi găo từ khoá break gần nhất hoặc hết switch / case

		switch (a) {
		case 1:
			System.out.println("so mot");
			break;
		case 2:
			System.out.println("so hai ");
			break;

		case 3:
			System.out.println("so ba ");
			break;
		case 4:
			System.out.println("so bon ");
			break;

		default:
			System.out.println(" so trong pham vi [1,4]");

		}
		System.out.println("===============");
		// Random 1 so ngaau nhien tu 2 -8
		// in ra cái số đó là ngày trong tuần hay cuối tuần
		// nếu giá trị từ 2-6 -> week day
		// 7-8 -> weekenday
		int wdAsNumber = rd.nextInt(2, 9);

		System.out.println("wdAsNumber = " + wdAsNumber);
		String wdAsString = "";

		switch (wdAsNumber) {
		case 2:
			System.out.println("Week day  ");
			break;
		case 3:
			System.out.println("Week day ");
			break;
		case 4:
			System.out.println("Week day  ");
			break;
		case 5:
			System.out.println("Week day  ");
			break;
		case 6:
			System.out.println("Week day  ");
			break;
		case 7:
			System.out.println("Weekend day ");
			break;
		case 8:
			System.out.println("Weekend day  ");
			break;
		}

		System.out.println("=================  ");

		wdAsString = switch (wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "Week day";
		case 7, 8 -> "Weekend day";
		default -> "Invalid Day";

		};
		System.out.println(" wdAsString --> " + wdAsString);

		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			wdAsString = "Week day";
			break;

		case 7, 8:
			wdAsString = "Weekend day";
			break;
		}
	}

}
