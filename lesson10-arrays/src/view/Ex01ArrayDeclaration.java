package view;

import java.util.Arrays;

import bean.Item;

public class Ex01ArrayDeclaration {

	public static void main(String[] args) {
		//Khai bao va khoi tao mang
		
		// Mang la KDL doi tuong --> gia tri se duoc luu tai HEAP
		
		// Khai bao mang int[] co length = 5
		// gia tri mac dinh cuar tung phan tu la 0
		int[] digits = new int[5];
		
		// khai bao int[] cos length = 4
		//Gia tri cua cac phan tu tai vi tri 0123 tuong ung la 2 8 12 22
		int[] numbers = {2,8,12,22};
		//C2, thua 
		int[] statuses = new int[] {200, 500, 403};
		
		int[] generatedNumbers = generateNumbers();
		
		
		//[I@5ed828d
		//package + class --> [I
		// @ hashing
		System.out.println("Arrays "+ Arrays.toString(digits));
		System.out.println("Arrays "+ Arrays.toString(numbers));
		System.out.println("Arrays "+ Arrays.toString(statuses));
		System.out.println("Arrays "+ Arrays.toString(generatedNumbers));
		
		modify(generatedNumbers);
		System.out.println("/ngeneratedNumbers --> "+ Arrays.toString(generatedNumbers));
		
		Double[] prices = new Double[6];
		Double[] salesPrice = {2d,5d,null,8d,1d};
		Item[] items = {
				new Item(1,"A1",22d), 
				new Item(2,"A2",44d), 
				new Item(3,"A3",66d),
				
		};
		System.out.println("price"+Arrays.toString(prices));
		System.out.println("salesPrice"+Arrays.toString(salesPrice));
		System.out.println("price"+Arrays.toString(items));
	}
	
	private static void modify(int[] elements) {
		elements[1] = 999;
		
	}
	
	private static int[] generateNumbers() {
		return new int[] {1,2,3,4,5};
	}
}
