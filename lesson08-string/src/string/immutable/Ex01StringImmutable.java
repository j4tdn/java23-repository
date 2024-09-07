package string.immutable;

public class Ex01StringImmutable {

	public static void main(String[] args) {
		// String Literal: Gan tra tri truc tiep cho bien String
		//			     : Luu o HEAP, constant pool(vung nho luu tru cac gia tri ko trung nhau)
		
		String s1 = "hello";
		String s2 = "xin chao";
		String s3 = "hello";
		String s4 = "tam biet";
		s3 = s4;
			
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		hash("s4", s4);
		
		System.out.println("\n");
		
		// String Objet: Khoi tao doi tuong chua gia tri roi gan cho String
		//			   : Luu o HEAP
		
		String s11 = "hello";
		String s22 = "xin chao";
		String s33 = "hello";
		String s44 = "tam biet";
		
		hash("s11", s11);
		hash("s22", s22);
		hash("s33", s33);
		hash("s44", s44);
		
		// immutable: ko the cap nhat gia tri cua o nho tai HEAP
		s44 = "Java";
		hash("s44", s44);

		// Immutable: 100% --> String Literal
		
		// Mảng String gồm 5 phần tử
		// Gộp 5 phần tử thành 1 chuỗi --> String
		// String String String String String --> String
	}
	
	private static void hash(String prefix, String s) {
		System.out.println(prefix + " --> " + System.identityHashCode(s));
	}
}
