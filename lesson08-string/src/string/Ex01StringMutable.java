package string;

public class Ex01StringMutable {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "xin chào";
		String s3 = "hello";
		String s4 = "tạm biệt";
		
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		hash("s4", s4);
		
		System.out.println("\n");
		
		String s11 = new String("hello");
		String s22 = new String("xin chào");
		String s33 = new String("hello");
		String s44 = new String("tạm biệt");
		
		hash("s11", s11);
		hash("s22", s22);
		hash("s33", s33);
		hash("s44", s44);
		
		s44 = "Java";
		hash("s44", s44);
		
}
	
	private static void hash(String prefix, String s) {
		System.out.println(prefix + " --> " + System.identityHashCode(s));
		
	}
	
}
