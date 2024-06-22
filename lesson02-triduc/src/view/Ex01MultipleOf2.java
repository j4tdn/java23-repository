package view;

import java.util.Scanner;

public class Ex01MultipleOf2 {
//	Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
//	Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối
//	đa 5 lần)
//	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
//
//	= 4 → true
//	= 6 → true
//	= 7 → false
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		do {
			System.out.print("Nhập vào số n: ");
			String n = sc.nextLine();
			if(isNumber(n)) {
				if(isMultipleTwo(Integer.parseInt(n))) {
					System.out.println(n + " là bội của 2");
					break;
				}
				else
				{
					System.out.println(n + " không phải bội của 2");
					break;
				}
			}
			count++;
			System.out.println("Nhập sai!, số lần nhập sai: " + count);
		}while(count<5);
	}
	
	private static boolean isMultipleTwo(int n) {
		if(n%2 == 0) 
			return true;
		return false;
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
