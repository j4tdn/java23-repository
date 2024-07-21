package view;

import static utils.IoUtils.*;
import static java.lang.Math.*;

public class Ex06MinMax {

	public static void main(String[] args) {
		int requiredMin = 0;
		int requiredMax = 20;
		
		int a = input("a", requiredMin, requiredMax);
		int b = input("b", requiredMin, requiredMax);
		int c = input("c", requiredMin, requiredMax);
		
		System.out.println("\n===> = " + findMax(a, b, c));
		
	}
	
	// Viết 1 hàm duy nhất trả về min và max của 3 hoặc n số
	// String
	// int[]
	
	
}
