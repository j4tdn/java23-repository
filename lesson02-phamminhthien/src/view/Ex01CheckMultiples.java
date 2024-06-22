package view;

import java.util.Scanner;

public class Ex01CheckMultiples {

	public static void main(String[] args) {
		checkMultiples();
	}
	
//	kiểm tra số nguyên N có phải là bội của 2
	public static void checkMultiples() {
		Scanner ip = new Scanner(System.in);
		int sl = 1;
		int N = 0;

		while (sl < 6) {
			System.out.print("Nhập số nguyên N: ");
			if (ip.hasNextInt()) {
				N = ip.nextInt();
			
				if (N < 0) 
					System.out.println("Vui lòng nhập số nguyên dương !\n"); 
				else if (N % 2 == 0)
					System.out.println("-> "+N + " là bội số của 2");
				else
					System.out.println("-> "+N + " ko phải là bội số của 2");
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
