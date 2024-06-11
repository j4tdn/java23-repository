package video.array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item(123, 'c', 720.0);
		Item itemB = new Item(234, 'a', 260);
		Item itemC = new Item(345, 'b', 100);
		Item[] items = { itemA, itemB, itemC };
		Item[] result = filter(items);
//		System.out.println(Arrays.toString(result));
		for (Item item:result) {
			System.out.println(item);
		}
	}
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		for (Item item:items) {
			if (item.salesPrice > 200) {
				result[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
