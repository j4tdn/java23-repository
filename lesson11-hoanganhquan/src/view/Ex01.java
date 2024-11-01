package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
	
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri cua n: ");
        int n = scanner.nextInt();
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                row.add(j);
            }
            for (int j = 2 * n - 1; j >= 2 * n - i; j--) {
                row.add(j);
            }
            triangle.add(row);
        }
        
        for (int i = 0; i < n; i++) {
            for (int j : triangle.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j : triangle.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

	
}
