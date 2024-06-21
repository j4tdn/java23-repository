package view;

public class Ex06OrderCreator {

	private String s1;
	private static String s2;

	public static void main(String[] args) {

		Ex06OrderCreator o1 = new Ex06OrderCreator();
		o1.test01();
		
		// o1.test03();
		Ex06OrderCreator.test03();
	}

	// non static
	// chi thuc su dc tao ra khi co doi tuong tao ra
	public void test01() {
		s1 = "hello";
		s2 = "xin chao";
	}

	public void test02() {
		test04();
	}

	// static
	// load class 100% se dc khoi tao
	public static void test03() {
		// s1 = "hello"; ko biet doi tuong nao cho s1
		s2 = "xin chao";
		test04();
		//test02();
	}
	
	public static void test04() {
		//test02();
		Ex06OrderCreator oz = new Ex06OrderCreator();
		oz.test02();
	}
	
	/*
	 static goi static ==> ok
	 non    goi non    ==> ok
	 non    goi static ==> ok
	 static goi non    ==> failed
	 muon goi dc phai biet doi tuong goi non static method/attribute
	 */
}
