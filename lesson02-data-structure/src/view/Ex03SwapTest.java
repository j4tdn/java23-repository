package view;

import bean.CustomInt;

public class Ex03SwapTest {
	
	public static void main(String[] args) {
		int x1 = 5;
		int x2 = 7;
		swapInt(x1, x2);
		System.out.println("x1" + x1);
		System.out.println("x2" + x2);
		
		Integer z1 = 8;
		Integer z2 = 10;
		swapInt(z1, z2);
		System.out.println("z1" + z1);
		System.out.println("z2" + z2);
		
		CustomInt c1 = new CustomInt(2);
		CustomInt c2 = new CustomInt(4);
		swapCustomInt(c1, c2);
		System.out.println("c2" + c2);
		System.out.println("c2" + c2);
		
		//khi truyền 1 biến qua hàm
		//100% ko thể cập nhập giá trị ở stack của biến đó
		
		//Nên muốn gọi hàm xong mà biến bên ngoài truyền ngoài truyền vào
		// có thể cập nhâp giá trị --> tìm cách cập nhập giá trị ở HEAP của nó

		
	}

	private static void swapCustomInt(CustomInt p1, CustomInt p2) {
		int temp = p1.value;
		p1.value = p2.value;
		p2.value = temp;
		
		// TODO Auto-generated method stub
		
	}

	private static void swapInt(int x1, int x2) {
		// TODO Auto-generated method stub
		
	}

	
}
