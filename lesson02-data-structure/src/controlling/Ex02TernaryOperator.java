package controlling;

import java.util.Random;

public class Ex02TernaryOperator {
	
	
	/*
	 Toán tự 3 ngôi --> sử dụng 100% tương tự if else 
	 chỉ dùng trong trường hợp đơn giản
	 Trong điều kiện đơn giản --> gọn code
	 Trong trường hợp phúc tạp dùng 3 ngôi --> khó đọc code
	 cú phaps :expresslion1(boolean)? statemmen 1: statement 2
	 tương tyw 
	 if(expression1){
	 statemen 1
	 }else{
	 statement2
	 } 
	 */
	
	public static void main(String[] args) {
		Random rd = new Random();
		int a= rd.nextInt();
		int b = rd.nextInt();
		
		if(a>b) {
			System.out.println("max la a"+a);
			
		}else {
			System.out.println("max la b"+b);
		}
		//sử dụng toán tử 3 ngôi
		String text = a>b ? ("Max là a= "+a) : ("Max là b = "+b);
		System.out.println(text);
		
	}
}
