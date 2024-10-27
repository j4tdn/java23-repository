package generic.method;

import bean.Item;

public class Ex01GenericMethodDemo {

	public static void main(String[] args) {
		int x1 =12;
		String x2 = "Abc";
		Item x3 = new Item();
		
		printf(x1);
		printf(x2);
		printf(x3);
		
		System.out.println("\n=============\n");
		printg(x1);
		printg(x2);
		printg(x3);
	}

	private static <E> void printg(E val) {
		System.out.println("printg --> " +val);
	}
	
	private static void printf(Object val) {
		System.out.println("printf ---> " +val);
	}
	
	/*
	 * Thay vì phải viết nhiều hàm cho từng KDL 
	 * thì ta sẽ dùng áp dụng thừa kế + đa hình trong đối tượng 
       Tham số có KDL cha có thể nhận vào chính nó hoặc con của nó
	 */
	
	private static void printfInt(Integer val) {
		System.out.println(" printfInt  --> " +val);
	}
	
	private static void printfString(String val) {
		System.out.println(" printfString  --> " +val);
	}
	
	private static void printfItem(Item val) {
		System.out.println(" printfItem  --> " +val);
	}
}
