package view;

import java.util.Scanner;

public class Ex02SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang (5 <= n <= 100): ");
        int n = scanner.nextInt();

        if (n < 5 || n > 100) {
            System.out.println("So luong phan tu khong hop le. Chuong trinh ket thuc.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] divisibleBy7 = new int[n];
        int[] divisibleByBoth5And7 = new int[n];
        int[] others = new int[n];
        int[] divisibleBy5 = new int[n];

        int countDivisibleBy7 = 0;
        int countDivisibleByBoth5And7 = 0;
        int countOthers = 0;
        int countDivisibleBy5 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
                divisibleByBoth5And7[countDivisibleByBoth5And7++] = arr[i];
            } else if (arr[i] % 7 == 0) {
                divisibleBy7[countDivisibleBy7++] = arr[i];
            } else if (arr[i] % 5 == 0) {
                divisibleBy5[countDivisibleBy5++] = arr[i];
            } else {
                others[countOthers++] = arr[i];
            }
        }

        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < countDivisibleBy7; i++) {
            result[index++] = divisibleBy7[i];
        }

        for (int i = 0; i < countOthers; i++) {
            result[index++] = others[i];
        }

        for (int i = 0; i < countDivisibleByBoth5And7; i++) {
            result[index++] = divisibleByBoth5And7[i];
        }

        for (int i = 0; i < countDivisibleBy5; i++) {
            result[index++] = divisibleBy5[i];
        }

        System.out.println("Mang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}