package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArrayDeclaration {
	
	public static void main(String[] args) {
		// Khai báo và khởi tạo mảng
		
		// Mảng là kdl đối tượng --> giá trị sẽ đc lưu tại HEAP
		
		// Khai báo mảng int[] có length = 5
		// Giá trị mặc định của từng phần tử là 0
		int[] digits = new int[5];
		
		// Khai báo mảng int[] có length = 4
		// Giá trị của các phần tử tại vị trí thứ 0 1 2 3 tương ứng là 2 8 12 22
		int[] numbers = {2, 8, 23, 22};
		
		// Giống cách số 2, thừa new int[]
		int[] statuses = new int[] {200, 500, 403};
		
		int[] generatedNumbers = generateNumbers();
		
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("numbers --> " + Arrays.toString(numbers));
		System.out.println("statuses --> " + Arrays.toString(statuses));
		System.out.println("generatedNumbers --> " + Arrays.toString(generatedNumbers));
		
		modify(generatedNumbers);
		
		System.out.println("\ngeneratedNumbers --> " + Arrays.toString(generatedNumbers)); 
		
		Double[] prices = new Double[6];
		Double[] salesPrices = {2d, 5d, null, 8d, 1d};
		Item[] items = {
				new Item(1, "A1", 22d),
				new Item(2, "A2", 44d),
				new Item(3, "A3", 66d),
		}; 
		
		System.out.println("prices --> " + Arrays.toString(prices));
		System.out.println("salesPrices --> " + Arrays.toString(salesPrices));
		System.out.println("items --> " + Arrays.toString(items));
	}
	
	private static void modify(int[] elements) {
		elements[1] = 999;
	}
	
	private static int[] generateNumbers() {
		return new int[] {1, 2, 3, 4, 115};
	}

}
