package src;

import java.util.Scanner;

public class Ex02 {
		
		public static String capitalizeWord(String word) {
	        word = word.toLowerCase();
	        return word.substring(0, 1).toUpperCase() + word.substring(1);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhap vao ho ten:");
	        String input = scanner.nextLine();

	        String[] words = input.split("\\s+");

	        StringBuilder formattedName = new StringBuilder();

	        for (String word : words) {
	            if (!word.matches("[A-Za-z]+")) {
	                System.out.println("Ten chi duoc phep chua cac ki tu chu cai [A-Za-z]");
	                return;
	            }
	            formattedName.append(capitalizeWord(word)).append(" ");
	        }

	        System.out.println("Ten da dinh dang: " + formattedName.toString().trim());
	        
	        scanner.close();
	  
	}
	
}
