package utils;
	/*
	 khi 1 đoạn code/hàm có thể được sử dụng ở nhiều chỗ
	 có thể di chuyển hàm đó vào clas ulti(utility)
	 utility class là class -> có các utility methods
	 được gọi sử dụng ở nhiều chỗ
		
	 thường những hàm này chỉ phụ thuộc vào tham số truyền vào
	 --> static, public
	 
	 UtilClass -> UtilMethod -> Lấy class gọi, ko cần đối tượng
	 
	 Mặc định class có public constructor -> vẫn new đối tượng được, 
	 thừa ko cần, cho private constructor cho ultil để không được phép tạo đối tượng
	*/

import java.util.Scanner;

public class IoUtils {
	
	private static Scanner ip = new Scanner(System.in);
	
	private IoUtils() {	
	}
	
	public static int input(int maxWrongTimes) {
		System.out.print("Enter N = ");
		String text = "";
		int numberOfWrongInput = 0;
		
		// Kiem tra den khi nao text nhap vao la 1 chuoi so --> goi ham parseInt de convert tu text qua int
		while (true) {
			text = ip.nextLine(); // nhap text = so
			if (isNumber(text)) { // check co phai so hay khong
				break; // so thi break ra khoi vong lap
			}
			numberOfWrongInput++;
			if (numberOfWrongInput == maxWrongTimes) {
				System.out.println("Wrong times = "+ maxWrongTimes+ " --> Exit program!");
				System.exit(0); // thoat chuong trinh
//				return; 		// hoac ket thuc ham tra ve void
			}
			System.out.print("Invalid number ( " + numberOfWrongInput + " time(s) ). Please enter again!\nN = "); // khong phai so thi xuon day, xong bat dau lai vong lap	
		}
		
		return Integer.parseInt(text); // parseInt de convert tu text qua int
	}
	
	private static boolean isNumber(String text) {
		if(text == null || text.isEmpty()) {
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
	
}
