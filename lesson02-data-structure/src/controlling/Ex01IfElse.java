package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random();
		/*
		 * // b1 int a = rd.nextInt(5, 20);
		 * 
		 * // expression: a%2 == 0 // if(isEven) // boolean isEven = a%2 == 0; if(a%2 ==
		 * 0) { System.out.println("Giá trị --> " + (Year.now().getValue()+ a)); }
		 * 
		 * // b2
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Nhập mật khẩu: "); String password = sc.nextLine();
		 * 
		 * if(password.length() >= 8) { System.out.println("Mật khẩu hợp lệ."); } else {
		 * System.err.println("Mật khẩu không hợp lệ. Vui lòng nhập lại."); }
		 */
		// b3
		float avgPoint = rd.nextFloat(0, 10);
		System.out.println("Average point: " + avgPoint);

		// Làm tròn 1 chữ số thập phân, kết quả commercial round
		// 2.352(2.4) 8.8122(8.8) 7.491(7.5) 9.92(9.9) 9.97 (10.0)

		// Chia làm 2 phần
		// + làm tròn mấy chữ số: scale
		// + Chế độ làm tròn: rounding mode

		// Integer --> int value
		// String --> char[] value
		// BigDecimal --> double value
		BigDecimal bdAvgPoint = BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP);
		System.out.println("bdAvgPoint: " + bdAvgPoint);

		// dùng biển để xử lí
		float roundedAvgPoint = bdAvgPoint.floatValue();
		System.out.println("Rounded Average Point: " + roundedAvgPoint);

		String ranking = "";
		if (roundedAvgPoint < 5) {
			ranking = "Yếu";
		} else if (roundedAvgPoint < 6.5) {
			ranking = "Trung bình";
		} else if (roundedAvgPoint < 8) {
			ranking = "Khá";
		} else {
			ranking = "Giỏi";
		}
//		sc.close();
		System.out.println("Ranking: " + ranking);
		System.out.println("Ranking: " + getRank(roundedAvgPoint));
	}
	private static String getRank(float roundedAvgPoint) {
		if(roundedAvgPoint < 5)
			return "Yếu";
		if(roundedAvgPoint < 6.5)
			return "Trung bình";
		if(roundedAvgPoint < 8)
			return "Khá";
		return "Giỏi";
	}
}
