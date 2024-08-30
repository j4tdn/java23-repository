package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Nhập a: ");
                a = scanner.nextDouble();
                if (a == 0) {
                    throw new ArithmeticException("a không thể bằng 0 vì phương trình sẽ không hợp lệ.");
                }

                System.out.print("Nhập b: ");
                b = scanner.nextDouble();
                isValid = true; 

            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập số thực.");
                scanner.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }

        double x = -b / a;
        System.out.println("Nghiệm của phương trình là x = " + x);
    }
}
