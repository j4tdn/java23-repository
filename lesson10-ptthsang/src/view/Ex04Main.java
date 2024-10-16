package view;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex04Main {

    public static void main(String[] args) {
        String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
        System.out.println("Chuỗi ban đầu --> " + Arrays.toString(strings));
        
        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s2 == null) {
                    return -1;
                }
                if (s1 == null && s2 != null) {
                    return 1;
                }
                if (s1.equals("Special")) {
                    return -1;
                }
                if (s2.equals("Special")) {
                    return 1;
                }
                if (isNumber(s1) && isNumber(s2)) {
                    return Integer.valueOf(s1) - Integer.valueOf(s2);
                }
                return s1.compareTo(s2);
            }
        });
        
        System.out.println("\nTăng dần --> " + Arrays.toString(strings));
        
        // Sắp xếp mảng theo thứ tự giảm dần
        Arrays.sort(strings, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s2 == null) {
                    return -1;
                }
                if (s1 == null && s2 != null) {
                    return 1;
                }
                if (s1.equals("Special")) {
                    return -1;
                }
                if (s2.equals("Special")) {
                    return 1;
                }
                if (isNumber(s1) && isNumber(s2)) {
                    return Integer.valueOf(s2) - Integer.valueOf(s1);
                }
                return s2.compareTo(s1);
            }
        }));
        
        System.out.println("Giảm dần --> " + Arrays.toString(strings));
    }

    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
