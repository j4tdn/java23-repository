package view;

import java.util.Scanner;

public class Ex01Multiple {

	/*
	 Kiểm tra số nguyên tố N có phải là booik=j của 2 hay ko
	 Yêu cầu: N là số nguyên dương đc nhập từ bàn phím, 
	 		  Bắt buộc nhập lại nếu N ko hợp lệ (tối đa 5 lần)
	 */
		
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter N = ");
		
		// kiểm tra đến khi nào text nhập vào là 1/chuỗi số --> gọi hàm parseInt để convert qua
		
		String text = "";
		int wrongTimes = 0;
		
		while(true) {
			text = ip.nextLine();
			if (isNumber(text)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("--> Wrong times = 5 --> exit");
				System.exit(0); // thoát chương trình
				// return; // kết thúc hàm trả về void
			} 
			System.out.println("Invalid number(" + wrongTimes + " times(s)), enter again N = ");
		}
		
		int number = Integer.parseInt(text);
		
		System.out.println("==> Is " + number + " multiple of 2 --> " + isMultipleOf2(number));
	}
	
	// biến đối tượng gọi hàm --> non-static --> HEAP
	// biến null --> chưa trỏ đến HEAP
	// gọi hàm --> NPE
	
	// abc 55at 12
	private static boolean isNumber(String text) {
		if (text == null || text.isEmpty()) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
	
	// require n > 0
	private static boolean isMultipleOf2(int n) {
		return n % 2 == 0;
	}
}
