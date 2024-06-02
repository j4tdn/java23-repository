package view;

import bean.CustomInt;

public class Ex03SwapTest {
	public static void main(String[] args) {
		int x1 = 5;
		int x2 = 7;
		swapInt(x1, x2);
		System.out.println("x1 -->" + x1);
		System.out.println("x2 -->" + x2);
		
		Integer z1 = 8; //H1
		Integer z2 = 10; //H2
		swapInteger(z1, z2);
		System.out.println("z1 -->" + z1);
		System.out.println("z2 -->" + z2);
		
		CustomInt c1 = new CustomInt(2);
		CustomInt c2 = new CustomInt(4);
		swapCustomInt(c1, c2);
		System.out.println("c1-->" + c1);
		System.out.println("c2-->" + c2);
		
		// Khi truyền 1 biến qua hàm
		// 100% ko thể cập nhập giá trị ở stack của biến đó
		
		// Nên muốn gọi hàm xong mà biến bên ngoài truyền ngoài truyền vào
		// có thể cập nhập giá trị --> tìm cách cập nhập giá trị ở HEAP của nó
	}
	private static void swapCustomInt(CustomInt p1, CustomInt p2) {
		int temp = p1.value;
		p1.value = p2.value;
		p2.value = temp;
	}
	private static void swapInt(int p1, int p2) {
		int temp = p1;
		p1 = p2;
		p2 = temp;
	}
	private static void swapInteger(int p1, int p2) {
		int temp = p1;
		p1 = p2;
		p2 = temp;
	}
}
