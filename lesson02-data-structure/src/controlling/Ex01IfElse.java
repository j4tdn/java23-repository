package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {

	public static void main(String[] args) {

		/*
		 Câu 1
		 ------
		 Random 1 số nguyên ngẫu nhiêu từ [5, 20)
		 Kiểm tra số nguyên đó có phải là số chẵn không
		 Nếu là số chẵn thì sẽ in ra năm hiện tại + số chẵn đó
		 Nếu ko phải --> ko in ra ko làm gì cả
		 
		 */
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		System.out.println("number => " + number);

		if (number % 2 == 0) {
			System.out.println("Gia tri --> " + (Year.now().getValue() + number));
		}

		/*
		 Câu 2
		 ------
		 Nhập vào mật khẩu, kiểm tra độ dài của mật khẩu có hợp lệ hay không
		 Nếu độ dài của mật khẩu >= 8 --> in ra mật khẩu hợp lệ
		 Ngược lại --> in ra mật khẩu ko hợp lệ, vui lòng nhập lại
		 
		 */
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter password: ");
		String password = ip.nextLine();

		if (password.length() >= 8) {
			System.out.println("Password is valid");
		} else {
			System.err.println("Password is invalid, please enter again");
		}

		ip.close();

		/*
		 
		 Câu 3
		 ------
		 Random điểm trung bình(số thực) của học sinh [0.0, 10.0]
		 KQ: số ko biết dc số thập phân bao nhiêu, làm tròn lấy 1 chữ số thập phân
		 Nếu điểm mà
		 + [0, 5)   : Yếu
		 + [5, 6.5) : Trung Bình
		 + [6.5, 8) : Khá
		 + [8, 10]  : Giỏi
		 */
		
		float avgPoint = rd.nextFloat(0, 10);
		System.out.println("Average point: " + avgPoint);

		// Lam tron 1 chu so thap phan, ket qua commercial round
		// Chia lam 2 phan
		// + Lam tron may chu so: scale
		// + Che do lam tron: rounding mode

		// Integer --> int value
		// String --> char[] value
		// BigDecimal --> double value

		BigDecimal bdAvgPoint = BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP);
		
		//dung bien nay de xu ly
		float roundedAvgPoint = bdAvgPoint.floatValue();
		System.out.println("Rounded average point: " + roundedAvgPoint);

		String string = "";

		if (roundedAvgPoint < 5) {
			string = "Yeu";

		} else if (roundedAvgPoint < 6.5) {
			string = "Trung binh";
		} else if (roundedAvgPoint < 8) {
			string = "Kha";
		} else {
			string = "Gioi";
		}
		
		System.out.println("Ranking --> " + string);
	//	System.out.println("Ranking --> " + getRank(roundedAvgPoint));
		
	}
	
	private static String getRank(float roundedAvgPoint) {
		if (roundedAvgPoint < 5) {
			return "Yếu";
		}
		if (roundedAvgPoint < 6.5) {
			return  "Trung bình";
		} 
		if (roundedAvgPoint < 8) {
			return "Khá";
		}
		return "Giỏi";
	}
}
