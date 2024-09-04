package string.immutable;

public class Ex01StringImmutable {

	public static void main(String[] args) {
		
		// String Literal: Gán giá trị trực tiếp cho biến String
		//				 : Lưu ở heap, constant pool (vùng nhớ lưu trữ các giá trị không trùng nhau
		
		String s1 = "Hello";
		String s2 = "Xin Chào";
		String s3 = "Hello";
		String s4 = "Tạm biệt";
		
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		hash("s4", s4);
		
		System.out.println("\n");
		
		// String Object: Khởi tạo đối tượng chứa giá trị rồi gán cho String
		//				: Lưu ở Heap
		String s11 = new String("Hello");
		String s22 = new String("Xin Chào");
		String s33 = new String("Hello");
		String s44 = new String("Tạm biệt");
		
		hash("s11", s11);
		hash("s22", s22);
		hash("s33", s33);
		hash("s44", s44);
		
		// immutable: không thể cập nhật giá trị ô nhớ tại heap
		s44 = "Java";
		hash("s44", s44);
		
		// Immutable: 100% sử dụng String Literal
		
		// Mảng String gồm 5 phần tử
		// -> gộp 5 phần tử thành 1 chuỗi --> String
		// String String String String String --> String
		
	}
	
	private static void hash(String prefix, String s) {
		System.out.println(prefix + " --> " + System.identityHashCode(s));
	}
	
}
