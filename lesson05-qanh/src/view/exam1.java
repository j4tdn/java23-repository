package view;

import java.util.Scanner;

public class exam1 {
    public static boolean isPowerOf(int a, int b) {
        if (a <= 1 || b <= 1) {
            return a == 1 || b == 1;
        }      
        return isPower(a, b) || isPower(b, a);
    }
    
    private static boolean isPower(int number, int base) {
        if (base <= 1) {
            return number == 1;
        }
        if (number < 1) {
            return false;
        }
        
        while (number % base == 0) {
            number /= base;
        }
        
        return number == 1;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a ;
    	int b ;
    	a = sc.nextInt();
    	b = sc.nextInt();
        System.out.println(isPowerOf(a ,b));  
       
    }
}

