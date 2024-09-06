package string.immutable;

public class Ex01StringImmutable {

	
	public static void main(String[] args) {
		// String Literal: gán giá trị trực tiếp cho biến String
//						 : lưu ở heap, constant pool(vùng nhớ lưu trữ các giá trị ko trùng nhau)
		String s1 = "hello" ;
		String s2 = "xin chào" ;
		String s3 = "hello" ;
		String s4 = "tạm biệt" ;
		
		s3 = s4;
		
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		hash("s4", s4);
		
		System.out.println("\n");
		
		// String Object: khởi tạo đối tượng chứa giá trị rồi gán cho String
		String s11 = new String("hello") ;
		String s22 = new String("xin chào") ;
		String s33 = new String("hello") ;
		String s44 = new String("tạm biệt") ;
		
		s3 = s4;
		
		hash("s11", s11);
		hash("s22", s22);
		hash("s33", s33);
		hash("s44", s44);
		
//		immutable: ko thể cập nhật giá trị của ô nhớ tại heap
		s44 = "Java";
		hash("s44", s44);
		
		// -> 100% dùng String Literal
		
		// Mảng String gồm 5 phần tử thành 1 chuỗi --> String
		// String + String + String + String + String --> String
//		==> Stringmutable
	}
	
	private static void hash(String prefix, String s) {
		System.out.println(prefix + "--> " + System.identityHashCode(s));
	}
}
