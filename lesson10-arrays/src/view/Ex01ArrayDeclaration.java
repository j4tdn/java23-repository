package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArrayDeclaration {

	public static void main(String[] args) {
		
		// Khai báo và khởi tạo mảng
		
		// Mảng là kiểu dữ liệu đối tượng
		// --> giá trị sẽ được lưu tại HEAP - biến lưu ở STACK
		
		// Khai báo mảng int[] có length = 5
		// Giá trị măc định của từng phẩn tử là 0
		int[] digits = new int[5];
		
		// Khai báo int[] có length = 4
		// Giá trị của các phần tử tại vị trí thứ 0 1 2 3 tương ứng là 2 8 12 22
		int[] numbers = {2, 8, 12, 22};
		
		// Giống cách số 2, thừa new int[]
		// Sử dụng khi return nhanh mảng trong hàm
		int[] statuses = new int[] {200, 500, 403};
		
		int[] generateNumbers = generateNumbers();
		
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("numbers --> " + Arrays.toString(numbers));
		System.out.println("statuses --> " + Arrays.toString(statuses));
		System.out.println("generateNumbers --> " + Arrays.toString(generateNumbers));
		
		modify(generateNumbers);
		
		System.out.println("\ngenerateNumbers --> " + Arrays.toString(generateNumbers));
		
		// Mảng đối tượng
		
		Double[] prices = new Double[6];
		Double[] salesPrice = {2d, 5d, null, 8d, 11d};
		Item[] items = {
				new Item(1, "A1", 22d),
				new Item(2, "A2", 44d),
				new Item(3, "A3", 55d)
		};
		
		System.out.println("prices --> " + Arrays.toString(prices));
		System.out.println("salesPrice --> " + Arrays.toString(salesPrice));
		System.out.println("items --> " + Arrays.toString(items));
		
	}
	private static void modify(int[] elements) {
		elements[1] = 999;
	}
	
	private static int[] generateNumbers() {
		return new int[] {1, 2, 3, 4, 5};
				
	}
}
