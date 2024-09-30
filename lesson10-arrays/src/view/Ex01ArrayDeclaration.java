package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArrayDeclaration {

	public static void main(String[] args) {
//		Khai báo mảng int[] có length =5;
//		Gía trị mặc định của từng phần tử là 0 
//		Mảng là KDL đối tượng 	---> Gía trị sẽ được lưu tại HEAP
//		--> biến được lưu ở stack
		
		int[] digits  = new int[5];
		
//		Khai báo mảng int[] có length = 4
//		giá trị của các phần tử tại vị trí 0 1 2 3 tương ứng 2 8 12 22
		int[] numbers = {2,8,12,22};
		
//    giống cách 2 nhưng thừa new int[]
//		Sử dụng khi return nhanh mảng trong hàm
		int[] statues = new int[] {200,500,420};
		
		int[] generatedNumber = generateNumber();
		
		System.out.println("-->" +Arrays.toString(digits));
		System.out.println("-->" +Arrays.toString(numbers));
		System.out.println("-->" +Arrays.toString(statues));
		System.out.println("-->" +Arrays.toString(generatedNumber));
	
		modify(generatedNumber);
		System.out.println("\n-->" +Arrays.toString(generatedNumber));

		Double[] price = new Double[6];
		Double[] salesPrice = {2d,5d,null,8d,1d};
		Item[] items = {
				new Item(1,"A1",22d),
				new Item(2,"A2",44d),
				new Item(3,"A3",66d),
				
		};
		
		System.out.println("prices -->" +Arrays.toString(price));
		System.out.println("salesPrice -->" +Arrays.toString(salesPrice));
		System.out.println("items -->" +Arrays.toString(items));
}
	
	private static void modify(int[] elements) {
		elements[1] = 999;
	}
	
//	Ví dụ 
	private static int[] generateNumber() {
		return new int[] {2,8,12,22};
		
	}
	
}