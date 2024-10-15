package view;

import java.util.Arrays;

import functional.StringComparator;

public class Ex04StringArraysSorting {

	public static void main(String[] args) {
        String[] elements = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

        System.out.println("Original:\n" + Arrays.toString(elements));

        // Ascending sort
        bubbleSort(elements, (s1, s2) -> {
            if (s1 == null) {
                return 1;
            }
            if (s2 == null) {
                return -1;
            }

            if (s1.equals("Special")) {
                return -1;
            }
            if (s2.equals("Special")) {
                return 1;
            }

            boolean s1IsNumber = isNumeric(s1);
            boolean s2IsNumber = isNumeric(s2);

            if (s1IsNumber && s2IsNumber) {
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);
                return Integer.compare(num1, num2);
            }

            if (s1IsNumber) {
                return -1;
            }
            if (s2IsNumber) {
                return 1;
            }

            return s1.compareTo(s2);
        });

        System.out.println("\nSorted ascending:\n" + Arrays.toString(elements));

        bubbleSort(elements, (s1, s2) -> {
            if (s1 == null) {
                return 1;
            }
            if (s2 == null) {
                return -1;
            }

            if (s1.equals("Special")) {
                return 1;
            }
            if (s2.equals("Special")) {
                return -1;
            }

            boolean s1IsNumber = isNumeric(s1);
            boolean s2IsNumber = isNumeric(s2);

            if (s1IsNumber && s2IsNumber) {
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);
                return Integer.compare(num2, num1);
            }

            if (s1IsNumber) {
                return 1;
            }
            if (s2IsNumber) {
                return -1;
            }

            return s2.compareTo(s1);
        });

        System.out.println("\nSorted descending:\n" + Arrays.toString(elements));
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void bubbleSort(String[] elements, StringComparator stringComp) {
        int length = elements.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (stringComp.strategy(elements[j], elements[j + 1]) > 0) {
                    String temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }
	
}
