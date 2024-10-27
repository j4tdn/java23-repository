package generic.method;

import bean.Item;

public class Ex01GenericMethodDemo {
	public static void main(String[] args) {
		Integer x1 = 10;
		String x2 = "hello";
		Item x3 = new Item();

		// đa hình
		printf(x1);
		printf(x2);
		printf(x3);

		// generic method
		printg(x1);
		printg(x2);
		printg(x3);
	}

	// áp dụng thừa kế + đa hình
	// tham số KDL cha có nhận vào chính nó hoặc KDL con
	private static void printf(Object val) {
		System.out.println("printf --> " + val);
	}

	// áp dụng generic type
	private static <E> void printg(E val) {
		System.out.println("printg --> " + val);
	}
}
