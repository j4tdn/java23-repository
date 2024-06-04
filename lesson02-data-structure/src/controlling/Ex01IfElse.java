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
		int number = rd.nextInt(5, 20);
		System.out.println("number => " + number);
		
		// expression: number % 2 == 0
		// if (isEven == true) <--> if (isEven)
		// if (isEven == false) <--> if (isEven)
		// boolean isEven = number % 2 ==0;
		
		if (number % 2 == 0) {
			System.out.println("Giá trị --> " + (Year.now().getValue() + number));
			
		}
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = ip.nextLine();
		
		if (password.length() >= 8) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid, please enter again");
		}
		ip.close();
		}
		*/
		
		float avgPoint = rd.nextFloat(0, 10);
		System.out.println("Average point: " + avgPoint);
		
		// Làm tròn 1 chữ số thập phân, kết quả commercial round
		//
		// Chia làm 2 phần
		// + Làm tròn mấy chữ số: scale
		// + Chế độ làm tròn: rounding mode
		
		// Integer --> int value
		// String --> char [] value;
		// BigDecimal --> --> double value;
		BigDecimal bdAvgPoint = BigDecimal.valueOf(avgPoint)
									.setScale(1, RoundingMode.HALF_UP);
	
		float roundedAvgPoint = bdAvgPoint.floatValue();
										
		System.out.println("Rounded average Point: " + roundedAvgPoint);
		
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
		 
		System.out.println("Ranking --> " + ranking);
		System.out.println("Ranking --> " + getbank(roundedAvgPoint));
		
	}
	
	private static String getbank(float roundedAvgPoint) {
		if (roundedAvgPoint < 5) {
			return "Yếu";
		}
		if (roundedAvgPoint < 6.5) {
			return "Trung bình";
		}
		if (roundedAvgPoint < 8) {
			return "Khá";
		}
			return "Giỏi";
		}
	}

