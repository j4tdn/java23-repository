package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArrayDeclaration {

	public static void main(String[] args) {
		// khai báo và khởi tao mảng
		
		// Màng là kiểu đối tượng --> giá trị sẽ được lưu tại HEAP
		// Biến thì được lưu tại STACK
		// khai báo mảng int [] có length = 5
		// Giá trị mặc định của từng phần tử là 0
		int[] digits = new int[5];
		
		// khai báo mảng int [] có length = 4
		// Giá trị của các phần tử tại vị trí thứ 0 1 2 3 tương ứng 2 3 4 5
		
		int [] number = {2,3,4,5};
		// giống cách 2 thừa new int[]
		int [] statuses = new int [] {200,300,654};
		
		int[]  generateNumber = generateNumber();
		
		System.out.println("digits" + Arrays.toString(digits));
		System.out.println("number" + Arrays.toString(number));
		System.out.println("statuses" + Arrays.toString(statuses));
		System.out.println("generateNumber" + Arrays.toString(generateNumber));
		modify(generateNumber);
		System.out.println("generateNumber" + Arrays.toString(generateNumber));
		// Mảng đối tượng 
		Double[] pricse = new Double[6];
		Double[] salesPrice = {2d,5d,null,8d,1d};
		Item[] item = {
			new Item(1,"a1",22d),	
			new Item(2,"a2",33d),
			new Item(3,"a3",66d),
		};
		System.out.println("prices" + Arrays.toString(pricse));
		System.out.println("salesPrice" +  Arrays.toString(salesPrice));
		System.out.println("prices" +  Arrays.toString(item));
	}
	private static int [] generateNumber() {
		// sử dụng return nhanh mảng trong hàm
		return new int [] {1,2,344,4};
	}
	private static void modify(int [] elements) {
		elements[1] = 99;
	}

}
