package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Random 1 so ngau nhien tu 5 -> 20
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		// kiem tra so chan
		if(number % 2 == 0) {
			System.out.println("random number is an even number --> " + number);
		}
		System.out.println("line 17 - Finished" );
		//validate (kiem tra tinh hop le) độ dài mật khẩu người dùng nhập vào 
		// nếu độ dài >= 8 ==> Hợp lệ
		// nếu độ dài < 8 ==> k hợp lệ 
		String passwork = "asdee123";
		if(passwork.length() >= 8) {
			System.out.println("passwork is valid");
		}else { 
			System.out.println("passwork is invalid , please enter again");
		}
		// Nhập vào điểm TB của hcoj sinh 
		// Yêu cầu : [0,10]
		// 0 -> 5 : Yếu 
		// 5 -> 6,4 : TB
		// 6.5 - > 7.9 : Khá 
		// 8 -> 10 : Giỏi
		float avgPoint = rd.nextFloat(10.1f);
		if(avgPoint > 10) {
			avgPoint = 10;
		}
		System.out.println("avg point: " + BigDecimal.valueOf(avgPoint).setScale(1,RoundingMode.HALF_DOWN));
		if(avgPoint < 5) {
			System.out.println("Yeu");
		} else if(avgPoint < 6.5) {
			System.out.println("TB");
		} else if(avgPoint < 8) {
			System.out.println("Kha");
		}else {
			System.out.println("Gioi");
		}
		// toán tử 3 ngôi 
		// exp1 ? exp2|stm2 : exp3|stm3
		/*
		 * if(exp1 == ture){
		 * exp2|stm2;
		 * } else exp3|stm3;
		 * 
		 */
		// VD tim max a,b
		int a = 7;
		int b = 2;
		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);
		System.out.println("min --> " + (a > b ? b : a));
	}
	//
}
