package controlling;

import java.util.Random;

public class Ex02TernaryOperator {
	
	/* Toán tử 3 ngôi
	 --> sử dụng 100% tương tự if else
	 
	 Trong trường hợp đơn giản sử dụng toán tử 3 ngôi --> gọn code
	 Trong trường hợp phức tạp dùng 3 ngôi --> khó đọc code
	 
	 Cú pháp: expression1(boolean) ? statement1 : statement2
	 
	 Tương tự:
	 if(expression) {
	 	statement1
	 } else {
	 	statement2
	 }
	 
	 */
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = rd.nextInt();
		int b = rd.nextInt();
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		// Tìm max của 2 số a, b
		if (a > b) {
			System.out.println("Max --> " + a);
		} else {
			System.out.println("Max --> " + b);
		}
		
		// Sử dụng 3 ngôi
		
		// c1
		String text = a > b ? ("Max là a = " + a) : ("Max là b = " + b);
		System.out.println(text);
		
		// c2
		System.out.println("Max --> " + ((a > b)? a:b));
	}
}
