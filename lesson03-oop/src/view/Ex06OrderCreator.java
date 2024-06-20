package view;

public class Ex06OrderCreator {
 
	private String s1;
		private static String s2;
	 
		public static void main(String[] args) {
			Ex06OrderCreator o1 = new Ex06OrderCreator();
		}
		
	  public void test01() {
		  s1 = "hello";
		  s2 = "xin chao";
		  test02();
	  }
	  
	  public void test02() {
		  test04();
	  }
	  
//	  static
//	  load class 100% sẽ được khởi tạo 
	  
	  public static void test03() {
//		  s1 = "Hello"; ko biết đối tượng nào cho s1
		  s2 = "xin chào";
		  test04();
//		  test02();
	  }
	  
	  public static void test04() {
//		  test02();
			Ex06OrderCreator oz = new Ex06OrderCreator();
			oz.test02();
	  }
	  
//	  static gọi static --> ok 
//	  non gọi non --> ok
//	  non gọi static --> ok
	  
//	  static gọi non  --> false
//	  muốn gọi được phải có đối tượng gọi là non-static method/attribute
	  
	  
}
