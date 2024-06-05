package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = rd.nextInt(5,20);
		
		Scanner sc = new Scanner(System.in);
		
//		if(a%2 == 0) {
//			System.out.println(a + " là số chẵn!");
//			System.out.println(Year.now().getValue());
//		}
//		else {
//			System.out.println(a + "là số lẻ!");
//		}
//		
//		
//		//câu 2:
//		
//		
//		System.out.println("Enter password: ");
//		String pass = sc.nextLine();
//		
//		if(pass.length()>=8) {
//			System.out.println("Password is valid");
//		}
//		else {
//			System.err.println("Password is invalid");
//		}

		//câu 3:
		float avg = rd.nextFloat(0,10);
		System.out.println("Avg point: " + avg);
		
		BigDecimal bdAvgPoint = BigDecimal.valueOf(avg).setScale(1, RoundingMode.HALF_EVEN);
		
		float roundedAvgPoint = bdAvgPoint.floatValue();
				
		System.out.println(roundedAvgPoint);
		
		if(roundedAvgPoint<5) {
			System.out.println("Yếu");
		}
		else if(roundedAvgPoint < 6.5) {
			System.out.println("TB");
		}
		else if(roundedAvgPoint < 8) {
			System.out.println("Khá");
		}
		else {
			System.out.println("Giỏi");
		}
		
		String rank = getRank(roundedAvgPoint);
		System.out.println("Ranking: " + rank);
		
		
//		sc.close();
	}
	//or do by function:
	private static String getRank(float d) {
		if (d < 5) {
			return "yếu";
		}
		
		if (d<6.5) {
			return "khá";
		}
		
		if (d<8) {
			return "khá";
		}
		
		return "giỏi";
	}
}
