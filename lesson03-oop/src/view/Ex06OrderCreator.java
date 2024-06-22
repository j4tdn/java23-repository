package view;

public class Ex06OrderCreator {
	private String s1;
	private static String s2;
	
	public static void main(String[] args) {
		Ex06OrderCreator o1 = new Ex06OrderCreator();
		o1.test01();
		
		Ex06OrderCreator.test02();
	}
	
	//non-static
	//chỉ thật sự được tạo ra khi có đối tượng được tạo ra
	public void test01 () {
		s1 = "hello";
		s2 = "xin chào";
	}
	
	//static
	//load class sẽ khởi tạo luôn
	public static void test02() {
//		s1 = "hello"; -> ko biết s1 là gì !!
		s2 = "xin chào";
	}
	
	//--> static gọi static -> OK
	// non gọi non -> ok
	// non gọi static -> ok
	
	//static gọi non -> Ko được
	//Vì lúc khởi tạo thằng non chưa được tạo ra
}
