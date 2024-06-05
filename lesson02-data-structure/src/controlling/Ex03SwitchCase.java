package controlling;

import java.util.Random;

public class Ex03SwitchCase {
// Bài tập random 1 số ngẫu nhiên 
	public static void main(String[] args) {
		Random rd = new Random();
		int a = 2;
//		giá trị trong mệnh đề case bắt buộc phải khác nhau
//		Khi switch case đúng giá trị --> ko kiểm tra các case dưới nữa
//		thoát ra khi gặp từ khóa break gần nhất hoặc hết switch/case/default
//		khi không có break thì khi kiểm tra case 1(n) nếu đúng thì các case phía dưới sẽ không kiểm tra giá trị mà in ra luôn.
		switch (a) {
		case 1:
			System.out.println("Số Một ");
			break;
		case 2:
			System.out.println("Số hai ");
			break;
		case 3:
			System.out.println("Số ba ");
			break;
		case 4:
			System.out.println("Số bốn ");
			break;
		default:
			System.out.println("Số không nằm trong phạm vi [1,4)");
		}
//		Random 1 số nguyên ngẫu nhiên từ 2 đến 8
//		in ra số đó là ngày trong tuần hay cuối tuần nếu giá trị từ 2 đến 6 là trong tuần(weekday), 7-8 là weekend day
		int wdAsNumber = rd.nextInt(2, 9);
		System.out.println("wdAsNumber: " + wdAsNumber);
		switch (wdAsNumber) {
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
		System.out.println("\n===================\n");
		// Cách 2: ngắn gọn hơn, làm cách 2 khi block code của các case trùng nhau

		String wdAsString = "";
		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			wdAsString = "Week Day";
			break;
		case 7, 8:
			wdAsString = "Weekend Day";
			break;
		}
		System.out.println("WdAsNumber: " + wdAsNumber);
		
		System.out.println("\n==========\n");

		// Cách 3:Switch/case/default return
		wdAsString = switch (wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "Week Day";
		case 7, 8 -> "Weekend day";
		default -> "Invaild Day";
		};
		System.out.println("WdAsNumber: " + wdAsNumber);

	}

}