import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
		
	/*
	 Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
		Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
		In ra mỗi kí tự trên một dòng
		In ra mỗi từ trên mỗi dòng
		In ra chuỗi đảo ngược theo kí tự
		In ra chuỗi đảo ngược theo từ
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Please enter any string of characters: ");
		String s = ip.nextLine();
		System.out.println("Prints each character per line: ");
		printsCharat(s);
		System.out.println("Print out each word per line: ");
		printSWords(s);
		System.out.println("Prints the string reversed by character: ");
		reverseCharat(s);
		System.out.println("Print out the string reversed word by word: ");
		StringBuilder reverse = new StringBuilder(s);
		System.out.println(reverse.reverse());
	}
	private static void printsCharat(String  s) {
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i ) + " ");
		}
		System.out.println();
	}
	private static void printSWords(String s) {
		String [] words = s.split("//s+");
		System.out.println(Arrays.toString(words));
	}
	private static void reverseCharat(String s) {
		for(int i = s.length() - 1; i >=0; i--) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
	}

}
