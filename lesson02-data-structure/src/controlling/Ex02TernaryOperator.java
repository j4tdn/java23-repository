package controlling;

import java.util.Random;

public class Ex02TernaryOperator {
	//Toán tử 3 ngôi (basic only)
	
	//syntax: expression1(boolean)?do if true : do if false
	//-> Luôn trả về kết quả là 1 KDL !!
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = rd.nextInt();
		int b = rd.nextInt();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		String rs = a > b ? ("Max là a : " + a) : ("Min là b : " + b);
		
		System.out.println(rs);
		
		//Ranking -> shouldnt cz complex 
	}
}
