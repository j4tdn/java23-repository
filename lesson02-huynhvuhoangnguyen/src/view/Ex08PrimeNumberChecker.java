package view;

import java.util.Scanner;

public class Ex08PrimeNumberChecker {
	
	// số nguyên tố là số chỉ chia hết cho 1 và chính nó
	public static boolean isPrimeNumber(int n) {
		if (n <= 1) {
			return false; 	// số nguyên tố phải lớn hơn 1
		}
		if (n <= 3) {
			return true;	// số 2 và số 3 là số nguyên tố
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;	// loại bỏ những số tự nhiên không phải 2 và 3 nhưng chia hết cho 2 và 3
		}
		
		// Tính căn bậc hai của n và ép kiểu n về số nguyên
		int sqrtN = (int) Math.sqrt(n);	
		// các số lớn hơn 3 luôn nằm trong khoảng các số chia hết cho 6
		for (int i = 5; i <= sqrtN; i += 6) {
			// kiểm tra n có chia hết cho i hoặc i + 2 không. Nếu chia hết thì không phải số nguyên
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
	return true;
	}
	
	public static int getValidInput() {
		Scanner ip = new Scanner(System.in);
		int attemts = 0;
		
		while (attemts < 5) {
			System.out.println("Input a number: ");
			try {
				int n = Integer.parseInt(ip.nextLine());
				if (n > 0) {
					return n;
				} else {
					System.out.println("Input is not a positive number. Please try again.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input. Please try again.");
			}
			attemts++;
		}
		ip.close();
		System.out.println("You have exceeded the maximum of 5 attempts. The program will terminate!");
		return -1;
	}
	
	public static void main(String[] args) {
		int n = getValidInput();
		if (n != -1) {
			if (isPrimeNumber(n)) {
				System.out.println(n + " is a prime number.");
			} else {
				System.out.println(n + "is not a prime number.");
			}
		}
	}
	
}
