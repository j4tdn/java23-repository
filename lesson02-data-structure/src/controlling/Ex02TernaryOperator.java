package controlling;

import java.util.Random;

public class Ex02TernaryOperator {

	
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt();
		int b = rd.nextInt();
		
		//tìm max 2 số
		if(a > b)
			System.out.println("Max là a "+ a);
		else
			System.out.println("Max là b "+ b);
		
		//sử dụng 3 ngôi
		String text;
		text = a > b ? ("Max là a "+ a) : ("Max là b "+ b);
				
	}
}
