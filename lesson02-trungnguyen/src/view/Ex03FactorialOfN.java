package view;

import java.util.Scanner;

public class Ex03FactorialOfN {
	public static void main(String[] args) {

		// open connection to keyboard
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int N = 0;
		boolean validInput = false;

		// input N, cho den khi N hop le
		while (!validInput) {
			System.out.print("nhập một số nguyên dương N: ");
			// nextLine để xoá enter
			String input = scanner.nextLine();
			try {
				N = Integer.parseInt(input);
				if (N > 0) {
					validInput = true;
				} else {
					System.out.println("Lỗi: N phải là số nguyên dương, nhâpk lại");
					count++;
				}
			} catch (NumberFormatException e) {
				System.out.println("Lỗi: vui lòng nhập một số nguyên dương hợp lệ");
				count++;
			}
		}

		
		if (validInput) {
			long result = N;
			for (int i = N-1; i> 0; i--) {
				result=result*i;
			}
			System.out.println("Giai thừa của N là: " + result);
			

		} 
		scanner.close();
	}
}
