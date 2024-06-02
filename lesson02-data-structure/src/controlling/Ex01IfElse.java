package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {

	public static void main(String[] args) {
		Random rd = new Random();
		
		/*
		 Câu 1
		 ------
		 Random 1 số nguyên ngẫu nhiên từ [5, 20)
		 Kiểm tra số nguyên đó có phải là số chẵn không
		 Nếu là số chẵn thì sẽ in ra năm hiện tại + số chẵn đó
		 Nếu không --> không làm gì cả
		 */
		
		/*
		int number = rd.nextInt(5, 20);
		System.out.println("Number => " + number);
		// expression: number % 2 == 0
		// if (isEven == true)  <--> if (isEven)
		// if (isEven == false) <--> if (!isEven)
		// boolean isEven = number % 2 == 0;
		
		if (number % 2 == 0) {
			System.out.println("Result --> " + (Year.now().getValue() + number));
		}
		*/
		
		/*
		 Câu 2
		 ------
		 Nhập vào mật khẩu, kiểm tra đồ dài mật khaair có hợp lệ hay không
		 Nếu độ dài mật khẩu >= 8 --> in ra mật khẩu hợp lệ
		 Ngược lại --> in ra mật khẩu không hợp lệ, vui lòng nhập lại
		 
		 */
		
		/*
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = ip.nextLine();
		
		if (password.length() >= 8) {
			System.out.println("Password is valid");
		} else {
			System.err.println("Password is invalid, please enter again");
		}
		
		ip.close();
		*/
		
		/*
		 Câu 3
		 ------
		 Random số điểm trung bình (số thực) của học sinh [0.0, 10.0]
		 KQ: số k biết số thập phân bao nhiêu, làm trong lấy 1 chữ số thập phân
		 Nếu điểm:
		 	+ [0, 5)   : Yếu
		 	+ [5, 6.5) : Trung Bình
		 	+ [6.5, 8) : Khá
		 	+ [8, 10)  : Giỏi
		 */
		
		float avgPoint = rd.nextFloat(0, 10);
		System.out.println("Average point: " + avgPoint);
		
		// làm tròn 1 chữ số thập phân, kết quả là commercial round
		// 2.352(2.4) 8.8122(8.8) 7.491(7.5) 9.92(9.9) 9.97(10)
		// chia làm 2 phần
		// 	+ làm trong mấy chữ số: scale
		//	+ chế độ làm trong: rounding mode
		
		// Integer --> int value;
		// String --> char[] value;
		// BigDecimal --> double value
		BigDecimal bdAvgPoint = BigDecimal.valueOf(avgPoint)
									.setScale(1, RoundingMode.HALF_UP);
		
		// dùng biến này để xử lý
		float roundedAvgPoint = bdAvgPoint.floatValue();
		
		System.out.println("Rounded average point: " + roundedAvgPoint);
		
		String ranking ="";
		
		if (roundedAvgPoint < 5 ) {
			ranking = "Yếu";
		} else if (roundedAvgPoint < 6.5) {
			ranking = "Trung Bình";
		} else if (roundedAvgPoint < 8) {
			ranking = "Khá";
		} else {
			ranking = "Giỏi";
		}
		System.out.println("Ranking --> " + ranking);
		System.out.println("Ranking --> " + getRank(roundedAvgPoint));
	}
	
	private static String getRank(float roundedAvgPoint) {
		if (roundedAvgPoint < 5 ) {
			return "Yếu";
		}
		if (roundedAvgPoint < 6.5) {
			return "Trung Bình";
		}
		if (roundedAvgPoint < 8) {
			return "Khá";
		}
		return "Giỏi";
	}
	
}
