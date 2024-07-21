package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05LevelOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua mang (3 <= n <= 20): ");
		int n = scanner.nextInt();

		if (n < 3 || n > 20) {
			System.out.println("So luong phan tu khong hop le. Chuong trinh ket thuc.");
			return;
		}

		int[] arr = new int[n];
		System.out.println("Nhap cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int[] levels = new int[n];

		for (int i = 0; i < n; i++) {
			int count = 0;
			int sqrt = (int) Math.sqrt(arr[i]);
			for (int j = 1; j <= sqrt; j++) {
				if (arr[i] % j == 0) {
					if (j == arr[i] / j) {
						count++;
					} else {
						count += 2;
					}
				}
			}
			levels[i] = count;
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (levels[j] > levels[j + 1]) {
					int tempLevel = levels[j];
					levels[j] = levels[j + 1];
					levels[j + 1] = tempLevel;

					int tempElement = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tempElement;
				}
			}
		}

		System.out.println("Mang sau khi sap xep theo level: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
