package view;

public class Ex06OrderCreator {

	private String s1;
	private static String s2;
	
	public static void main(String[] args) {
		Ex06OrderCreator o1 =new Ex06OrderCreator ();
		o1.test01();
		
		// o1.test03(); coi như không có
		Ex06OrderCreator.test03();
	}
	
	// non-static
	// chỉ thật sự được tạo ra khi có đối tượng tạo ra
	public void test01() {
		s1 = "Hello";
		s2 = "xin chào";
	}
	
	public void test02() {
		test04();
		test03();
	}
	
	// static
	// load class 100% sẽ được khởi tạo
	public static void test03() {
		// s1 = "Hello"; không biết đối tượng nào cho s1
		s2 = "xin chào";
		test04();
		// test02();
	}
	
	public static void test04() {
		// est02();
		Ex06OrderCreator oz = new Ex06OrderCreator();
		oz.test02();
	}
	
	// static gọi static => ok
	// non-static gọi non-static => ok
	// non-static gọi static => ok
	// static gọi non-static => failed
	// muốn gọi được phải có/biết đối tượng gọi non-static method/attribute
	
}
