package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArraysDeclaration {

	public static void main(String[] args) {
		// Khai bao va khoi tao mang
		
		// Mang la KDL doi tuong --> Gia tri se dc luu tai HEAP
		
		// Khai bao mang int[] co length = 5
		// Gia tri mac dinh cua tung phan tu la 0
		int[] digits = new int[5];
		
		// Khai bao mang int[] co length = 4
		// Gia tri cua cac phan tu tai vi tri thu 0 1 2 3 tuong ung la 2 8 12 22
		int[] numbers = {2, 8, 12, 22};
		
		// Giong cach 2, thua new int[]
		// Su dung khi return nhanh mang trong ham
		int[] statuses = new int[] {200, 500, 403};
		
		int[] generatedNumbers = generateNumbers();
		
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("numbers --> " + Arrays.toString(numbers));
		System.out.println("statuses --> " + Arrays.toString(statuses));
		System.out.println("generatedNumbers --> " + Arrays.toString(generatedNumbers));
		
		modify(generatedNumbers);
		
		System.out.println("\ngeneratedNumbers --> " + Arrays.toString(generatedNumbers));
		
		// Mang doi tuong
		
		Double[] prices = new Double[6];
		Double[] salesPrice = {2d, 4d, 2.2d};
		Item[] items = {
			new Item(1, "A1", 22d),	
			new Item(2, "A2", 44d),	
			new Item(3, "A3", 66d),	
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
