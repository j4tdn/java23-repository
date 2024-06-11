package controlling;

import java.util.Random;

public class Ex02TernaryOperator {
	public static void main(String[] args) {
		/*
		 Toán tử 3 ngôi 
		 */
		Random rd = new Random();
		
		int a = rd.nextInt();
		int b = rd.nextInt();
		System.out.println("a = " + a);
		System.out.println("B = "+ b);
		
		if (a > b) { 
			System.out.println("Max la a = " + a);
			
		}
		else System.out.println("Max la b = "+ b);
		
		// Su dung toan tu 3 ngoi
		String text = a > b ? ("Max la a = " + a) : ("Max la b = " + b);
		System.out.println(text);
		
		String ranking = "";
		float roundedAvgPoint= 2.8f;
		ranking = roundedAvgPoint < 5 ? "Yeu" : roundedAvgPoint < 6.5 ? "Trung binh" : roundedAvgPoint < 8 ? "Kha" : "Gioi";
		System.out.println("Xep loai bang toan tu 3 ngoi: " + ranking);
	}
}
