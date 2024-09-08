package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tiếng việt có dấu và dấu cách:");
        String input = scanner.nextLine();

        
        String output = removeAccent(input);
        System.out.println("Chuỗi không dấu: " + output);
    }

    public static String removeAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);  
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");  
        return pattern.matcher(temp).replaceAll("").replaceAll("đ", "d").replaceAll("Đ", "D");
    }
}
