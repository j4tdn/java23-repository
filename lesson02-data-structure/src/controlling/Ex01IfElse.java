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
		System.out.println("so ngau nhien a: ");
		
		if(a % 2 ==0) {
			System.out.println("a la so chan:" +a);
			System.out.println("Gia tri: " +(Year.now().getValue() + a));
	
		}		 else 
				
				System.out.println("a la so le: " +a);
	
		Scanner Ip = new Scanner(System.in);
		  System.out.print("Enter password: ");
		String passWord = Ip.nextLine();
	
		if(passWord.length() >= 8) {
		System.out.println("Password is valid");
		
		} else 
			System.out.println("Password is ivalid,please enter again");
   
		 
		float point = rd.nextFloat(0,10);
//		System.out.println("Point = " +point);
		BigDecimal bdPoint = BigDecimal.valueOf(point).setScale(1, RoundingMode.HALF_UP);
		float roundedPoint = bdPoint.floatValue();
		System.out.println("Rounded average Point: " +roundedPoint);
		  
		  if(point <= 5) {
			 System.out.println("Hoc sinh yeu");
		 } else 
			 if(point >=5 && point <= 6.5) {
				 System.out.println("Hoc sinh trung binh");
			 } else
				 if(point >= 6.5 && point <= 8) {
					 System.out.println("Hoc sinh kha");
				 }else 
					 System.out.println("Hoc sinh gioi");

		  /*
		  cách 2 là dùng if-return 
		  cách 3 gọi biến ranking và gán ranking= giá trị ngay trong if
		   */
	}
}
