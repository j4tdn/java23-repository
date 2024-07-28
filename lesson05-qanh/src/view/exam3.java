package view;

import java.util.Scanner;

public class exam3 {
	public static int getMaxValidNumber(String str) {
        int maxNumber = 0;
        int currentNumber = 0;
        boolean inNumber = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                if (!inNumber) {
                    inNumber = true;
                    currentNumber = ch - '0';
                } else {
                    currentNumber = currentNumber * 10 + (ch - '0');
                }
            } else {
                if (inNumber) {
                    maxNumber = Math.max(maxNumber, currentNumber);
                    inNumber = false;
                    currentNumber = 0;
                }
            }
        }
        if (inNumber) {
            maxNumber = Math.max(maxNumber, currentNumber);
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        String Chain ;
        Scanner sc = new Scanner(System.in);
        Chain = sc.next();
        System.out.println(getMaxValidNumber(Chain));                
    }
}
