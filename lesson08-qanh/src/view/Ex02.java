package view;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào họ tên chỉ bao gồm các kí tự [A-Za-z ]:");
        String fullname = sc.nextLine();

     
        String Fullnameincapitalletters = capitalletters(fullname);
        System.out.println("Họ tên cuoi cùng là: " + Fullnameincapitalletters);
    }

    
    public static String capitalletters(String hoTen) {
        String[] words = hoTen.trim().toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))  
                      .append(word.substring(1))  
                      .append(" ");  
            }
        }


        return result.toString().trim();
    }
}

