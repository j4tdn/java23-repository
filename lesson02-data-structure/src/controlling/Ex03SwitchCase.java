package controlling;

import java.util.Random;

public class Ex03SwitchCase {

		/*
		 
		 */
		
	public static void main(String[] args) {
		Random rd = new Random();
		// int a = rd.nextInt(1, 5); // [1,5)
		
		int a = 2;
		
		System.out.println("Giá trị a = " + a);
		
		// các giá trị trong mệnh đề case bắt buộc phải khác nhau
		// khi switch case đùng giá trị -> không kiểm tra các case bên dưới nữa
		// thoát ra khi gặp từ khóa break gần nhất hoặc hết switch/case/default
		
		// Câu 1: In ra từ tươn ứng với số
		switch (a) {
		case 1:
			System.out.println("Số Một");
			// break; // trong mện đề switch case nếu gặp break -> thoát khỏi switch case
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
			System.out.println("Số không phạm vi [1, 4]");
		}
		
		// Random 1 số ngẫu nhiên từ [2,8]
		// In ra số đó là ngày trong tuần hay cuối tuần
		// Nếu giá trị từ 2-6 -> week day
		//				  7-8 -> weekend
		
		int wdAsNumber = rd.nextInt(2, 8);
		System.out.println("wdAsNumber = " + wdAsNumber);
		
		// Khi block code trong các case trùng nhau
		String wdAsString = "";
		switch (wdAsNumber) {
		case 2, 3, 4, 5, 6:
			wdAsString = "Week Day";
			break;
		case 7, 8:
			wdAsString = "Weekend Day";
			break;
		}
		System.out.println("WdAsString1 -->" + wdAsString);
		System.out.println("\n============================\n");
		wdAsString = switch(wdAsNumber) {
		case 2, 3, 4, 5, 6 -> "Week Day";
		case 7,8 -> "Weekend Day";
		default -> "Invalid Day";
		};
		System.out.println("WdAsString --> " + wdAsString);
	
	}
}
