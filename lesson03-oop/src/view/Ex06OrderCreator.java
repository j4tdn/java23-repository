package view;

public class Ex06OrderCreator {
	private String s1;
	private static String s2;

	public static void main(String[] args) {
		Ex06OrderCreator o1 = new Ex06OrderCreator();
		o1.test01();
	}

	public void test01() {
		s1 = "Hello";
		s2 = "xinchao";
	}

	public void test02() {
		test04();
	}

	public static void test03() {
		//s1 = "Hello";
		s2 = "xinchao";
		test04();
	}

	public static void test04() {
		//test02();
		Ex06OrderCreator oz = new Ex06OrderCreator();
		oz.test02();
	}
}
