package string.immutable;

public class Ex01StringImmutable {

	
	public static void main(String[] args) {
		//String Literal : gán giá trị trực tiếp cho biến String
						// : lưu ở heap, constant pool (Vùng nhớ lưu trữ các giá trị k trùng nhau)
		String s1 = "hello";
		String s2 = "xin chao";
		String s3 = "hello";
		String s4 = "tạm biệt";
		
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		hash("s4", s4);
		
		System.out.println("\n");
		
		// String Object : Khởi tạo đối tượng chứa giá trị rồi gán cho String
						//: lưu ở heap
		
		String s11 = new String("hello");
		String s22 = new String("xin chao");
		String s33 = new String("hello");
		String s44 = new String("tạm biệt");
		
		hash("s11", s11);
		hash("s22", s22);
		hash("s33", s33);
		hash("s44", s44);
		
		// immutable: ko thể cập nhật giá trị của ô nhớ tại heap
		s44 = "Java";
		hash("s44", s44);
		// immutable : 100% -> String Literal
	
		// Mảng String gồm n phần tử
		// Gộp n phần tử thành 1 chuỗi -> Sring
		// String String String String String ... -> String
	}
	private static void hash(String prefix, String s) {
		System.out.println(prefix + " --> " + System.identityHashCode(s));
	}
}