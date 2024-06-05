package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class Ex01IfElse {

	public static void main(String[] args) {
		
		Random rd = new Random();
//		
//		int a = rd.nextInt(5, 20);
//		System.out.println("Number ->"+ a);
//		if(a%2 == 0)
//			System.out.println("Result -->"+ (Year.now().getValue() + a));
//		
		//ex02
//		Scanner ip = new Scanner(System.in);
//		System.out.println("Enter password: ");
//		String password = ip.nextLine();
//		if(password.length() >= 8)
//			System.out.println("Password is valid");
//		else
//			System.err.println("Password is invalid");
//		
//		ip.close();
		
		//ex03
		
		 
		float a = rd.nextFloat(0, 10);
		BigDecimal bdAvgPoint = BigDecimal.valueOf(a).setScale(1, RoundingMode.HALF_UP);
		System.out.println("avgPoint = "+ bdAvgPoint);
		float rounderAvgPoint = bdAvgPoint.floatValue();
		if(rounderAvgPoint < 5)
			System.out.println("Yếu");
		else if(rounderAvgPoint <6.5)
			System.out.println("Trung Bình");
		else if(rounderAvgPoint < 8)
			System.out.println("Khá");
		else
			System.out.println("Giỏi");
		
		getRank(rounderAvgPoint);
		
	}
	private static String getRank (float rounderAvgPoint) {
		if(rounderAvgPoint < 5)
			return "Yếu";
		if(rounderAvgPoint < 6.5)
			return "Trung Bình";
		if(rounderAvgPoint < 8)
			return "Khá";
		return "Giỏi";
		
	}
}
