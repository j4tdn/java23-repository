package view;

import java.util.Scanner;

public class Ex01Exception {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double a = 0, b = 0;
		
		do {
			try {
				System.out.println("Nhập hệ số a: ");
				a = Double.parseDouble(ip.nextLine());
				System.out.println("Nhập hệ số b: ");
				b = Double.parseDouble(ip.nextLine());
				
				if ( a== 0 ) {
					throw new ArithmeticException("Hệ số a không hợp lệ");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Số không hợp lệ, nhập lại");
			} catch (ArithmeticException arthe) {
				System.out.println(arthe.getMessage());
			}
		} while (true);
		double x = -b / a;
        System.out.println("Nghiệm của phương trình là x = " + x);
	}
}
