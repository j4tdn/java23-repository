package view;

import java.util.Scanner;

public class Ex01FirstOrderEquations {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		double a = 0, b = 0;
		do {
			try {
				System.out.print("Nhập hệ số a = ");
				a = Double.parseDouble(ip.nextLine());
				if (a == 0)
					System.out.println("Hệ số a không thể bằng 0 ! Vui lòng nhập lại !");
				else
					break;
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai ! Vui lòng nhập lại !");
			}
		} while (true);

		do {
			try {
				System.out.print("Nhập hệ số b = ");
				b = Double.parseDouble(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai ! Vui lòng nhập lại !");
			}
		} while (true);

		if (b == 0)
			System.out.println("Nghiệm của phương trình " + a + "x + " + b + " = 0\n" + "==> x = 0");
		else
			System.out.println("Nghiệm của phương trình " + a + "x + " + b + " = 0\n" + "==> x = " + (-b / a));
	}
}
