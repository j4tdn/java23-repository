package src;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {

    public static String removeAccent(String s) {

        String normalized = Normalizer.normalize(s, Normalizer.Form.NFD);

        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("").replaceAll("đ", "d").replaceAll("Đ", "D");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi tieng Viet co dau:");
        String input = scanner.nextLine();

        String output = removeAccent(input);

        System.out.println("In ra chuoi tieng Viet ko dau: " + output);

        scanner.close();
        
    }
    
}


