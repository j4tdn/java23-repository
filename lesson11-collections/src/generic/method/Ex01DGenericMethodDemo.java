package generic.method;

import bean.Item;

public class Ex01DGenericMethodDemo {
	public static void main(String[] args) {
		
		Integer x1 = 10;
		String x2 = "Hell0";
		Item x3 = new Item();
		
		printF(x1);
		printF(x2);
		printF(x3);
		System.out.println();
		printG(x1);
		printG(x2);
		printG(x3);
		
	}
	private static <E> void printG(E val) {
		System.out.println("printG --> " + val);
	}
	private static void printF(Object val) {
		System.out.println("printF --> " + val);
	}
}
