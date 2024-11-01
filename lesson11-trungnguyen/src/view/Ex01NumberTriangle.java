package view;

import java.util.Scanner;

public class Ex01NumberTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
		  System.out.println("====================");
        for (int i = 0; i < n; i++) {
            // In các số bên trái
            for (int j = 0; j <= i; j++) {
                System.out.print((j+1) + " ");
            }
            
            // in khoảng trống ở giữa
            int spaces = 2 * (n - i) -3;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            
            // in các số bên phải
            for (int j = 2*n - i-1; j <= 2*n -1 ; j++) {
            	if (j == n ) {
                	continue;
                }
            	System.out.print(j + " ");
            }
            
            System.out.println();
        }
        for (int i = n -1; i >= 0; i--) {
            // in các số bên trái
            for (int j = 0; j < i; j++) {
                System.out.print((j+1) + " ");
            }
            
            // in khoảng trống ở giữa
            int spaces = 2 * (n - i) -1 ;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            
            // in các số bên phải
            for (int j = 2*n - i; j <= 2*n -1 ; j++) {
            	if (j == n ) {
                	continue;
                }
            	System.out.print(j +" ");
            }
            
            System.out.println();
        }

        
    }
	
}
