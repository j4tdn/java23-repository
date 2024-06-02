package view;

import bean.CustomInt;

public class Ex03SwapTest {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;
		SwapInt(a, b);

		CustomInt c = new CustomInt(2);
		CustomInt d = new CustomInt(4);
		swapCustomInt(c, d);

	}

	private static void swapCustomInt(CustomInt p1, CustomInt p2) {

		int temp = p1.value;
		p1.value = p2.value;
		p2.value = temp;
	}

	private static void SwapInt(int p1, int p2) {

		int temp = p1;
		p1 = p2;
		p2 = temp;
	}
}
