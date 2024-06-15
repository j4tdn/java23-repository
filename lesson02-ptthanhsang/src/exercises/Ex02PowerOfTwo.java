package exercises;

import java.util.Scanner;

public class Ex02PowerOfTwo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int count = 0;

        do {
            System.out.print("Nhập N : ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N <= 0) {
                    System.out.println("N phải là số nguyên dương. Vui lòng nhập lại.");
                    scanner.nextLine();
                    continue;
                }
                if (isPowerOfTwo(N)) {
                    System.out.println(N + " là lũy thừa của 2.");
                    break;
                } else {
                    System.out.println(N + " không phải là lũy thừa của 2.");
                }
                count++;
            } 
        } while (count < 5);


    }

   
    private static boolean isPowerOfTwo(int N) {
        if (N <= 0) {
            return false;
        }
        
        while (N % 2 == 0) {
            N /= 2;
        }
        return N == 1;
    }
}

