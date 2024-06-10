package video_array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item(123, "Item 123", 720);
		Item itemB = new Item(234, "Item 234", 260);
		Item itemC = new Item(345, "Item 345", 100);
		//Item[] items = { itemA, itemB, itemC, new Item(456, "Item 456", 200) };
		Item[] items = { itemA, itemB, itemC };
		Item[] result = filter(items);
		
		//System.out.println(Arrays.toString(result));
		
		for (Item item : result) {
			System.out.println(item);
		}
	}
	
	// Tìm những mặt hàng có giá lớn hơn 200
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		for (Item item : items) {
			if(item.price > 200) {
				result[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}