import java.util.Scanner;

public class Ex02 {
	
	public static void main (String args[]) {		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Nhập họ tên (chỉ gồm các kí tự [A-Z, a-z]): ");
	     String input = scanner.nextLine().trim();
	     
	     if (!input.matches("[A-Za-z ]+")) {
	            System.out.println("Chuỗi chứa kí tự không hợp lệ. Vui lòng chỉ nhập các kí tự từ A-Z, a-z và khoảng trắng.");
	            return;
	        }
	     
	     String[] words = input.split("\\s+");
	     StringBuilder result = new StringBuilder();
	     
	     for (String word : words) {
	            if (word.length() > 0) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	     
	     System.out.println("Chuỗi sau khi viết hoa chữ cái đầu mỗi từ: ");
	     System.out.println(result.toString().trim());
	     }
	}
}
