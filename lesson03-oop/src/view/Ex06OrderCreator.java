package view;

public class Ex06OrderCreator {
	
	private String s1;
	private static String s2;
	public static void main(String[] args) {
		Ex06OrderCreator o1 = new Ex06OrderCreator();
		o1.test01();
	}
	
	// hàm non-static
	// chưa dc tạo ra, nó chỉ dc tạo ra khi có đối tượng tạo ra
	public void test01() {
		s1 = "hello";
		s2 = "xin chào";
	}
	
	public void test02() {
		test04(); // non-static có thể gọi static(dùng chung)
	}

	// hàm static
	// load class 100% sẽ được tạo ra ko quan tâm đối tượng
	public static void test03() {
//		s1 = "hello";  // báo lỗi vì nó ko hiểu thuộc đối tượng nào gọi
		s2 = "xin chào";
	}

	public static void test04() {
//		test02();	// nhưng static thì ko gọi dc non-static vì nó non-static thuộc từng đối tượng và gọi thông qua đối tượng nên 
	}
	
	
	
	/*
	 	static      gọi static  	---> ok
	 	non-static  gọi non-static  ---> ok
	 	non-static  gọi static 		---> ok
	 	
	 	static  	gọi non-static  ---> failed
	 		-> muốn gọi phải có/biết đối tượng gọi non-static  method/attribute
	 */
}
