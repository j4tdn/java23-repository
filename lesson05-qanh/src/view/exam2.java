package view;

import java.util.Scanner;

public class exam2 {
	
    public static void main(String[] args) {
        int result ;
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        System.out.println(isSpecialNumber(result));
        
    }

    public static boolean isSpecialNumber(int S) {
        int sum = 0;
        int n = 1;

        while (sum < S) {
            sum += n;
            if (sum == S) {
                return true;
            }
            n++;
        }
        return false;
    }
}