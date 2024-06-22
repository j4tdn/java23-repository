package video_array;

import java.util.Arrays;

public class EX04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item(123,"Item 123",720);
		Item itemB = new Item(234,"Item 234",100);
		Item itemC = new Item(345,"Item 345",551);
		Item[] items = {itemA,itemB,itemC};
		System.out.println(Arrays.toString(items));
	}
	public static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		for(Item item : items) {
			if(item.price > 200) {
				result[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
