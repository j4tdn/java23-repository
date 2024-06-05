package view;

import bean.CustomInt;

public class Ex03SwapTest {
	public static void main(String[] args) {
     CustomInt c1 = new CustomInt(2);
     CustomInt c2 = new CustomInt(4);
     swapCustomInt(c1, c2);
     System.out.println("c1 -->"+c1 );
     System.out.println("c2 --> "+c2);
     
	}

	private static void swapCustomInt(CustomInt p1, CustomInt p2) {
		int temp = p1.value;
		p1.value = p2.value;
		p2.value = temp;
	}
}
