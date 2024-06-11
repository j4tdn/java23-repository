package controlling;

import java.util.Random;

/*
 *  Câu 5: Switch Case
 *  -- 
 *  Bài toán ngày trong tuần, cuối tuần
 *  Số ngày mỗi tháng trong năm
 */
public class Ex03SwitchCase {
	public static void main(String[] args) {

		Random rd = new Random();
		int a = rd.nextInt(1, 5);

		System.out.println("Giá trị a =" + a);
		// Câu 1: In ra từ tương ứng với số
		switch (a) {
		case 1:
			System.out.println("Số một");
			break;
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
			System.out.println("Số không nằm trong phạm vi [1, 4]");
		}
		/*
		 * Random 1 số nguyên ngẫu nhiên từ [2,8] In ra số đó là ngày trong tuần hay
		 * cuối tuần nếu giá trị đó từ 2-6 -> weekday 7,8 -> weekend day
		 * 
		 */
		int wdAsNumber = rd.nextInt(2, 9);
		String wdAsString = "";
		System.out.println("\n=============\n");
		System.out.println("wdAsNumber: " + wdAsNumber);
		switch (wdAsNumber) {
		case 2: {
			System.out.println("Week Day");
			break;
		}
		case 3: {
			System.out.println("Week Day");
			break;
		}
		case 4: {
			System.out.println("Week Day");
			break;
		}
		case 5: {
			System.out.println("Week Day");
			break;
		}
		case 6: {
			System.out.println("Week Day");
			break;
		}
		case 7: {
			System.out.println("Weekend Day");
			break;
		}
		case 8: {
			System.out.println("Weekend Day");
			break;
		}
		}
		System.out.println("\n================\n");

		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			wdAsString = "WeekDay";
			break;
		case 7, 8:
			wdAsString = "weekEnd Day";
			break;
		}
		System.out.println("Wd as String 1 --->" + wdAsString);

		System.out.println("\n================\n");

		wdAsString = switch (wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "Weekday";
		case 7, 8 -> "Weekend Day";
		default -> "Invalid Day";
		};
		System.out.println("Wd asStrings => " + wdAsString);

	}
}
