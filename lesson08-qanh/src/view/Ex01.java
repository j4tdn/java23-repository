package view;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi tiếng việt có dấu và đấu cách :");
        String input = sc.nextLine();

        System.out.println("mỗi ký tự trên một dòng là :");
        printEachCharacter(input);

        System.out.println("\nmỗi từ trên một dòng là :");
        printEachWord(input);

        System.out.println("\nchuỗi đảo ngược theo ký tự là :");
        System.out.println(reverseByCharacters(input));

        System.out.println("\nchuỗi đảo ngược theo từ laf :");
        System.out.println(reverseByWords(input));
    }

    public static void printEachCharacter(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }

    public static void printEachWord(String input) {
        String[] words = input.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static String reverseByCharacters(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }


    public static String reverseByWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}
