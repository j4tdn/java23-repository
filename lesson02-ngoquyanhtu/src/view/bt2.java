package view;

import java.util.Scanner;

public class bt2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		boolean isValid = false;
		int attempts = 0;

		while (!isValid && attempts < 5) {
			System.out.println("Nhập một số nguyên dương : ");
			if (scanner.hasNextInt()) {
				N = scanner.nextInt();
				if (N > 0) {
					isValid = true;
				} else {
					System.out.println("số này không phải là số nguyên dương,xin hãy thử lại");
					attempts++;
				}

			} else {
				System.out.println("Số này không phải là số nguyên, xin hãy thử lại");
				scanner.next();
				attempts++;
			}

		}
		if (!isValid) {
            System.out.println("Bạn đã nhập sai quá 5 lần. Chương trình kết thúc.");
        } else {
            if (isPowerOfTwo(N)) {
                System.out.println("Số " + N + " là lũy thừa của 2.");
            } else {
                System.out.println("Số " + N + " không phải là lũy thừa của 2.");
            }
        }

        scanner.close();
    }

    public static boolean isPowerOfTwo(int N) {
        return (N > 0) && ((N & (N - 1)) == 0);
    }
}