import java.util.Scanner;

public class ex01 {
	public static void main (String arg[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập chuỗi có dấu: ");
        String input = scanner.nextLine();
        
        System.out.println("In ra mỗi kí tự trên một dòng:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        
        System.out.println("In ra mỗi từ trên một dòng:");
        String[] words = input.split("\\s+"); 
        for (String word : words) {
            System.out.println(word);
        }
        
        System.out.println("In ra chuỗi đảo ngược theo kí tự:");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
        
        System.out.println("In ra chuỗi đảo ngược theo từ:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
	}
}
