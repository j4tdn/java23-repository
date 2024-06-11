package view;

import java.util.Random;

public class bt4 {
	public static long tinhGiaiThua(int n) {
		long giaithua = 1;
		for (int i = 2; i <= n; i++) {
			giaithua *= i;
		}
		return giaithua;
	}

	public static long random() {
		Random rd = new Random();

		int a = rd.nextInt(10, 20);
		int b = rd.nextInt(10, 20);
		int c = rd.nextInt(10, 20);
		int d = rd.nextInt(10, 20);

		System.out.println("giá trị a =" + a);
		System.out.println("giá trị b =" + b);
		System.out.println("giá trị c =" + c);
		System.out.println("giá trị d =" + d);
		
		long tong = tinhGiaiThua(a)+ tinhGiaiThua(b)+ tinhGiaiThua(c)+ tinhGiaiThua(d);
		
		return tong;
	}
	
	public static void main(String[] args) {
		long tong = random();
		System.out.println("tổng giai thừa các số nguyên là : " + tong);
	}
}