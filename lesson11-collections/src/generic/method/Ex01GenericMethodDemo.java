package generic.method;

import bean.Item;

public class Ex01GenericMethodDemo {

	public static void main(String[] args) {
		
		Integer x1 = 3;
		String x2 = "Hello";
		Item x3 = new Item();
		
		// đa hình
		printf(x1);
		printf(x2);
		printf(x3);
		
		System.out.println();
		
		// generic method
		printg(x1);
		printg(x2);
		printg(x3);
	}
	
	private static <E> void printg(E val) {
		System.out.println("printf --> " + val);
	}
	
	private static void printf(Object val) {
		System.out.println("printf --> " + val);
	}
}
