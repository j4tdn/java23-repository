package review;

import java.util.Scanner;

import utils.IoUtils;
import utils.MathUtils;

public class Ex05Symetric {
	
	/*
	 Viết chương trình kiểm tra N có phải là số đối xứng hay không 
	 + số đối xứng
	 + chuỗi đối xứng
	 + mảng, danh sách đối xứng
	 
	 -> 567 -> false
	 -> 89123 -> true
	 -> 23432 -> true
	 
	 Cách 1: 567 -> tìm số ngược lai -> 765 nếu bằng nhau thì là số đối xứng
	 --> Cách 1: + _ * / tìm số ngược lại
	 --> Cách 2: chuyển sang chuỗi, mảng -> duyệt ngược lại
	 --> Cách 3: kiểm tra từng cặp kí tự , số đối xứng
	
	 Biết rằng N được nhập từ bàn phím là một số nguyên dương 
	 có tối thiểu 2 chữ số
	 */
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = IoUtils.input(2);
		System.out.println("Is symetric number ==> " + isSymetric(n));
		
		System.out.println("\n ===================\n");
		
		System.out.println("Enter text = ");
		String s = ip.nextLine();
		System.out.println("Is symetric string ==> " + isSymetric(s));
	}
	// vị trí length - i - 1 là vị trí đối xứng với vị trí i
	// qua phần tử trung tâm
	private static boolean isSymetric(String s) {
		int length = s.length();
		for (int i = 0; i < length/2; i++) {
			if(s.charAt(i) != s.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isSymetric(int n) {
		return n == MathUtils.reverse(n);
	}
}
