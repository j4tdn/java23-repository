package string.immutable;

public class Ex01StringImmutable {
	public static void main(String[] args) {
		// String Literal: gan gia tri truc tiep cho bien String
		//				: luu tru o heap, cóntant pool (vùng nhớ lưu trữ các giá trị ko trugnf nhau)
		
		String s1 = "hello";
		String s2 = "xin chào";
		String s3 = "hello";
		String s4 = "tạm biệt";
		
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		hash("s4", s4);
		// String Object: Khởi tạo đối tượng chứa giá trị rồi gán cho String 
		//				: lưu ở heap
		
		String s11 = new String("hello");
		String s22 = new String("xin chào");
		String s33 = new String ("hello");
		String s44 = new String("tạm biệt");
		
		hash("s11", s11);
		hash("s22", s22);
		hash("s33", s33);
		hash("s44", s44);
		
		// immutable: k thể cập nhật giá trị của ô nhớ tại heap
		s44 = "Java";
		hash("s44", s44);
		
		// 100% --> String Literal
		// Immutable: 100% --> String Literal
		
		// Mảng String gồm 5 phần tử 
		// Gộp 5 phần tử thành 1 chuỗi --> String 
		// String String String String String String --> String
		
	}
	
	private static void hash(String prefix, String s) {
		System.out.println(prefix + " --> " + System.identityHashCode(s));
	}
}
