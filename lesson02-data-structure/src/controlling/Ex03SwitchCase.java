package controlling;

import java.util.Random;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		// Ngày trong tuần
		
		// thứ 2 đến cn
		// thứ 2 (2),...cn(8)
		int weekday = new Random().nextInt(2, 10);
		switch(weekday) {
		case 2:
			System.out.println("Thứ hai");
			break;
		case 3:
			System.out.println("Thứ ba");
			break;
		case 4:
			System.out.println("Thứ tư");
			break;
		case 5:
			System.out.println("Thứ năm");
			break;
		case 6:
			System.out.println("Thứ sáu");
			break;
		case 7:
			System.out.println("Thứ bảy");
			break;
		case 8:
			System.out.println("Chủ nhật");
			break;
		default:
			System.out.println("Không hợp lệ!");
		}
		/*
		 String s = switch(weekday) {
		 	case 2,3,4,5,6 -> "Ngày trong tuần";
		 	case 7,8 -> "Ngày cuối tuần";
		 	default -> "Không hợp lệ";
		 };
		 System.out.println(" s -------> " + s);
		 */
		System.out.println("Exit");
	}
}
