package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {

	public static void main(String[] args) {
		
		/*
		 Câu 1:
		 Random 1 số ngẫu nhiên từ [5,20)
		 Kiểm tra số đó có phải là số chẵn ko
		 - Nếu là số chẵn thì in ra năm hiện tại + số chẵn đó
		 - Nếu ko phải --> ko in ra 
		 */
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		System.out.println("number => " + number);
//		if(number%2 == 0) 
//			System.out.println("random number is an even number -->" );
		boolean isEven = number % 2 ==0;
		if(isEven == true)
			System.out.println("Result --> "+ (Year.now().getValue() + number));
		
		/*
		 Câu 2:
		 Nhập vào mk, kiểm tra độ dài của mk có hợp lệ hay ko
		 - Nếu độ dài của mk >=8  --> in ra mk hợp lệ
		 - Ngược lại --> in ra mk ko hợp lệ, vui lòng nhập lại
		 
		 */
		
		Scanner ip = new Scanner(System.in);
		System.out.print("\nEnter password: ");
		String password = ip.nextLine();
		
		if(password.length() >= 8)
		{
			System.out.println("Password is valid");
		}
		else System.out.println("Password is invalid, please enter again");
		
		/*
		 Câu 3:
		 Random điểm trung bình của hs [0.0, 9.0]
		 Làm tròn số đc in
		 - Nếu điểm :
		 	 + [0, 5)   : Yếu
			 + [5, 6.5) : Trung Bình
			 + [6.5, 8) : Khá
			 + [8, 10]  : Giỏi
			 
		 */
		float avgPoint = rd.nextFloat(0,10);
		System.out.println("\nAverage point: " + avgPoint);
		// Làm tròn 1 chữ số thập phân
		// Chia làm 2 phần: 
		//	- Làm tròn mấy chữ số: scale
		//	- Chế độ làm tròn: rounding mode
		BigDecimal bdAvgPoint = BigDecimal.valueOf(avgPoint).setScale(1,RoundingMode.HALF_UP);
		float roundeAvgPoint = bdAvgPoint.floatValue();
		System.out.println("Rounded average point: " + roundeAvgPoint);
		
		String ranking = "";
		if(avgPoint < 5) ranking = "Yếu";
		else if(avgPoint < 6.5) ranking = "Trung bình";
		else if (avgPoint < 8) ranking = "Khá";
		else ranking = "Giỏi";
		System.out.println("Ranking --> " + ranking);
		System.out.println("Ranking --> " + getRank(roundeAvgPoint)); //dùng hàm
		
	}
	
	private static String getRank(float roundeAvgPoint) {
		if (roundeAvgPoint < 5) {
			return "Yếu";
		}
		if (roundeAvgPoint < 6.5) {
			return  "Trung bình";
		} 
		if (roundeAvgPoint < 8) {
			return "Khá";
		}
		return "Giỏi";
	}
}
