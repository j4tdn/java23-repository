package sorting.quick;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex02SortingObject {
	public static void main(String[] args) {
		String[] elements = { "a123", "z44", "c1", "k6", "d28" };

		System.out.println("origin: " + Arrays.toString(elements));

		Arrays.sort(elements);

		System.out.println("sort" + Arrays.toString(elements));

		// Custom type

		Item[] items = DataModel.mockItems();

		// nếu chưa implements comparable -> lỗi
		Arrays.sort(items);

		printf("sorted(...)", items);
	}

	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for (Item item : items) {
			System.out.println("  + " + item);
		}
		System.out.println("}\n");
	}


}
