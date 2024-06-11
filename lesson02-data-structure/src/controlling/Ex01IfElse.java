package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		
		 Random rd = new Random();
		 int number = rd.nextInt(5,20);
		System.out.println("number ==>"+number);
		 
		 //expression : number %2 ==0
		//if(isEven ==true )<-->if(isEven)
		//if (isEven ==false)<-->if()list Even
		 boolean isEven = number %2 ==0;
		 if(isEven == true)
		 {
			 System.out.println("Result -->"+(Year.now().getValue()+2));
		 }
		 Scanner ip = new Scanner(System.in);
		 
		 System.out.print("Enter password");
		 String password =ip.nextLine();
		 
		 if(password.length() >= 8) {
			System.out.println("password is value");
		 }else {
			 System.out.println("password is invalid, please enter again");
		 }
		 
		 float avgPoint = rd.nextFloat(0,10);
		 System.out.println("Average point"+avgPoint);
		 
		 // làm tròn 1 chữ số thập phân , kết uqr commerial round
		 //2.352(2.4) 8.8122(8.8) 7.491(7.5) 9.92(9.9) 9.97(10.0)
		 // chia làm 2 phần
		 //+Làm tròn mấy chữ số :scale
		 //+chế độ làm tròn : rounding mode
		 
		 //Integer -->int value
		 //String -->char[] value
		 //BigDecimal ->double value
		 BigDecimal bdAvgPoint =BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP);
		 
		 
		 //dùng biến này để 
//		 float roundeAvgPoint = bdAvgPoint.floatValue();
//		 System.out.println("bdAvgPoint:"+bdAvgPoint);
//		 
//		 String ranking = "Yếu";
//		 
//		 if(roundeAvgPoint <5) {
//			 ranking = "Yếu";
//		 }else if ( roundeAvgPoint <8) {
//			 ranking ="Trung bình";
//		 }else {
//			 ranking ="Giỏi";
//		 }
//		 System.out.println("ranking"+ranking);
//		 
//		 
		 private static String getRank(	float roundeAvgPoint) {
			 if(roundeAvgPoint <5) {
				 return "Yếu";
			 }
			 if(roundeAvgPoint <6.5) {
				 return "Trung Bình"
			 }
			 if(roundeAvgPoint <8 ) {
				 return "Khá";
			 }
			 return "Giỏi";
		 }
		 
		 
		 ip.close();
	}
}
