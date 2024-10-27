package string;

import bean.Item;

public class Ex02Comparing {

	public static void main(String[] args) {
		
		Item i1 = new Item();
		Item i2 = new Item();
		
		Item i3 = new Item(88, "Item 88");
		Item i4 = new Item(66, "Item 66");
		Item i5 = new Item(88, "Item 88");
		
		System.out.println("======== Toán tử '==' ========");
		System.out.println("(i1==i2) --> " + (i1==i2)); // F
		System.out.println("(i3==i4) --> " + (i3==i4)); // F
		System.out.println("(i3==i5) --> " + (i3==i5)); // F
		
		System.out.println("======== Hàm 'equals' ========");
		System.out.println("(i1 eq i2) --> " + (i1.equals(i2))); // T
		System.out.println("(i3 eq i4) --> " + (i3.equals(i4))); // F
		System.out.println("(i3 eq i5) --> " + (i3.equals(i5))); // T
		
		System.out.println("\n");
		
		String s1 = "hello";
		String s2 = "bye";
		String s3 = "glass";
		String s4 = "hello";
		
		System.out.println("(s1==s2) --> " + (s1==s2)); // F
		System.out.println("(s1==s3) --> " + (s1==s3)); // F
		System.out.println("(s1==s4) --> " + (s1==s4)); // T
		
		System.out.println("(s1 eq s2) --> " + (s1.equals(s2))); // F
		System.out.println("(s1 eq s3) --> " + (s1.equals(s3))); // F
		System.out.println("(s1 eq s4) --> " + (s1.equals(s4))); // T
		
		System.out.println("\n");
		
		System.out.println("====== Comparable ======");
		System.out.println("s1 > s2 ? " + s1.compareTo(s2));
		System.out.println("s1 > s3 ? " + s1.compareTo(s3));
		System.out.println("s1 > s4 ? " + s1.compareTo(s4));
		
	}
	
}