package video_array;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {

	public static void main(String[] args) {
		
		Item itemA = new Item(123, "Item123", 720);
		Item itemB = new Item(234, "Item234", 260);
		Item itemC = new Item(345, "Item345", 100);
		Item[] items = {itemA, itemB, itemC};
		Item[] result = filter(items);
		
		//System.out.println(Arrays.toString(items));
		
		for(Item item: result) 
			System.out.println(item);
	}
	//Tim nhung mat hang co gia lon hon 200
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		for(Item item: items)
			if(item.salesPrice > 200) {
				result[count] = item;
				count++;
			}
		return Arrays.copyOfRange(result, 0, count);
	}
}
