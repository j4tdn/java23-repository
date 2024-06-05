package controlling;

import java.util.Random;

public class Ex02TernaryOperator {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int a = rd.nextInt();
		int b = rd.nextInt();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if(a > b) {
			System.out.println("Max la a = " + a);
		}
		else {
			System.out.println("Max la b = " + b);
		}
		
		String text = a > b ? ("Max la a = " + a) : ("Max la b = " + b);
		System.out.println(text);
		
		float roundedAvgPoint = 2.8f;
		String ranking = "";
		if (roundedAvgPoint < 5) {
			ranking = "Yếu";
		} else if (roundedAvgPoint < 6.5) {
			ranking = "Trung bình";
		} else if (roundedAvgPoint < 8) {
			ranking = "Khá";
		} else {
			ranking = "Giỏi";
		}
		System.out.println("Xếp loại ifelse --> " + ranking);

		ranking = roundedAvgPoint < 5 ? "Yếu"
				                      : roundedAvgPoint < 6.5 ? "Trung bình"
				                    		                  : roundedAvgPoint < 8 ? "Khá"
				                    		                		                : "Giỏi";
		System.out.println("Xếp loại ternary --> " + ranking);
	}
}
