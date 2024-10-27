package view;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02_Happy {

    public static void main(String[] args) {
    	System.out.println("Enter the number to check : ");
    	Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("----------------------");
        System.out.println("Number " + number + (CheckHappy(number)?"true":"false"));
    }

    public static boolean CheckHappy(int n) {
        Set<Integer> checkedNumbers = new HashSet<>();
        while (n != 1 && !checkedNumbers.contains(n)) {
            checkedNumbers.add(n);
            n = SumSquare(n);
        }
        return n == 1;
    }

    private static int SumSquare(int n) {
        int result = 0;
        while (n != 0) {     
        	result += (n%10) * (n%10);
            n /= 10;
        }
        return result;
    }
}

