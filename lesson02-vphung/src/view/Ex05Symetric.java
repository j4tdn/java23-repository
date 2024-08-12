package view;

import java.util.Scanner;

import utils.IoUtils;
import utils.MathUtils;

public class Ex05Symetric {

	/*
	 Bài 5: Viết chương trình kiểm tra N có phải là số đối xứng hay không
	Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
	= a123 → báo lỗi, yêu cầu nhập lại
	= 1 → báo lỗi, yêu cầu nhập lại
	= 256 → false
	= 12521 → true
	= 2662 → true
	
	567 --> tìm số ngược lại --> 765 nếu bằng nhau thì là số đối xứng
	--> Cách 1: + - * / tìm số ngược lại
	--> Cách 2: chuyển sang chuỗi, mảng -> duyệt ngược lại
	--> Cách 3: Kiểm tra từng cặp kí tự, số đối xứng
	
	 */
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = IoUtils.input(2);
		System.out.println("Is Symetric ==> " + isSysmetric(n));
	
		System.out.println("\n=====================\n");
		
		System.out.println("Enter text = ");
		String s = ip.nextLine();
		System.out.println("Is Symetric String ==>" + isSysmetric(s));
		
	}
	// Vị trí length - i - 1 là vị trí đối xứng với vị trí i
	// qua phần tử trung tâm
	private static boolean isSysmetric(String s) {
		 int length = s.length();
		 for (int i = 0; i < length/2; i++) {
			 if(s.charAt(i) != s.charAt(length - i - 1)) {
				 return false;
			 }
		 }
		 return true;
	}
	
	private static boolean isSysmetric(int n) {
		return n == MathUtils.reversed(n);
	}
}