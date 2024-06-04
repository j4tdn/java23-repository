package controlling;

import java.util.Random;

public class Ex02TernaryOperator {
	/*
	 Toán tử 3 ngôi ---> sử dụng tương tụ như if else 
		+ Trong trường hợp đk đơn giản sử dụng --> gọn code
		+ Trong trường hợp phức tạp ko dùng --> khó đọc code
		
	- Cú pháp: expression1(boolean) ? statement1 : statement2
		Yêu cầu: return kết quả 
		
		Tương tự
		 if (expression1) {
		   statement1
		 } else {
		   statement2
		 }
	 */
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int a = rd.nextInt();
		int b = rd.nextInt();
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		//Tìm max a & b
		if(a>b) System.out.println("Max là a = " + a);
		else System.out.println("Max là b = " + b);
		
		//Dùng toán tử 3 ngôi
		String text = a>b ? ("Max là a = " + a) : ("Max là b = " + b);
		System.out.println("\nDùng toán tử 3 ngôi\n"+text);
		
		// Xếp loại học lực
		float roundeAvgPoint = 8.0f;
		System.out.println("\nSố điểm: " + roundeAvgPoint);
		String ranking = ""; 
		ranking = roundeAvgPoint<5 ? "Yếu" : roundeAvgPoint<6.5 ? "Trung bình" : roundeAvgPoint<8 ? "Khá" : "Giỏi";
		System.out.println("Xếp loại: " + ranking);
		
		
	}

}
