package string.immutable;

public class Ex01StringImmutable {
	public static void main(String[] args) {
		// String Literal: Gán giá trị trực tiếp cho String
		// : Lưu ở HEAP, constant pool (vùng nhớ lưu trữ giá trị không trùng nhau)

		String s1 = "hello";
		String s2 = "xin chào";
		String s3 = "hello";
		String s4 = "tạm biệt";

		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		hash("s4", s4);

		// String Object: Khởi tạo đối tượng rồi gán cho String
		// : Lưu ở HEAP
		System.out.println("\n");

		String s11 = new String("hello");
		String s22 = new String("xin chào");
		String s33 = new String("hello");
		String s44 = new String("tạm biệt");

		hash("s11", s11);
		hash("s22", s22);
		hash("s33", s33);
		hash("s44", s44);

		// immutable: Ko thể cập nhập giá trị của ô nhớ tại Heap
		s44 = "Java";
		hash("s44", s44);

		// Immutable: 100% --> String Literal
		// Mảng String gồm 5 phần tử
		// Gộp 5 phần từ thành 1 chuỗi --> String
		// String String String String String --> String
	}

	private static void hash(String prefix, String s) {
		System.out.println(prefix + " --> " + System.identityHashCode(s));
	}
}
