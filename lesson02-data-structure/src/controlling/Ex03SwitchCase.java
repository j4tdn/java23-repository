package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(1, 6);

		System.out.println("Gia tri a = " + a);
//	Giá trị trong mệnh đề cáe bắt buộc phải khác nhau
//	thoát ra khi gặp từ khóa break gần nhất hoặc hết switch/case/default
//	khi switch case đúng giá trị -> ko kiểm tra các case bên dưới nữa

		switch (a) {
		case 1:
			System.out.println("Số Môt");
			break; // trong mệnh đề switch cáe nếu găpj beak --> thoát khỏi switch case
		case 2:
			System.out.println("Số Hai");
			// break;
		case 3:
			System.out.println("Số Ba");
			break;
		case 4:
			System.out.println("Số Bon");
			break;
		default:
			System.out.println("So khong nam trong pham vi [1, 4]");
		}
		// random 1 số nguyên ngẫu nhiên từ [2, 8]
		// In ra số đó là ngày trong tuần hay cuối tuần
		// nếu giá trị từ 2-6 -> weekday
		// 7-8 --> weekend day

		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("wsAsNumber = " + wdAsNumber);

		// khi block code bên trong các case trùng nhau
		String wdAsString = "";
		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			wdAsString = "Weekday";
			break;
		case 7, 8:
			wdAsString = "Weekendday";
			break;

		}
		System.out.println("wdAsString " + wdAsString);

		System.out.println("====================");

		// switch/case/default return data
		wdAsString = switch (wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "Week Day";
		case 7, 8 -> "Weekend Day";
		default -> "Invalid Day";
		};
		System.out.println("wdAsStrings --> " + wdAsString);
	}
}
