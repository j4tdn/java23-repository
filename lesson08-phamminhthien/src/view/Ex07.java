package view;

import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Nhập xâu S: ");
        String s = ip.nextLine();
        ip.close();
        
        if (s.isEmpty()) {
            System.out.println("Xâu rỗng.");
            return;
        }
        
        int maxLength = findMaxLength(s);
        int minLength = findMinLength(s);
        
        System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength);
        System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLength);
    }
    
    public static int findMaxLength(String s) {
        int maxLength = 0;
        int currentLength = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }
        
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        
        return maxLength;
    }
    
    public static int findMinLength(String s) {
        int minLength = Integer.MAX_VALUE;
        int currentLength = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength < minLength) {
                    minLength = currentLength;
                }
                currentLength = 1;
            }
        }
        
        if (currentLength < minLength) {
            minLength = currentLength;
        }
        
        return minLength;
    }
}

