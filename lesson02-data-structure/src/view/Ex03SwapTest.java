package view;

import bean.CustomInt;

public class Ex03SwapTest {
	
	public static void main(String[] args) {
		int x1 = 5;
		int x2 = 7;
		swapInt(x1, x2);
		System.out.println("x1 --> " + x1);
		System.out.println("x2 --> " + x2);
		
		Integer z1 = 8;
		Integer z2 = 10;
		swapInteger(z1, z2);
		System.out.println("z1 --> " + z1);
		System.out.println("z2 --> " + z2);
		
		CustomInt c1 = new CustomInt(2);
		CustomInt c2 = new CustomInt(4);
		swapCustomInt(c1, c2);
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		
		
	}
	
	private static void swapCustomInt(CustomInt p1, CustomInt p2) {
		CustomInt temp = p1;
		p1 = p2;
		p2 = temp;
	}
	
	private static void swapInt(int p1, int p2) {
		int temp = p1;
		p1 = p2;
		p2 = temp;
	}
	
	private static void swapInteger(Integer p1, Integer p2) {
		Integer temp = p1;
		p1 = p2;
		p2 = temp;
	}
}
