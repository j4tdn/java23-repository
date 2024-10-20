package generic.method;

import bean.Item;

public class Ex01GenericMethodDemo {
	
	public static void main(String[] args) {
		Integer x1 = 10;
		String x2 = "hello";
		Item x3 = new Item();
		
//		printfInt(x1);
//		printfString(x2);
//		printfItem(x3);
//		
		System.out.println();
		
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
	
	// Áp dụng thừa kế + đa hình trong đối tượng
	// Tham số KDL cha có nhận vào chính nó hoặc KDL con
	private static void printf(Object val) {
		System.out.println("printf --> " + val);
	}
	
//	private static void printfInt(Integer val) {
//		System.out.println("printfInt --> " + val);
//	}
//	
//	private static void printfString(String val) {
//		System.out.println("printfString --> " + val);
//	}
//	
//	private static void printfItem(Item val) {
//		System.out.println("printfItem --> " + val);
//	}
	
}