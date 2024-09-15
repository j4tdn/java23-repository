package string.immutable;

import java.util.Arrays;

public class Ex03StringPractical {

	/*
	 
	 1. Tính chiều dìa của chuỗi s
	 2. Nối chuỗi s1 vào chuỗi s
	 3. Lấy 1 ký tự tại vị trí index(3) trong chuỗi s
	 4. Duyệt từng kí tự, từ trong chuỗi
	 5. Tìm vị trí - chỉ số xuất hiện đầu tiên, cuối cùng của kí tự "a"
	 6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không
	 7. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
	 8. Loại bỏ các khoảng trắng thừa của chuỗi s3
	 9. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
	 10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
	 
	 */
	public static void main(String[] args) {
		
		String s = "hello - welcome to K23 class";
		String s1 = "04.09.2024";
		
		// 1.
		System.out.println("1. Tính chiều dài chuỗi s --> " + s.length());
		
		// 2. 
		// s = s + s1; // s = s.concat(s1);
		String s2 = String.join(" ", s, s1);
		System.out.println("2. Nối chuỗi s --> " + s2);
		
		// 3. 
		System.out.println("3. Lấy kí tự tại vị trí có index=3 --> " + s.charAt(3));
		
		// 4.
		printSLetters(s);
		printSWords(s);
		
		// 5.
		String song = "d:/music/somethingyoulike.mp3";
		System.out.println("Vị trí đầu tiên của / --> " + song.indexOf("/"));
		System.out.println("Vị trí cuối cùng của / --> " + song.lastIndexOf("/"));
		System.out.println("Vị trí cuối cùng của . --> " + song.lastIndexOf("."));
		System.out.println("Tên bài hát --> " 
		+ song.substring(song.lastIndexOf("/") + 1, song.indexOf("."))); // [a, b)
		
	}
	
	private static void printSWords(String s) {
		String[] words = s.split("[\\s-]+");
		System.out.println("S Words: " + Arrays.toString(words));
	}
	
	private static void printSLetters(String s) {
		System.out.print("S Letters: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
	}
	
	
}