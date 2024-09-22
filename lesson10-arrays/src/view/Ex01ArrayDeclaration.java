package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArrayDeclaration {

	public static void main(String[] args) {
		// Khai báo và khởi tạo mảng

		// Mảng là KDL đối tượng --> giá trị sẽ được lưu tại HEAP
		
		// Khai báo mảng int[] có length = 5
		// Giá trị mặc định của từng phần tử là 0
		int[] digits = new int[5];
		
		// Khai báo mảng int[] có length = 4
		// Giá trị của các phần tử tại vị trí thứ 0 1 2 3 tương ứng là 2 8 12 22
		int[] number = {2, 8, 12, 22};
		
		// Giống cách số 2, thừa new int[]
		// Sử dụng khi return nhanh mảng trong hàm
		int[] statuses = new int[] {200, 500, 403};
		
		int[] generatedNumbers = generateNumbers();
		
		// [I@515f550a
		// package + class --> [I
		// Hashing
		System.out.println("digit --> " + Arrays.toString(digits));
		System.out.println("digit --> " + Arrays.toString(number));
		System.out.println("digit --> " + Arrays.toString(statuses));
		System.out.println("digit --> " + Arrays.toString(generatedNumbers));
		
		modify(generatedNumbers);
		
		System.out.println("\ndigit --> " + Arrays.toString(generatedNumbers));
		
		// Mảng đối tượng
		
		Double[] prices = new Double[6];
		Double[] salesPrice = {2d, 5d, null, 8d, 1d};
		Item[] items = {
				new Item(1, "A1", 22d),
				new Item(2, "A2", 44d),
				new Item(3, "A3", 66d)
		};
		
		System.out.println("price --> " + Arrays.toString(prices));
		System.out.println("salesPrice --> " + Arrays.toString(salesPrice));
		System.out.println("items --> " + Arrays.toString(items));
		
	}
	
	private static int[] generateNumbers() {
		int[] numbers = {1, 2, 3, 4, 5};
		return numbers;
	}
	
	// int[] elements = generatedNumbers
	private static void modify(int[] elements) {
		elements[1] = 999;
	}
	
}
