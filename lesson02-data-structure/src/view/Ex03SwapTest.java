package view;

import bean.CustomInt;

public class Ex03SwapTest {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		swapInt(a, b);
		System.out.println("a --> "+a);
		System.out.println("b --> "+b);
		
		CustomInt p1 = new CustomInt(5);
		CustomInt p2 = new CustomInt(7);
		swapCustomInt(p1, p2);	
		System.out.println("p1 --> "+p1);
		System.out.println("p2 --> "+p2);
	}
	
	private static void swapInt(int p1, int p2) {
		int temp = p1;
		p1 = p2;
		p2 = temp;
	}
	private static void swapCustomInt(CustomInt p1, CustomInt p2) {
		int temp = p1.value;
		p1.value = p2.value;
		p2.value = temp;
	}
}
