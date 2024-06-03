package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random();
//		int  number = rd.nextInt(5,20);
//		System.out.println("Number --> "+number);
//		if(number %2 == 0) {
//			System.out.println("Gia tri --> "+(Year.now().getValue()+ number));
//		}
		//c2:

		 
		 float avgPoint = rd.nextFloat(0,10);
		 System.out.println("Average Point" + avgPoint);
		 //lam tron 1 chu  so thap phan
		 //lam tron may chu so: scale
		 //che do lam tron: rounding mode
		
		 BigDecimal bdAvgPoint = BigDecimal.valueOf(avgPoint).setScale(1,RoundingMode.HALF_UP);
		 System.out.println("BdAvgPoint: "+ bdAvgPoint);
		 float roundedAvgPoint = bdAvgPoint.floatValue();
		 System.out.println("Rounded average point: "+roundedAvgPoint);
		 ;
		 String ranking = "";
		 if(roundedAvgPoint<5) {
			 ranking = "yeu";
		 }
		 else if(roundedAvgPoint<6.5) {
			ranking="trung binh";
		}else if( roundedAvgPoint<8)
		 {
			ranking="kha";
		 }
		 else {
			 ranking= "gioi";
		 }
		 System.out.println("Ranking--> "+ranking);
		 System.out.println("Ranking --> " +getRank(roundedAvgPoint));
	}
	public static String getRank(float roundedAvgPoint) {
		if(roundedAvgPoint<5) {
			return "yeu";
		}
		if(roundedAvgPoint<6.5) {
			return "trung binh";
		}
		if(roundedAvgPoint<8) {
			return "kha";
			
		}
		return "gioi";
	}
	
	
}