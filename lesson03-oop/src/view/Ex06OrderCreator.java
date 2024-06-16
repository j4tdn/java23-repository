package view;

public class Ex06OrderCreator {

	private String s1;
	private static String s2;
	
	
	public static void main(String[] args) {
		Ex06OrderCreator o1 = new Ex06OrderCreator();
		o1.test01();
		
	}
	
	// non-static
	// chỉ thật sự được tạo ra khi có đối tượng tạo ra
	public void test01() {
		s1 = "hello";
		s2 = "xin chào";
		
	}
	
	public void test02() {
		test04();
	}
	
	// static
	// load class 100% sẽ được khởi tạo
	public static void test03() {
		// s1 = "hello"; // không biết đối tượng nào cho s1
		s2 = "xin chào";
		test04();
		
	}

	public static void test04() {
		// test02();
		Ex06OrderCreator oz = new Ex06OrderCreator();
		oz.test02();
	}
	
	// static gọi static --> ok
	// non static gọi non --> okk
	// non        gọi static --> okk
	
	// static gọi non --> failed
	// muốn gói được phải có/biết đối tượng gọi non-static method/attribute
}
