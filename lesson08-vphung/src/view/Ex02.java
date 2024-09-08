package view;

import java.util.Scanner;

public class Ex02 {

	private static Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) {
        
        System.out.println("Nhập họ tên: ");
        String inputName = scanner.nextLine();
        
        if (inputName.matches("[A-Za-z\\s]+")) {
            String formattedName = formatName(inputName);
            System.out.println("Tên sau khi định dạng: " + formattedName);
        } else {
            System.out.println("Họ tên chỉ được chứa các ký tự từ A-Z, a-z và khoảng trắng.");
        }
        
    }
    
    private static String formatName(String name) {
        String[] words = name.toLowerCase().split("\\s+");
        StringBuilder formattedName = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                formattedName.append(Character.toUpperCase(word.charAt(0)))
                             .append(word.substring(1))
                             .append(" ");
            }
        }
        return formattedName.toString();
    }
}
