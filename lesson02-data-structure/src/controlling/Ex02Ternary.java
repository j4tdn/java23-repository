package controlling;

import java.util.Random;

public class Ex02Ternary {
	/* 
	 * toán tử ba ngôi sử dụng tương tự ìf else
	 * trong điều kiện đơn giản sử dụng toán tử ba ngôi
	 * trong trường hợpphucws tạp dùng ba ngôi khó đọc code 
	 * cú pháp expression1(boolean) statment1 : statment2
	 * tương tự 
	 * if(......){
	 * statment1
	 * }
	 * else{
	 * ststment2
	 * }
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10);
		int b = rd.nextInt(10);
		
		//tìm max của hai số ab ;
//		if(a>b) {
//			System.out.println("só lớp nhất là a "+a);
//		}else {
//			System.out.println("số lớp nhất bà b "+b);
//		}
		// sử dụng ba ngôi 
		System.out.println("mãx là "+((a>b)?a:b));
	}

}
