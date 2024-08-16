package view;

import java.util.Scanner;

public class Ex01QuadraticEquation {

private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double result = solveQuadraticEquation();
		System.out.println("The solution to quadratic equation is " + result);
		
	}
	
	private static double solveQuadraticEquation() {
		double a = 0;
		double b = 0;
		boolean isValid = false;
		
		// x = -b / a
		while(!isValid) {
			try {
				// Nhập a từ bàn phím
				System.out.println("Enter a: ");
				a = Double.parseDouble(ip.nextLine());
				
				// kiểm tra số chia có bằng 0 không và bắt lỗi
				if(a == 0) {
					throw new ArithmeticException("a cannot be 0. Please enter a again: ");
				}
				
				// Nhập b từ bàn phím
				System.out.println("Enter b: ");
				b = Double.parseDouble(ip.nextLine());
				
				isValid = true; // Thoát vòng lặp
			} catch (ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter a number.");
			}
		}
		
		// Nếu b = 0 thì kết quả sẽ là NaN, do đó phải kiểm tra b có bằng 0 hay không
		// Nếu b = 0 thì phương trình có 1 nghiệm duy nhất là x= 0
		//     b!= 0 thì chạy chương trình bình thường
		if(b == 0) {
			return 0;
		} else {
			return -b / a;
		}
		
	}
	
}
