package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01TwoOppositeTriangles {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        // Tạo tam giác đối đỉnh
        ArrayList<ArrayList<Integer>> list = generateTriangle(n);

        // In hai tam giác
        printTriangles(list, n);
    }

    // Hàm tạo tam giác đối đỉnh
    public static ArrayList<ArrayList<Integer>> generateTriangle(int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                row.add(j);
            }
            list.add(row);
        }
        return list;
    }

    // Hàm in hai tam giác đối đỉnh
    public static void printTriangles(ArrayList<ArrayList<Integer>> list, int n) {
        for (int i = 0; i < n; i++) {
            // In tam giác trái
            for (int j = 0; j <= i; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }

            // In khoảng trắng giữa hai tam giác
            int spaces = (n - i - 1) * 2;
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }

            // In tam giác phải
            for (int j = i; j >= 0; j--) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
