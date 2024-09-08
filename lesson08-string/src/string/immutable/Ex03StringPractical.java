package string.immutable;

public class Ex03StringPractical {

/*
  1.Tính chiều dài chuỗi s
  2.Nối chuỗi s1 vào chuỗi s
  3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
  4. Duyệt từng kí tự,từ trong chuỗi
  5. Tìm vị trí- chỉ số xuất hiện đầu tiên, cuối cùng của kí tự "a" trong chuỗi s
  6. Kiểm	
 */
     public static void main(String[] args) {
		String s = "hello - welcome to K23 class";
//		C1
		int a = s.length();
		System.out.println("length" +a);
		System.out.println("\n");
		
//		C2
		String s1 = "04.09.2024 " +s;
		System.out.println("s1 ---> "+s1);
		System.out.println("\n");

//		C3
		char s3 = s.charAt(3);
		System.out.println("s3 ---> "+s3);
		System.out.println("\n");

//		C4
		for(int i = 0; i<s.length();i++) {
				System.out.println("charArray[i]---> " +s.charAt(i));	
		}
		System.out.println("\n");

//		C4
		printSWords(s);
		System.out.println("\n");

//		C6
		String S3 = "SGK123";
		System.out.println("6. Kiểm tra chuỗi bắt đầu: " +S3.startsWith("SGK"));
		System.out.println("6. Kiểm tra chuỗi kết thúc: " +S3.endsWith("123"));
		
//		C7
		System.out.println("\ns: " +s);
		System.out.println("s replace: " +s.replace("hello", "hi"));
		
		S3 = " welcome    to  new  class";
		System.out.println("\ns3:  " +S3);
		System.out.println("s3 remove space:" +S3.replaceAll("\\s+ ", " "));
 
     
     }
     
     
     
     private static void printSWords(String s) { //C4
    	 String[] word = s.split("[\\s-]+");
     for(String string:word) {
    	 System.out.println("String[] --->" +string);
     }
     }
     
//     private static void SNT() {
//     }
}




