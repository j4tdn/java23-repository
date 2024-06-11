package view;

import java.util.Scanner;

public class Ex06MinMax {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int a = readNumber(scanner, "a");
	        int b = readNumber(scanner, "b");
	        int c = readNumber(scanner, "c");

	        int max = Math.max(Math.max(a, b), c);
	        int min = Math.min(Math.min(a, b), c);

	        System.out.println("Số lớn nhất là: " + max);
	        System.out.println("Số nhỏ nhất là: " + min);

	        scanner.close();
	    }

	    private static int readNumber(Scanner scanner, String variableName) {
	        int number;
	        while (true) {
	            System.out.print("Nhập " + variableName + " (so nguyen trong khoang [0, 20)): ");
	            String input = scanner.nextLine().trim();
	            try {
	                number = Integer.parseInt(input);
	                if (number >= 0 && number < 20) {
	                    break;
	                } else {
	                    System.out.println("loi " + variableName + " phai la so nguyen trong khoanmg [0, 20).");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("loi vui long nhap so  nguyen");
	            }
	        }
	        return number;
	    }
	}

