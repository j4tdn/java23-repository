package view;

import java.util.Scanner;

public class Ex04ReadNumber {

	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập số lượng số cần đọc: ");
        int n = Integer.parseInt(ip.nextLine());
        
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + " (0-999): ");
            numbers[i] = Integer.parseInt(ip.nextLine());
        }
        
        for (int number : numbers) {
            System.out.println(number + " => " + readNumber(number));
        }
        
        ip.close();
    }

    public static String readNumber(int number) {
        if (number < 0 || number > 999) {
            throw new IllegalArgumentException("Số phải nằm trong khoảng từ 0 đến 999.");
        }

        String[] units = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int unit = number % 10;

        StringBuilder result = new StringBuilder();

        if (hundred > 0) {
            result.append(units[hundred]).append(" trăm ");
            if (ten == 0 && unit != 0) {
                result.append("linh ").append(unit == 1 ? "một" : units[unit]);
            } else if (ten == 0 && unit == 0) {
                return result.toString().trim();
            } else if (ten == 1) {
                result.append("mười ");
                if (unit == 1) {
                    result.append("một");
                } else if (unit == 5) {
                    result.append("lăm");
                } else {
                    result.append(units[unit]);
                }
            } else {
                result.append(tens[ten]).append(" ");
                if (unit == 1) {
                    result.append("mốt");
                } else if (unit == 5) {
                    result.append("lăm");
                } else {
                    result.append(units[unit]);
                }
            }
        } else if (ten > 0) {
            if (ten == 1) {
                result.append("mười ");
                if (unit == 1) {
                    result.append("một");
                } else if (unit == 5) {
                    result.append("lăm");
                } else {
                    result.append(units[unit]);
                }
            } else {
                result.append(tens[ten]).append(" ");
                if (unit == 1) {
                    result.append("mốt");
                } else if (unit == 5) {
                    result.append("lăm");
                } else {
                    result.append(units[unit]);
                }
            }
        } else {
            result.append(units[unit]);
        }

        return result.toString().trim();
    }
	
}
