package string.immutable;

import java.util.Arrays;

public class Ex03StringPractical {
	
	/*
	 * Tinh chieu dai cua chuoi s
	 * Noi chuoi s1 vao chuoi s
	 * Lay 1 ky tai vi tri index(3) trong chuoi s
	 * Duyet tung ky tu, tu trong chuoi
	 * Tim vi tri - chi so xuat hien dau tien, cuoi cung cua ki tu "a"
	 * Kiem tra chuoi s1 co phai la chuoi bat dau || ket thuc trong chuoi
	 * Thay the chuoi s1 bang chuoi s2 trong chuoi s
	 * Loai bo cac khoang trang thua cua chuoi s3
	 * tao chuoi con cua chuoi s bat dau tu vi tri so 2
	 * Xac dinh chuoi s2 co ton tai trong s1 hay k
	 */
	public static void main(String[] args) {
		String s = "hello - welcome to K23 class";
		String s1 = "04.09.2024";
		
		System.out.println("1. Tinh chieu dai chuoi s --> " + s.length());
		
		String s2 = String.join(" ", s, s1);
		System.out.println("2, Noi chuoi s1 vao chuoi s --> " + s2);
		
		System.out.println("3. Lay ki tu tai vi tri co index = 3 --> " + s.charAt(4));
		
		printSLetters(s); 
		printSWords(s);
		
		String song = "d:/music/somthingyoulike.mp3";
		System.out.println("Vi tri dau tien cua / --> " + song.indexOf("/"));
		System.out.println("Vi tri cuoi cung cua / --> " + song.lastIndexOf("/"));
		System.out.println("Vi tri cuoi cung cua . --> " + song.lastIndexOf("."));
		System.out.println("Ten bai hat --> " + song.substring(song.lastIndexOf("/") + 1, song.lastIndexOf("."))); // [a, b)
	}
	// [ab]+
	// a aa aaaa
	// b bb bbbb
	// ab aab abba abbbaab
	
	//[ab] --> a b ab ba
	private static void printSWords(String s) {
		String [] words = s.split("[\\s-]+");
		System.out.println("S Words: " + Arrays.toString(words));
	}
	private static void printSLetters(String s) {
		System.out.println("S Letters: ");
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + " ");
		}
		System.out.println();
	}
}
