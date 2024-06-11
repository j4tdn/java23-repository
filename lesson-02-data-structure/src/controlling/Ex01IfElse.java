package controlling;

import java.awt.geom.RoundRectangle2D;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		System.out.println(number);
		
		boolean isEven = number %2 == 0;
		if (number %2 == 0) {
			System.out.println("Result --> " + (Year.now().getValue()) + number);
			
		}
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password: ");
		String pass = ip.nextLine();
		
		if (pass.length() >= 8) {
			System.out.println("Password is valid");
		}
		else {
			System.err.println("Password is invalid, please enter again");
		}
		
		float avgPoint = rd.nextFloat(0, 10);
		System.out.println("Average point: "+ avgPoint);
		
		BigDecimal bdAvgPoint = BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP);
		float roundedAvgPoint = bdAvgPoint.floatValue();
		System.out.println("Rounded average point: " + roundedAvgPoint);
		
		String ranking = "";
		if (roundedAvgPoint < 5) {
			ranking = "Yeu";
			
		} else if (roundedAvgPoint < 6.5) {
			ranking = "Trung binh";
		} else if (roundedAvgPoint < 8) {
			ranking = "Kha";
		} else  {
			ranking = "Gioi";
		}
		System.out.println("Ranking -->" + ranking);
		System.out.println("Ranking --> " + getRank(roundedAvgPoint));
		
		
	}

	private static String getRank(float roundedAvgPoint) {
		// TODO Auto-generated method stub
		if (roundedAvgPoint < 5) {
			return "Yeu";
		}
		if (roundedAvgPoint < 6.5) {
			return "Trung binh";
			
		}
		if (roundedAvgPoint < 8) {
			return "Kha";
		}
		return "Gioi";
	}
}
