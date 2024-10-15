package string.immutable;

import java.util.Arrays;

public class Ex03StringPractical {
	
	/*
	 * 1. Tính chiều dài s
	 * 2. Nối s1 vào s
	 * 3. Lấy 1 ký tự ở Index(3) trong s
	 * 4. Duyệt từng kí tự, từ trong chuỗi
	 * 5. Tìm vị trí - Chỉ số xuất hiện đầu tiên, cuối cùng
	 * 6. Kiểm tra s1 có phải là chuỗi bắt đầu || kết thúc
	 * 7. Thay thế s1 bằng chuỗi s2 trong s
	 * 8. Loiaj bỏ khoảng trắng thừa trong s3
	 * 9. Tạo chuỗi con của s từ vị trí số 2
	 * 10. Xác định chuỗi s2 có tồn tại trong s1?
	 */
	public static void main(String[] args) {
		String s = "hello - welcome to K23 class";
		String s1 = "04.09.2024";
		
		System.out.println("1. chiều dài --> " + s.length());
		
		// s = s + s1; // s = s.concat(s1)
		String s2 = String.join(" ", s, s1);
		System.out.println("2. nối chuỗi s --> " + s2);
		
		System.out.println("3. Lấy kí tự tại vị trí có index = 3 --> " + s.charAt(3));
		;

		printSLetters(s);

		printSWords(s);

		String song = "d:/music/somethingyoulike.mp3";
		System.out.println("vị trí đầu tiên /: " + song.indexOf("/"));
		System.out.println("vị trí đầu tiên /: " + song.lastIndexOf("/"));
		System.out.println("vị trí cuối cùng .: " + song.lastIndexOf("."));
		System.out.println("tên bài hát: " + song.substring(song.lastIndexOf("/") + 1, song.lastIndexOf(".")));

		// 8. loại bỏ khoảng trắng
		// trim, strip xoá khoảng trắng 2 đầu
		// còn lại replace nhiều khoảng trắng thành 1
		String s3 = "   welcome   to  new     class    ";
		System.out.println("\ns3: " + s3);
		System.out.println("s3 remove space: |||" + s3.strip().replaceAll("\\s+", "\s") + "|||");

		// 9.chuỗi con
		String s4 = s3.substring(2);

		//10. tồn tại:
		System.out.println("existing --> " + s3.contains("welcome"));
	}

	private static void printSWords(String s) {
		String[] words = s.split("[\\s-]+");
		System.out.println("S words: " + Arrays.toString(words));
	}

	private static void printSLetters(String s) {
		System.out.print("S letters: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + "");
		}
		System.out.println();
	}
}
