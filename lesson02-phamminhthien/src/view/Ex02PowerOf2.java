package view;

import java.util.Scanner;

public class Ex02PowerOf2 {
	public static void main(String[] args) {
		power();
	}
//kiểm tra số nguyên N có phải là lũy thừa của 2
	public static void power() {
		Scanner ip = new Scanner(System.in);
		int sl = 1;
		int N = 0;

		while (sl < 6) {
			System.out.print("Nhập số nguyên N: ");
			if (ip.hasNextInt()) {
				N = ip.nextInt();
				if ((N & (N - 1)) == 0 && N > 0) {
					System.out.println("-> "+N + " là lũy thừa của 2.");
				} else {
					System.out.println("-> "+N + " không phải là lũy thừa của 2.");
				}
				break;
			} 
			else {
				System.out.println("Lỗi - " + sl + ", Vui lòng nhập lại !\n");
				ip.next();
				sl++;
			}

			if (sl == 6) {
				System.out.println("Bạn đã nhập sai tối đa 5 lần");
			}

		}
	}
}
