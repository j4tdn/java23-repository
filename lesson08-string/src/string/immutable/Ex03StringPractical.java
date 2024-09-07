package string.immutable;

import java.util.Arrays;

public class Ex03StringPractical {

	/*
	1. Tinh chieu dai cua chuoi s
	2. Noi chuoi s1 vao chuoi s
	3. Lay 1 ky tu tai vi tri index(3) trong chuoi s
	4. Duyet tung ky tu, tu trong chuoi
	5. Tim vi tri - chi so xuat hien dau tien, cuoi cung cua ki tu "a" trong chuoi s
	6.  Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
    7.  Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
    8.  Loại bỏ các khoảng trắng thừa của chuỗi s3
    9.  Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
    10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
	
	 */
	public static void main(String[] args) {
		String s = "hello - welcome to K23 class";
		String s1 = " 04.09.2024";
		
		System.out.println("1. Chieu dai chuoi s --> " + s.length());
		s = s + s1; // s = s.concat(s1)
		
		String s2 = String.join(" ", s, s1);
		System.out.println("2. Noi chuoi s --> " + s2);
		
		System.out.println("3. Lay ky tu tai vi tri co index = 3 --> " + s.charAt(3));
		
		printSLetters(s);
		printSWords(s);
		
		String song = "d:/music/somethingyoulike.mp3";
		System.out.println("Vi tri dau tien cua / --> " + song.indexOf("/"));
		System.out.println("Vi tri cuoi cung cua / --> " + song.lastIndexOf("/"));
		System.out.println("Vi tri dau tien cua . --> " + song.lastIndexOf("."));
		System.out.println("Ten bai hat --> " + song.substring(song.lastIndexOf("/") + 1, song.lastIndexOf(".")));
	}
	private static void printSWords(String s) {
		String[] words = s.split("[\\s-]+");
		System.out.println("\nS Words: " + Arrays.toString(words));
	}
	
	private static void printSLetters(String s) {
		System.out.println("S Letters: ");
		for(int i = 0; i < s.length(); i++)
			System.out.print(s.charAt(i) + " ");
	}
}
