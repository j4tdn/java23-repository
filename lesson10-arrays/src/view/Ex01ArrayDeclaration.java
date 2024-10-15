package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArrayDeclaration {

	
	public static void main(String[] args) {
		// Khai báo và khởi tạo mảng
		
		// Mảng là kiểu dữ liệu đối tượng nên giá trị sẽ đượ lưu tại HEAP
		
		// Khai báo một mảng int có length = 5
		// Giá trị mặc định của từng phần tử là 0
		
		int[] digits = new int[5];
		
		// Khai báo một mảng int có length = 4
		// Giá trị mặc định của từng phần tử là 0 1 2 3 tương ứng là 2 18 12 22
		int[] numbers = {2, 8, 12, 22};
		
		// giống cách số 2, thừa new int[]
		// sử dụng khi return nhanh mảng trong hàm
		int[] statuses = new int[] {200, 500, 403};
		
		int[] generatedNumbers = generateNumbers();
		
		//[I@7dc5e7b4
		// package + class --> [I
		// @ hashing
		System.out.println("digits --> " + digits.getClass());

		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("numbers --> " + Arrays.toString(numbers));
		System.out.println("statuses --> " + Arrays.toString(statuses));
		System.out.println("generatedNumbers --> " + Arrays.toString(generatedNumbers));

		modify(generatedNumbers);
		System.out.println("\ngenerated numbers -> " + Arrays.toString(generatedNumbers));
	
		// Mảng đối tượng
		
		Double[] prices = new Double[6];
		Double[] salesPrice = {2d, 5d, null, 8d, 1d};
		Item[] items = {
				new Item(1, "A1", 22d),
				new Item(2, "A2", 44d),
				new Item(3, "A3", 66d),
		};
		
		System.out.println("prices --> " + Arrays.toString(prices));
		System.out.println("salesPrice --> " + Arrays.toString(salesPrice));
		System.out.println("item --> " + Arrays.toString(items));
	}
	private static void modify(int[] elements) {
		elements[1] = 999;
	}
	
	private static int[] generateNumbers() {
		//int[] numbers = {1,2,3,4,5};  -->
		return new int[] {1,2,3,4,5};
	}
}
