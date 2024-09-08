package view;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số N: ");
        BigInteger N = scanner.nextBigInteger();
        System.out.print("Nhập số M: ");
        BigInteger M = scanner.nextBigInteger();
        scanner.close();
        
        if (arePrimeEquivalent(N, M)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}

