package string.immutable;

import java.util.Arrays;

public class Ex03StringPractical {

	/*
	  
	 1.  Tính chiều dài của chuỗi s
     2.  Nối chuỗi s1 vào chuỗi s
     3.  Lấy một ký tự tại vị trí index(3) trong chuỗi s
     4.  Duyệt từng kí tự, từ trong chuỗi
     5.  Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự 'a' trong chuỗi s
     6.  Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
     7.  Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
     8.  Loại bỏ các khoảng trắng thừa của chuỗi s3
     9.  Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
     10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
     
	*/
	
	public static void main(String[] args) {

		String s = "hello - welcome to K23 class";
		String s1 = "04.09.2024";

		System.out.println("1. Chiều dài chuỗi s --> " + s.length());
		// s = s + s1; // s = s.concat(s1)
		String s2 = String.join(" ", s, s1);
		System.out.println("2. Nối chuối s --> " + s2);

		System.out.println("3. Lấy kí tự tại vị trí có index=3 --> " + s.charAt(3));

		printSLetters(s);
		printSWords(s);

		String song = "d:/music/somthingyoulike.mp3";
		System.out.println("Vị trí đầu tiên của / --> " + song.indexOf("/"));
		System.out.println("Vị trí cuối cùng của / --> " + song.lastIndexOf("/"));
		System.out.println("Vị trí cuối cùng của . --> " + song.lastIndexOf("."));
		System.out.println("Tên bài hát --> " 
				+ song.substring(song.lastIndexOf("/") + 1, song.lastIndexOf("."))); // [a, b)
	
		String s3 = "SGK123";
		System.out.println("6. Kiểm tra chuỗi bắt đầu --> " + s3.startsWith("SGK"));
		System.out.println("6. Kiểm tra chuỗi kết thúc --> " + s3.endsWith("123"));
		
		System.out.println("\ns: " + s);
		System.out.println("s replace: " + s.replace("hello", "hi"));
		
		s3 = "      welcome      to new     class     ";
		// Loại bỏ tất cả khoảng trắng ở 2 đầu trim, strip
		// Còn lại thay thế nhiều khoảng trắng = 1 khoảng trắng
		System.out.println("\ns3: " + s3);
		System.out.println("s3 remove space: |||"+ s3.strip().replaceAll("\\s+", " ") + "|||");
	
		System.out.println("existing --> " + s3.contains("welcome"));
		
	}

	// [ab]+
	// a aa aaaa
	// b bb bb bbbbbb
	// ab aab abbbba abbbba

	// [ab] --> a b ab ba
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
