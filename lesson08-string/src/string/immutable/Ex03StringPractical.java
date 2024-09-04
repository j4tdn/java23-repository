package string.immutable;

import java.util.Arrays;

public class Ex03StringPractical {

	public static void main(String[] args) {
		
		
		String s = "hello - wellcome to K23 class";
		String s1 = "04.09.2024";
		System.out.println("1. Chiều dài chuỗi s --> " + s.length());
		// s = s + s1; // s = s.concat(s1);
		String s2 = String.join(" ", s, s1);
		System.out.println("2. Nối chuỗi s -->" + s2);
		System.out.println("3. Lấy ký tự tại vị trí có index - 3 --> " + s.charAt(3));
		printSLetters(s);
		printSWord(s);
		
		String song = "d:/music/somethingyoulike.mp3";
		System.out.println("Vị trí đầu tiên của / --> " + song.indexOf("/"));
		System.out.println("Vị trí cuối cùng của / --> " + song.lastIndexOf("/"));
		System.out.println("Vị trí cuối cùng của / --> " + song.lastIndexOf("."));
		System.out.println("Tên bài hát --> " 
				+ song.subSequence(song.lastIndexOf("/") + 1	, song.lastIndexOf(".")));
		
	}
	
	private static void printSWord(String s) {
		String[] words = s.split("[\\s-]+");
		System.out.println("S words: " + Arrays.toString(words));
	}
	
	private static void printSLetters(String s) {
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
	}
	
}
