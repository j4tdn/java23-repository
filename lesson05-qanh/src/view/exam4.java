package view;

import java.util.Arrays;
import java.util.Scanner;

public class exam4 {

    public static void main(String[] args) {
    	  Scanner scanner = new Scanner(System.in);
          
          System.out.println("Nhập số lượng phần tu : ");
          int n = scanner.nextInt();
          int[] a = new int[n];
          
          System.out.println("Nhập các phần tử cuu mảng : ");
          for (int i = 0; i < n; i++) {
              a[i] = scanner.nextInt();
          }
          System.out.println("tổng các phần tử không trùng nhau trong mảng\r\n"
          		+ "ngoại trừ phần tử lớn nhất và phần tử nhỏ nhất. là: " + sum(a));          
          scanner.close();
      }

    public static int sum(int[] a) {
        int[] Array = new int[a.length];
        int Count = 0;
        
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < Count; j++) {
                if (a[i] == Array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
            	Array[Count++] = a[i];
            }
        }
        if (Count < 3) {
            return 0;
        }
        
        int min = Array[0];
        int max = Array[0];
        for (int i = 1; i < Count; i++) {
            if (Array[i] < min) {
                min = Array[i];
            }
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        
        int sum = 0;
        for (int i = 0; i < Count; i++) {
            if (Array[i] != min && Array[i] != max) {
                sum += Array[i];
            }
        }
        
        return sum;
    }
}
