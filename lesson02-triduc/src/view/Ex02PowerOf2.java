package view;

import java.util.Scanner;

public class Ex02PowerOf2 {
//	Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
//	Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
//	(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
//	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
//
//	= 4 → true
//
//	= 6 → false
//	= 8 → true
//	= 9 → false
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		do {
			System.out.print("Nhập vào số n: ");
			String n = sc.nextLine();
			if(isNumber(n)) {
				if(isPowerOfTwo(Integer.parseInt(n))) {
					System.out.println(n + " là luỹ thừa của 2");
					break;
				}
				else
				{
					System.out.println(n + " không phải luỹ thừa của 2");
					break;
				}
			}
			count++;
			System.out.println("Nhập sai!, số lần nhập sai: " + count);
		}while(count<5);
	}
	
	private static boolean isPowerOfTwo(int n) {
		if(n == 0)
			return false;
		while(n != 1) {
			if(n%2 != 0)
				return false;
			n = n/2;
		}
		return true;
	}
	
	private static boolean isNumber(String n) {
		try {
			int i = Integer.parseInt(n);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
}
