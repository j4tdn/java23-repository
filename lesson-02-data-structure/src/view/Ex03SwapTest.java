package view;

public class Ex03SwapTest {
	public static void main(String[] args) {
		CustomInt c1 = new CustomInt(2);
		CustomInt c2 = new CustomInt(3);
		System.out.println("Before --- c1: " + c1 + "; c2: "+ c2);
		swapCustomInt(c1, c2);
		System.out.println("After --- c1: " + c1 + "; c2: "+ c2);
		
		// Khi truyền 1 biến qua hàm 
		// 100% k thể cập nhật giá trị ở stack của biến đó
		
		// Nên muốn gọi hàm xong mà biến bên ngoài truyền vào
		// có thể cập nhật giá trị --> tìm cách cập nhật giá trị heap của nó
	}
	private static void swapCustomInt(CustomInt p1, CustomInt p2) {
		int temp = p1.value;
		p1.value = p2.value;
		p2.value = temp;
	}
}
