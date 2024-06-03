package controlling;

import java.util.Random;

public class Ex02TernaryOperator {
	/*
	 Toán tử 3 ngôi --> sử dụng 100% tương tự if else
	 
	 Trong trường hợp điều kiện đơn giản sử dụng toán tử 3 ngôi --> sẽ gọn code
	 
	 Trong trường hợp phức tạp dùng 3 ngôi --> khó đọc code
	 
	 *Cú pháp: expression(boolean) ? statement1 : statement2
	 
	 Tương tự
	 if(expression1){
	 	statement1
	 }else{
	 	statement2
	 }
	 
	 */
	public static void main(String[] args) {
		Random rd = new Random();

		int a = rd.nextInt();
		int b = rd.nextInt();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// Tìm max của 2 số a,b
		if (a > b) {
			System.out.println("Max là a = " + a);
		} else {
			System.out.println("Max là b = " + b);
		}
		
		// Sử dụng toán tử 3 ngôi
		String text = a > b ? ("Max là a = " + a) : ("Max là b = " + b);
		
		System.out.println(text);
		
		// Xếp loại học lực
		float roundedAvgPoint = 7.8f;
		String ranking = "";
		if(roundedAvgPoint < 5) {
			ranking = "Yếu";
		} else if (roundedAvgPoint < 6.5) {
			ranking = "Trung Bình";
		} else if (roundedAvgPoint < 8) {
			ranking = "Khá";
		} else {
			ranking = "Giỏi";
		}
		System.out.println("Ranking --> " + ranking);
		
		// Sử dụng toán tử 3 ngôi
		ranking = roundedAvgPoint < 5 ? "Yếu"
									  : roundedAvgPoint < 6.5 ? "TB"
											  				  : roundedAvgPoint < 8 ? "Khá"
											  						  				: "Giỏi";
	}
}
