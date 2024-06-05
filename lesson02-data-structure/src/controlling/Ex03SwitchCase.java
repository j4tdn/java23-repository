package controlling;

import java.util.Random;

public class Ex03SwitchCase {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int a = rd.nextInt(1,10); // [1, 5)
		System.out.println("Giá trị a = " + a);

		// Giá trị trong mệnh đề case bắt buộc phải khác nhau
		// Khi switch case đúng giá trị --> ko kiểm tra case bên dưới nữa
		// thoát ra khi gặp từ khóa break gần nhất hoặc hết switch/case/default
		
		// Câu 1: In ra từ tương ứng với sô
		switch(a) {
		case 1:
			System.out.println("Số Một");
			break; // trong mệnh đề switch case nếu gặp break -->thoát khỏi switch case
		case 2: 
			System.out.println("Số Hai");
			break;
		case 3: 
			System.out.println("Số Ba");
			break;
		case 4: 
			System.out.println("Số Bốn");
			break;
		default:
			System.out.println("Số không nằm trong phạm vi [1, 4]");
		}
		
		System.out.println("\n==================\n");
		
		// Random 1 số nguyên ngẫu nhiên từ 2 --> 8
		// In ra số đó là ngày trong tuần hay cuối tuần
		// nếu giá trị từ 2-6 --> weekday
		// nếu giá trị từ 7-8 --> weekend day
		
		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("WdAsNumber = " + wdAsNumber);
		switch(wdAsNumber) {
		case 2:
			System.out.println("Week Day");
			break;
		case 3:
			System.out.println("Week Day");
			break;
		case 4:
			System.out.println("Week Day");
			break;
		case 5:
			System.out.println("Week Day");
			break;
		case 6:
			System.out.println("Week Day");
			break;
		case 7:
			System.out.println("Weekend Day");
			break;
		case 8:
			System.out.println("Weekend Day");
			break;
		}
		
		// khi block code bên trong các case trùng nhau
		String wdAsString = "";
		switch(wdAsNumber) {
		case 2,3,4,5,6:
			wdAsString = "Week Day";
			break;
		case 7,8:
			wdAsString = "Weedend Day";
			break;
		}
		System.out.println("WdAsString1 --> " + wdAsString);
		
		System.out.println("\n==================\n");
		
		wdAsString = switch(wdAsNumber) {
			case 2,3,4,5,6 -> "Week Day";
			case 7,8 -> "Weekend Day";
			default -> "Invalid Day";
		};
		System.out.println("WdAsString2 --> " + wdAsString);
		
	}
}
