package string.immutable;


import java.util.Arrays;

public class Ex03StringPratical {
	
	/*
	  • Tính chiều dài của chuỗi s 
	  • Nối chuỗi s1 vào chuỗi s 
	  • Lấy một ký tự tại vị trí index(3) trong chuỗi s 
	  • Duyệt từng phần tử trong chuỗi 
	  • Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “a” trong chuỗi s
	  • Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
	  • Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
	  • Loại bỏ các khoảng trắng thừa của chuỗi s3
	  • Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
	  • Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
	 */
	
	public static void main(String[] args) {
		String s = "hello - welcome to K23 class ";
		String s1 = "04.09.2024";
		System.out.println("1. Chiều dài chuỗi s --> " + s.length());
		s = s+s1;
//		s = s.concat(s1); ko khác j cách trên
		String s2 = String.join(" ", s1, s);
		System.out.println("2. Nối chuỗi s --> " + s2);
		
		System.out.println("3. Lấy kí tự tại vị trí có index=3 --> " + s.charAt(3));

		System.out.print("4. Duyệt từng phần tử trong chuỗi --> ");printSLetters(s);
		
		System.out.println("5. In ra từng từ --> "); printSword(s);
	
		String song = "d:/music/somthingyoulike.mp3";
		System.out.println("Ví trí đầu tiên của dấu / --> " + song.indexOf("/"));
		System.out.println("Ví trí cuối cùng của dấu / --> " + song.lastIndexOf("/"));
		System.out.println("Ví trí cuối cùng của dấu . --> " + song.lastIndexOf("."));
		System.out.println("6. Tên bài hát --> " 
		+ song.substring(song.lastIndexOf("/")+1, song.lastIndexOf(".")));
	
	}
	
	private static void printSword(String s) {
		String[] words = s.split("[\\s-]+");
		System.out.println("S words: " + Arrays.toString(words));
	}
	
	private static void printSLetters(String s) {
		for(int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
	}
	
}
