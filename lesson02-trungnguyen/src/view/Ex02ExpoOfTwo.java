package view;

import java.util.Scanner;

public class Ex02ExpoOfTwo {
	public static void main(String[] args) {
		// open connection to keyboard
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int N = 0;
		boolean validInput = false;

		// input N, 5 lan
		while (count < 5 && !validInput) {
			System.out.print("nhập một số nguyên dương N: ");
			//nextLine để xoá enter
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
			int testN = N;
			while(testN %2 == 0) {
				testN/=2;
			}
			if(testN == 1) {
				System.out.println("Là luỹ thừa của 2:" + N);
			}
			else System.out.println("K phải luỹ thừa của 2");
			
		} else {
			System.out.println("Quá số lần thử tối đa, chương trình kết thúc");
		}
		scanner.close();
	}
}
