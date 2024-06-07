package view;

import java.util.Scanner;

public class Ex08PrimeNumber {
//	Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
//	Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
//	(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
//	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
//
//	= 4 → false
//	= 7 → true
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		do {
			System.out.print("Nhập vào số n: ");
			String n = sc.nextLine();
			if(isNumber(n)) {
				if(isPrime(Integer.parseInt(n))) {
					System.out.println(n + " là số nguyên tố");
					break;
				}
				else
				{
					System.out.println(n + " không phải số nguyên tố");
					break;
				}
			}
			count++;
			System.out.println("Nhập sai!, số lần nhập sai: " + count);
		}while(count<5);
	}
	
	private static boolean isPrime(int n) {
		if(n>=2)
		{
			for (int i = 2; i<=n/2;i++) {
				if(n%i == 0)
					return false;
			}
			return true;
		}
		return false;
	}
	
	private static boolean isNumber(String s) {
		try {
			int a = Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
