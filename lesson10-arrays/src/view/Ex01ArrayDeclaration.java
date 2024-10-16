package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArrayDeclaration {
	public static void main(String[] args) {
		// Khai báo và khởi tạo mảng
		
		// Mảng là KDL đối tượng --> giá trị được lưu tại HEAP ( biến lưu ở STACK)
		
		
		// Khai báo mảng int[] có length = 5
		// Giá trị mặc định của từng phần tử là 0
		int [] digits = new int[5];
		
		
		// Khai báo mảng int[] có length = 4
		// Giá trị của các phần tử tại vị trí thứ 0 1 2 3 tương ứng là 2 8 12 22
		int [] numbers = {2, 8, 12, 22};
		
		// giống cách số 2, thừa new int[]
		// sử dụng khi return nhanh mảng trong hàm
		int[] statuses = new int[] {200, 500, 403};
		
		int[] generatedNumbers = generateNumbers();
		
		// [I@4d591d15
		// package + class --> [I
		// @ hashing
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("numbers --> " + Arrays.toString(numbers));
		System.out.println("statuses --> " + Arrays.toString(statuses));
		System.out.println("generatedNumbers --> " + Arrays.toString(generatedNumbers));
		
		modify(generatedNumbers);
		System.out.println("\ngeneratedNumbers --> " + Arrays.toString(generatedNumbers));
		
		// Mảng đối tượng
		
		Double[] prices = new Double[6];
		Double[] salePrice = {2d, 5d, null, 1d, 8d};
		
		Item[] items = {
				new Item(1, "A1", 22d),
				new Item(2, "A2", 12d),
				new Item(3, "A3", 32d),
		};
		 System.out.println("prices --> " + prices);
		 System.out.println("salePrice --> " + Arrays.toString(salePrice));
		 System.out.println("items --> " + Arrays.toString(items));


		
		
	}
	//int[] elements =  generatedNumbers
	
	private static void modify(int[] elements) {
		elements[1] = 999;
	}
	
	private static int[] generateNumbers() {
		int[] numbers = {1, 2, 3, 4, 5};
		return numbers;
	}

}
