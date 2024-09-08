package string.immutable;

import java.util.Arrays;

public class Ex03StringPractical {

	
	/*
	 1. Tính chiều dài của chuỗi s
	 2. Nối chuỗi s1 vào chuỗi s
	 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
	 4. Duyệt từng ký tự, từ trong chuỗi
	 5. Tìm vị trí - chỉ số xuất hiện đầu tiên, cuối cùng của ký tự "a" trong chuỗi s
	 6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || chuỗi kết thúc
	 */
	public static void main(String[] args) {
		String s = "hello - welcome to K23 class";
		String s1 = " 04.09.2024";
		
		System.out.println("1. s length --> " + s.length() );
		String s2 = s + s1;
		System.out.println("2. Nối chuỗi s --> " + s2);
		System.out.println("3. Lấy ký tự tại vị trí có index = 3 "+ s.charAt(3));
		System.out.println("4. Duyệt từng ký tự trong chuỗi");
		for (int i = 0; i < s.length(); i++) {
			System.out.print( s.charAt(i) + " ");
		}
		
		System.out.println("\n");
//		s.split(" ");
		System.out.println("4. Duyệt từng từ trong chuỗi  --> " + Arrays.toString(s.split("[\\s-]+")));
		
		String song = "d:/music/somethingyoulike.mp3";
		System.out.println("Vị trí đầu tiên của '/' : --> " + song.indexOf('/'));
		System.out.println("Vị trí cuối cùng của '/' : --> " + song.lastIndexOf('/'));
		System.out.println("Vị trí cuối cùng của '.' : --> " + song.indexOf('.'));
		System.out.println("Tên bài hát-->"
				+ song.substring(song.lastIndexOf("/") + 1, song.lastIndexOf("."))); //[a, b)


	}
}
