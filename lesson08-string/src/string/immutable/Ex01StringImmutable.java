package string.immutable;

public class Ex01StringImmutable {
	
	public static void main(String[] args) {
		// String Literal: Gán giá trị trực tiếp cho biến String
				//               : lưu ở heap, constant pool(vùng nhớ lưu trữ các giá trị ko trùng nhau)
		String s1= "hello";
		String s2= "xin chao";
		String s3="hello";
		String s4="tam biet";
//		s3=s4;
		
		
		hash("s1",s1);
		hash("s2",s2);
		hash("s3",s3);
		hash("s4",s4);
		System.out.println("\n");

		// String Object: Khởi tạo đối tượng chứa giá trị rồi gán cho String
		//              : lưu ở heap
		
		
		String s11= new String("hello");
		String s22= new String("xin chao");
		String s33=new String("hello");
		String s44=new String("tam biet");
//		s3=s4;
		
		// immutable: ko thể cập nhật giá trị của ô nhớ tại heap
		
		hash("s11",s11);
		hash("s22",s22);
		hash("s33",s33);
		
		// Immutable: 100% --> String Literal
		
				// Mảng String gồm 5 phần tử
				// Gộp 5 phần tử thành 1 chuỗi --> String
				// String String String String String --> String
		s44= "Java";
		hash("s44",s44);
	}
	private static void hash(String s,String prefix) {
		System.out.println(prefix +"-->"+System.identityHashCode(s)); 
	}
}
