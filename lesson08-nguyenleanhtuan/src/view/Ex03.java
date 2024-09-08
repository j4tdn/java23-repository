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

    public static String removeAccent(String input) {
        String normalizedString = Normalizer.normalize(input, Normalizer.Form.NFD);
        
        Pattern accentPattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        
        String result = accentPattern.matcher(normalizedString)
                                    .replaceAll("")  
                                    .replaceAll("đ", "d")  
                                    .replaceAll("Đ", "D");  
        
        return result; // Trả về chuỗi không dấu
    }
}
