package view;

import java.util.Scanner;

public class SpeacialNumber {

//	B1: Nhập vào 1 số n
//	B2: dùng hàm for, so sánh nếu n = lần lượt tổng các số nguyên
//	suy ra số đặc biệt 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		isSpecialNumber(0);
		
	}
	
	public static boolean isSpecialNumber(int n) {
		System.out.println("Input n = ");
		 n = sc.nextInt();
		int total = 0;
		 for(int i =1;i <n;i++) {
			total = total + i;
			if(total == n) {
			  System.out.println("N is a special number");
			  return true;
			}
		}
		  System.out.println("N is not a special number");
		 return false;
	}
}
