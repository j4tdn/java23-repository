package view;

import bean.CustomInt;

public class Ex03SwapTest {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		//Không bao giờ cập nhập được biến qua hàm lưu trữ ở STACK -> KDL nguyên thuỷ
		swapInt(a,b);
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		
		Integer a1 = 8;
		Integer a2 = 10;
		
		swapInteger(a1,a2);
		System.out.println("a -> " + a1);
		System.out.println("b -> " + a2);
		
		CustomInt c1 = new CustomInt(3);
		CustomInt c2 = new CustomInt(10);
		swapCustomInt(c1, c2);
		System.out.println("a -> " + c1);
		System.out.println("b -> " + c2);
	}
	
	private static void swapInt (int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	private static void swapCustomInt(CustomInt a, CustomInt b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
	
	private static void swapInteger(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}
}
