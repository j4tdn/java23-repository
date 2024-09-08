package string.immutable;

public class Ex01StringImmutable {

	public static void main(String[] args) {
		// String Literal : Gán giá trị trực tiếp cho biến String
		//                 : Lưu ở HEAP , constant pool (vùng lưu trữ giá trị không trùng nhau)
		String s1 = "hello";
		String s2 = "xin chao";
		String s3 = "hello";
		String s4 = "tam biet";
	
		hash("s1",s1);
		hash("s2",s2);
		hash("s3",s3);
		hash("s4",s4);
		
		System.out.println("\n");
		// String Object: khởi tạo đối tượng chứa giá trị rồi mới gán cho String 
		//              : lưu ở heap
		String s11 = new String("hello");
		String s22 =  new String("xin chao");
		String s33 =  new String("hello");
		String s44 =  new String("tam biet");

		hash("s11",s11);
		hash("s22",s22);
		hash("s33",s33);
		hash("s44",s44);
		
		// immutable :  không thể cập nhật giá trị của ô nhớ tại heap
		s44 = "Java";
		hash("s44",s44);
		// Immutable 100% --> String Literal
		
	}
	private static void hash(String prefix, String s) {
		System.out.println(prefix + " --> " + System.identityHashCode(s));
	}

}
