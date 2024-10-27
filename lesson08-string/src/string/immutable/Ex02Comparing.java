package string.immutable;

import bean.Item;

public class Ex02Comparing {
	/*
	 * So sanh
	 * + KDL nguyen thuy: < > >= <= !=
	 * 					: so sanh gia tri o stack
	 * 
	 * + KDL doi tuong: su dung ==, != so sanh gia tri cua bien o stack
	 * 					: 100% thua ke tu class Object(co ham equal)
	 * 					--> su dung ham equals mac dinh --> so sanh gia tri o stack
	 * 					: neu muon so sanh gia tri cua doi tuong o heap --> overide lai ham equals
	 * 
	 * SO Sanh chuoi 
	 */
	public static void main(String[] args) {
		Item i1 = new Item();
		Item i2 = new Item();
		
		Item i3 = new Item(88, "Item 88");
		Item i4 = new Item(66, "Item 66");
		Item i5 = new Item(88, "Item 88");
		System.out.println("========Toan tu =========");
		System.out.println("(i1==i2) --> " + (i1==i2));
		System.out.println("(i3==i4) --> " + (i3==i4));
		System.out.println("(i3==i5) --> " + (i3==i5));
		
		// Object#equals --> == 
		// Expect: 2 doi tuong Item bang nhau neu chung id
		//		: override equals tu Object
		
		System.out.println("========Ham equals =========");
		System.out.println("(i1 eq i2) --> " + (i1.equals(i2)));
		System.out.println("(i3 eq i4) --> " + (i3.equals(i4)));
		System.out.println("(i3 eq i5) --> " + (i3.equals(i5)));
		
		// Thong thuong su dung #equals de so sanh 2 doi tuong
		
		System.out.println("\n");
		
		String s1 ="hello";
		String s2 ="bye";
		String s3 ="glass";
		String s4 ="hello";
		
		System.out.println("(s1==s2) --> " + (s1==s2));
		System.out.println("(s1==s3) --> " + (s1==s3));
		System.out.println("(s1==s4) --> " + (s1==s4));
		
		System.out.println("(s1 eq s2) --> " + (s1.equals(s2)));	
		System.out.println("(s1 eq s3) --> " + (s1.equals(s3)));
		System.out.println("(s1 eq s4) --> " + (s1.equals(s4)));
		
		System.out.println("\n");
		
		System.out.println("=====Comparable=======");
		System.out.println("s1 > s2 ? " + s1.compareTo(s2));
		System.out.println("s1 > s3 ? " + s1.compareTo(s3));
	}	
}
