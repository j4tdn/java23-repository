package view;

import java.util.Scanner;

public class Ex06MinMaxOutOf3 {
//	Bài 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
//	Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
//	VD: Nhập a = 6
//	Nhập b = “xyz” → báo lỗi, yêu cầu nhập lại
//	Nhập b = 12
//	Nhập c = 8
//	Số lớn nhất là 12
//	Số nhỏ nhất là 6
	public static void main(String[] args) {
		System.out.print("Nhập a: ");
		int a = enterInt();
		System.out.print("Nhập b: ");
		int b = enterInt();
		System.out.print("Nhập c: ");
		int c = enterInt();
		System.out.println("Min: " + minInteger(a, b, c));
		System.out.println("Max: " + maxInteger(a, b, c));
	}
	
	private static boolean isNumber(String n) {
		try {
			int i = Integer.parseInt(n);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	
	private static int enterInt() {
		Scanner sc = new Scanner(System.in);
		do {
			String n = sc.nextLine();
			if(isNumber(n)) {
				if(Integer.parseInt(n)>=0 && Integer.parseInt(n)<20) {
					return Integer.parseInt(n);
				}
			}
			else {
				System.out.println("nhập sai, nhập lại! [0-20)");
			}
		}while(true);
	}
	
	private static int minInteger(int a, int b, int c) {
		if(a < b)    //1 3
			if (b < c) // 1 3 6
				return a;
			else //b > c 1 3 2 1 3 0
				if (a < c) 
					return a; 
				else //a<b b>c c < a
					return c;
		else //a > b 5 3
			if(b < c) //5 3 4 5 3 1 5
				return b;
			else //b>c 5 3 1
				return c;
	}
	
	private static int maxInteger(int a,int b, int c) {
		if(a < b)
			if (b < c)
				return c;
			else
				return b;
		else
			if (b > c) //5 3 2
				return a;
			else //b<c 5 3 4 5 3 7
				if (a < c)
					return c;
				else
					return a;
	}
}
